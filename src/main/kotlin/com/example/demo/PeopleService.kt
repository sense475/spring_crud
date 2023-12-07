package com.example.demo

import org.springframework.stereotype.Service

@Service
class PeopleService(private val personRepository: PersonRepository) {
    fun getAllPeople(): List<People> {
        return personRepository.findAll()
    }
    fun createPerson(person: PeopleRequest): People {
        return personRepository.save(People(0, person.firstName, person.lastName, person.age, person.email))
    }
    fun getPersonById(id: Int): People {
        return personRepository.findById(id).orElseThrow { Exception("Person not found") }
    }

    fun getDefaultPerson(): People {
        return People(0, "John", "Doe", 0, "sense")
    }
}
