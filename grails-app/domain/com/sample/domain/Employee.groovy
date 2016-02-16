package com.sample.domain

class Employee extends Person{

    String contactNo

    static constraints = {
	importFrom Person
	contactNo nullable: true
    }
}
