package kos.maty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {


    public static void main(String[] args) {

   /*
        System.out.println("Alfa romeo: ");
        Cars one = new BMW("Mito ","1555cc ","Yellow ");
        System.out.println(one.getOutData());
        Cars two = new BMW("Gulia ","3200cc ","Black ");
        System.out.println(two.getOutData());
        Cars newOne = new BMW("4C ","1750cc ","Blue ");
        System.out.println(newOne.getOutData());
        Cars newTwo = new BMW("Gulietta ","2000cc ","Violet ");
        System.out.println(newTwo.getOutData());
        System.out.println("Skoda: ");
        Cars shrot = new BMW("ocvtavia ","1600cc ","grey ");
        System.out.println(shrot.getOutData());
        Cars shrot2 = new BMW("felcia ","1400cc ","silver ");
        System.out.println(shrot2.getOutData());
        */

        ArrayList<Cars> carsToRent = new ArrayList<Cars>();

        carsToRent.add(new BMW("550","5000cc ","Violet "));
        carsToRent.add(new BMW("i7","400kw ","Black "));
        carsToRent.add(new BMW("m3","5000cc ","Red "));
        carsToRent.add(new BMW("740","4000cc ","Yellow "));
        carsToRent.add(new Alfa("Gulia","3200cc ","Red"));
        carsToRent.add(new Alfa("Gulietta","1400cc ","Oragne"));
        carsToRent.add(new Alfa("MiTo","1400cc ","Blue"));
        carsToRent.add(new Alfa("4C","1750cc ","White"));
        carsToRent.add(new Skoda("Octavia","1600cc ","Sivler"));
        carsToRent.add(new Skoda("Fabia","1400cc ","Green"));
        carsToRent.add(new Skoda("Superb","2000cc ","Grey"));
        carsToRent.add(new Skoda("Kodiaq","1800cc ","Purple"));


        System.out.println(Arrays.toString(carsToRent.toArray()));


        for (int i = 0; i<carsToRent.size();i++){
            System.out.println(carsToRent.get(i));

        }

    }
}
