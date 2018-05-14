package com.example.fn

class HelloWorld {
  def hello(input: String) = {
    val value = input match {
      case "" => None
      case null => None
      case _ => Some(input)
    }
    "Hello, " + value.getOrElse("world") + "!"
  }
}