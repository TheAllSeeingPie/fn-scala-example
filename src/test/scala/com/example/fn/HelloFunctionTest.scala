package com.example.fn

import com.fnproject.fn.testing.FnTestingRule
import org.scalatest.{FlatSpec, Matchers}

 class HelloFunctionTest extends FlatSpec with Matchers {
   val testing = FnTestingRule.createDefault();

    "HelloWorld" should "greet appropriately" in {
        testing.givenEvent().enqueue();
        testing.thenRun(classOf[HelloWorld], "hello")

        val result = testing.getOnlyResult()
        result.getBodyAsString() should be ("Hello, world!")
    }

}