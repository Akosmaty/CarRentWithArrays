package kos.maty;

public class Skoda implements Cars {
    public  String model;
    public String engine;
    public String color;



    public Skoda(String model, String engine, String color) {
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    public String getBrand() {
        return "Skoda";
    }

    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
    public String toString(){
        return "\n" + "Skoda " + model + " "+ color + " " + engine ;
    }


}



