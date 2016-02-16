package com.sample.domain

class Person {

    String name
    String email

    static constraints = {
	name nullable: true
	email email: true
    }
}
