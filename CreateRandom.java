package bisdi.pertemuan05;

import java.util.Random;

public class CreateRandom {
    public static void main(String[] args){
        Random generator1 = new Random();
        int totalNumber = 20;
        System.out.println("Generator 1 menghasilkan: "+totalNumber+" bilangan random.");
        for (int i =0; i < totalNumber; i++)
            System.out.print(generator1.nextInt(1000)+" ");
        System.out.println(" ");

        Random generator2 = new Random();
        System.out.println("Generator 2 menghasilkan: "+totalNumber+" bilangan random.");
        for (int i =0; i < totalNumber; i++)
            System.out.print(generator2.nextInt(1000)+" ");
    }
}



