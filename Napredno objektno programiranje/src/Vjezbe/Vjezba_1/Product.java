package Vjezbe.Vjezba_1;

import java.util.Arrays;

public abstract class Product {
    String type;
    private String name;
    public double cijena;
    private String[] spices;

    public abstract double countPrice();

    public Product(String name, double cijena){
        this.name = name;
        this.cijena = cijena;
        this.spices = new String[10];
    }

    public void addSpice(String spice){
        for(int i = 0; i < this.spices.length; i++){
            if(this.spices[i] == null){
                this.spices[i] = spice;
                break;
            }
        }
    }
    @Override
    public String toString() {

        StringBuilder output = new StringBuilder();

        output.append("Product: ");
        output.append(this.name).append(", ");
        output.append("price: ").append(countPrice()).append(", ");
        output.append("spices: ").append(allSpices());

        return output.toString();
    }

    public String allSpices() {

        StringBuilder output = new StringBuilder();

        for (String addition : this.spices)
            if (addition != null)
                output.append(addition).append(", ");


        if (!output.toString().equals(""))
            if (output.toString().trim().endsWith(","))
                output.replace(output.length() - 2, output.length() , "");
            else
                output.append("no spices");

        return output.toString();
    }


}
/**
 * drugi nacin pravljenja metoda allSpices i toString
 *
 * public String allSpices(){
 *         String allSpices = null;
 *         for(String a : spices){
 *             if(a != null){
 *                 allSpices = a + " ";
 *             }
 *         }
 *         if(allSpices == null){
 *             return "no spices";
 *         }else{
 *             return allSpices;
 *         }
 *     }
 *
 *     @Override
 *     public String toString() {
 *         return "Product: " +
 *                  type +
 *                 ", price: " + countPrice() +
 *                 ", spices: " + allSpices();
 *     }
 */
