package com.quadrified.firstapp

import java.io.Serializable

// Serializable => to parse class when passing between activities

data class Person(val name: String, val age: Int, val country: String) : Serializable