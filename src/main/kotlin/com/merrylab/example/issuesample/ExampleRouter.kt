//package com.merrylab.example.issuesample
//
//import org.springframework.web.bind.annotation.PostMapping
//import org.springframework.web.bind.annotation.RequestBody
//import org.springframework.web.bind.annotation.RestController
//import org.springframework.web.reactive.function.server.ServerResponse
//import reactor.core.publisher.Mono
//
//
//@RestController
//class ExampleRouter(val exampleService: ExampleService) {
//
//    @PostMapping(path = arrayOf("/user"))
//    fun addUser(@RequestBody user: User): Mono<ServerResponse> {
//        exampleService.save(user)
//        return ServerResponse.noContent().build()
//    }
//}