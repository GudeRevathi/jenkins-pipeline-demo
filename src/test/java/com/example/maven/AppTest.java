package com.example.maven;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void addsNumbers() {
        App app = new App();
        assertEquals(5, app.add(2, 3));
    }
    @Test
    public void subNumbers() {
        App app = new App();
        assertEquals(2, app.sub(5, 3));
    }
    @Test
    public void divNumbers() {
        App app = new App();
        assertEquals(4, app.mul(2, 2));
    }
}