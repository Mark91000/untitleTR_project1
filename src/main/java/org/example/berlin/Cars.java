package org.example.berlin;

public class Cars {

    final int WEIGT = 1300;
    private String model_outside = "audi";

    public Cars(){
        System.out.println("Hallo from Berlin cars");

    }
         public void registration () {
        String model = "c200";
        System.out.println(model + ", registered");

    }
        public void  deregistration (String model) {
        model_outside = model;
        System.out.println(model_outside+ ", deregistred");


    }
    public String getModel_outside(){
        return  model_outside;
    }
}
