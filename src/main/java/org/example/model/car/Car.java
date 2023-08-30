package org.example.model.car;

public class Car {

    private Engine engine;
    private Transmission transmission;
    private Suspension suspension;
    private Wheels wheel;
    private Body body;

    public Car() {
        this.engine = new Engine();
        this.transmission = new Transmission();
        this.suspension = new Suspension();
        this.wheel = new Wheels();
        this.body = new Body();
    }

    public Car(Engine engine, Transmission transmission, Suspension suspension, Wheels wheel, Body body) {
        this.engine = engine;
        this.transmission = transmission;
        this.suspension = suspension;
        this.wheel = wheel;
        this.body = body;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Suspension getSuspension() {
        return suspension;
    }

    public void setSuspension(Suspension suspension) {
        this.suspension = suspension;
    }

    public Wheels getWheel() {
        return wheel;
    }

    public void setWheel(Wheels wheel) {
        this.wheel = wheel;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

//    public int getPower(){
//        int pow;
//
//        return pow;
//    }

}
