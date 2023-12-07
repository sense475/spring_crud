package com.example.demo

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
public data class People(
        @Id
        val id: Int,
        val firstName: String,
        val lastName: String,
        val age: Int?,
        val email: String?
) {
    constructor() : this(0, "", "", null, null)
}

data class PeopleRequest(
        val firstName: String,
        val lastName: String,
        val age: Int?,
        val email: String?
) {
    constructor() : this("", "", null, null)
}

data class PeopleResponse(
        val id: Int,
        val firstName: String,
        val lastName: String,
        val age: Int?,
        val email: String?
) {
    constructor() : this(0, "", "", null, null)
}