package org.example.model.car;

import static org.junit.jupiter.api.Assertions.*;

class EngineTest {

    Engine engine = new Engine();

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals("21114", engine.getName());
    }

    @org.junit.jupiter.api.Test
    void setName() {
    }

    @org.junit.jupiter.api.Test
    void getPower() {

    }

    @org.junit.jupiter.api.Test
    void setPower() {
    }

    @org.junit.jupiter.api.Test
    void getWear() {

    }

    @org.junit.jupiter.api.Test
    void setWear() {
    }

    @org.junit.jupiter.api.Test
    void racePower() {
        double tmp = engine.getWear();
        assertEquals(90, engine.racePower());
        assertEquals(0.01, engine.getWear());
        assertEquals(90 - 0.01, engine.racePower());
        assertEquals(0.02, engine.getWear());
        assertEquals(90 - 0.02, engine.racePower());
        assertEquals(0.03, engine.getWear());
    }
}