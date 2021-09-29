package bisdi.pertemuan05;

import java.util.Scanner;

public class NilaiRupiah {
    static final double KURS = 14262;
    public static void main(String[] args){

        System.out.println("Masukkan nilai USD yang akan ditukar? ");
        Scanner inputUSD = new Scanner(System.in);
        double usdAmount = inputUSD.nextDouble();

        System.out.println("Jumlah Rupiah hasil tukar dari "+usdAmount+" USD adalah "+String.format("%,.2f\n",KURS*usdAmount)+" IDR");

    }
}

