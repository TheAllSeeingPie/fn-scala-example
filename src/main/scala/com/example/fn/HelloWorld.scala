package com.example.fn

object HelloWorld {
  def hello(value: Option[String]) = {
    "Hello, " + value.getOrElse("world") + "!"
  }
}