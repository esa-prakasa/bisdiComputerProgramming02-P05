package bisdi.pertemuan05;

import java.util.Date;

public class ShowElapsedTime {
public static void main(String[] args){
    java.util.Date todayDate = new java.util.Date();
    System.out.println("Waktu yang terlewati sejak 1 Jan 1970 adalah "+todayDate.getTime()+" milliseconds");
    System.out.println(todayDate.toString());
}
}


