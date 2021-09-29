package bisdi.pertemuan05;

public class TestCircleWithStaticMembers {
    public static void main(String[] args){
        System.out.println("Sebelum membuat objek ");
        System.out.println("Jumlah objek circle yang ada "+ CircleB.numberOfObjects);

        System.out.println("----------------------");
        CircleB c1 = new CircleB();
        System.out.println("Setelah membuat objek c1");
        System.out.println("c1: radius ("+c1.radius+") dan jumlah objek circle menjadi "+c1.numberOfObjects);

        System.out.println("----------------------");
        CircleB c2 = new CircleB(5);
        c1.radius = 9;
        System.out.println("Setelah membuat objek c1 dan c2");
        System.out.println("c1: radius ("+c1.radius+") dan jumlah objek circle menjadi "+c1.numberOfObjects);
        System.out.println("c2: radius ("+c2.radius+") dan jumlah objek circle menjadi "+c2.numberOfObjects);

        System.out.println("----------------------");
        CircleB c3 = new CircleB();
        CircleB c4 = new CircleB();
        System.out.println("Total circle yang ada "+c1.numberOfObjects);
        System.out.println("Total circle yang ada "+c2.numberOfObjects);
        System.out.println("Total circle yang ada "+c3.numberOfObjects);
        System.out.println("Total circle yang ada "+c4.numberOfObjects);
//        System.out.println("Total circle yang ada "+c5.numberOfObjects);

    }
}



