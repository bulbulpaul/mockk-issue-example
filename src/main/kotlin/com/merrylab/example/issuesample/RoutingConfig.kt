package com.merrylab.example.issuesample

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.router

@Configuration
class RoutingConfig {

    @Bean
    fun router() = router {
        accept(MediaType.TEXT_PLAIN).nest {
            GET("/")
        }
    }
}