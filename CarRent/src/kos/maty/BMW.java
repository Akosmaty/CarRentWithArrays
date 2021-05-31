package kos.maty;

public class BMW implements Cars {
    public  String model;
    public String engine;
    public String color;
    public  String outData;


    public BMW(String model, String engine, String color) {
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    public String getBrand() {
        return "BMW";
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
        return "\n" + "BMW  " + model + " "+ color + " " + engine ;
    }


}



