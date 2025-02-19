package org.example
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@SpringBootApplication
open class FirstProjectApplication

fun main(args: Array<String>) {
    runApplication<FirstProjectApplication>(*args)
}

@Controller
class HelloController {
    @GetMapping("/")
    @ResponseBody
    fun hello(): String {
        return "Hello World!"
    }
}