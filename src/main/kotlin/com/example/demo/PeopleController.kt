package com.example.demo

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/people")
class PeopleController(
        val people: PeopleService
){
    @GetMapping
    fun getAllPeople(): List<People> {
        return people.getAllPeople()
    }

    @PostMapping
    fun createPerson(@RequestBody person: PeopleRequest): People {
        return people.createPerson(person)
    }

    @GetMapping("/{id}")
    fun getPersonById(@PathVariable id: Int?): People {
        // Handle the case where id is null or 0 if needed
        if (id == null || id == 0) {
            // Handle the case where id is not provided or is invalid
            // For example, you might want to return an error response or a default person
            // You can customize this part based on your requirements.
            // For now, let's assume you have a method in the 'people' service to handle this.
            return people.getDefaultPerson()
        }

        return people.getPersonById(id)
    }
}