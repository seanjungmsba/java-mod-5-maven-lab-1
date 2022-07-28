package org.example;

//import org.junit.Test;
import org.junit.jupiter.api.Test;

//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest
{
    @Test
    public void greetShoudReturnCorrectString() {
        String expected = "Hello, John!";
        String actual = App.greet("John");
        assertEquals(expected, actual);
    }
}