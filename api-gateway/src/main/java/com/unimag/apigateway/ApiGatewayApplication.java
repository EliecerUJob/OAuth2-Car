package com.unimag.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.cloud.gateway.server.mvc.filter.LoadBalancerFilterFunctions.lb;
import static org.springframework.cloud.gateway.server.mvc.filter.TokenRelayFilterFunctions.tokenRelay;
import static org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions.route;
import static org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions.http;
import static org.springframework.cloud.gateway.server.mvc.predicate.GatewayRequestPredicates.path;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class ApiGatewayApplication {


    @Bean
    public RouterFunction<ServerResponse> gatewayRouterFunctionsLoadBalancer() {
        return route("bookingService")
                .route(path("/booking/**"), http())
                .route(path("/getBookingById"), http())
                .route(path("/createBooking"), http())
                .filter(lb("bookingService"))
                .filter(tokenRelay())
                .add(route("carInventory")
                        .route(path("/listAvailableCar/**"), http())
                        .route(path("/reserve/**"), http())
                        .route(path("/return/**"), http())
                        .filter(lb("carInventory"))
                        .filter(tokenRelay())
                        .build())
                .add(route("paymentService")
                        .route(path("/getPaymentById/**"), http())
                        .route(path("/processPayment/**"), http())
                        .filter(lb("paymentService"))
                        .filter(tokenRelay())
                        .build())
                .add(route("customerService")
                        .route(path("/saveCustomer/**"), http())
                        .route(path("/getCustomer/**"), http())
                        .filter(lb("customerService"))
                        .filter(tokenRelay())
                        .build())
                .build();
    }

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

}
