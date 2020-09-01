import java.util.ArrayList;

import java.util.Collections;


public class TestProgram {
    public static void main(String[]args){
        ArrayList arr = new ArrayList();
        arr.add(5);
        arr.add(66);
        arr.add(12);
        arr.add(87);
        arr.add(66);
        arr.add(56);
        arr.add(89);
        arr.add(66);



        int numberToFind = 89;
        boolean finding = arr.contains(numberToFind);
        if(finding){

            System.out.println(numberToFind+" fundet");
        }else {
            System.out.println("fandt ikke nummeret");
        }
        int occurency = Collections.frequency(arr, 66);
        System.out.println("Hvor mange gange forkommer 66? "+occurency+" gange");

        int numberToDeleted = 87;
        boolean isDeleted = arr.remove(new Integer(numberToDeleted));
        if(isDeleted){

            System.out.println("Tællet 87 er slettet");
        }else{
            System.out.println("fandt ikke 87");
        }



        }


    }

