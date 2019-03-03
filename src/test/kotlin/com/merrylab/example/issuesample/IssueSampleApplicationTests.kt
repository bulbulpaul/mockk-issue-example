package com.merrylab.example.issuesample

import io.mockk.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import java.time.LocalDateTime

@ExtendWith(SpringExtension::class)
@SpringBootTest
class IssueSampleApplicationTests {

    val exampleRepository = mockk<ExampleRepository>()

    val exampleService = ExampleService(exampleRepository)

    val ldt = LocalDateTime.of(2019, 3, 1, 0,0)

    @Test
    fun example() {
        every { exampleRepository.insert(User(1, "expect", ldt, ldt)) } just Runs

        exampleService.save(User(1, "expect", ldt, ldt))

        verify { exampleRepository.insert(User(1, "expect", ldt, ldt)) }
    }

    @Test
    fun error() {
        every { exampleRepository.insert(User(1, "expect", any(), any())) } just Runs

        exampleService.save(User(1, "expect", ldt, ldt))

        verify { exampleRepository.insert(User(1, "expect", any(), any())) }
    }

}
