package Vehicules;


public class Vehicule {

    protected String plateNumber;
    protected int make;
    protected String model;
    protected int year;
    
    
    public Vehicule(){
        this.make = 0;
        this.model = "No model";
        this.year = 0;
    }

    public Vehicule(int make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Vehicule(Vehicule vehicule){
        this.make = vehicule.make;
        this.model = vehicule.model;
        this.year = vehicule.year;
    }

    public String getPlateNumber(){return this.plateNumber;}

    public int getMake(){return this.make;}

    public String getModel(){return this.model;}

    public int getYear(){return this.year;}

}

