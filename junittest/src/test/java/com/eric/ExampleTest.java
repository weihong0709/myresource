package com.eric;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
    @Test
    void exceptionTesting() {
        String test = "sss";
        Predicate predicate = (Object aa)-> aa.equals("dd");
        Executable closureContainingCodeToTest = ()->{throw new IllegalArgumentException("a message");};

        assertThrows(IllegalArgumentException.class, closureContainingCodeToTest, "a message");
    }
}