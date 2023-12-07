package com.example.demo

import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository : JpaRepository<People, Int>