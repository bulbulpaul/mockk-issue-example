package com.merrylab.example.issuesample

import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service
import java.time.LocalDateTime

data class User(val id: Long, val name: String, val createTimestamp: LocalDateTime, val updateTimestamp: LocalDateTime)

@Service
class ExampleService(val exampleRepository: ExampleRepository) {

    fun save(user: User) {
        exampleRepository.insert(user)
    }

}


@Repository
class ExampleRepository {

    fun insert(user: User) {

    }
}