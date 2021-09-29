package bisdi.pertemuan05;

public class CircleB {
        double radius;

        static int numberOfObjects = 0;

        CircleB(){
            radius = 1;
            numberOfObjects++;
        }

        CircleB(double newRadius){
            radius = newRadius;
            numberOfObjects++;
        }

        static int getNumberOfObjects(){
            return numberOfObjects;
        }
 }


