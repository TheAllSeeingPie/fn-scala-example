package com.example.fn;

import scala.Console;
import scala.None;
import scala.Option;
import scala.Some;

import java.util.Optional;

public class HelloFunction {

    public String handleRequest(String input) {
        Optional<String> name = input != null && !input.isEmpty() ? Optional.ofNullable(input) : Optional.empty();
        return HelloWorld$.MODULE$.hello(name.isPresent() ? new Some<>(name.get()) : Option.apply(null));
    }
}