package bisdi.pertemuan05;

class Student{
    String name;
    int age;
    boolean isScienceMajor;
    char gender;
}

public class TestStudent {
    public static void main(String[] args){
        Student student = new Student();
        System.out.println("Name? "+student.name);
        System.out.println("Age? "+student.age);
        System.out.println("Is science major? "+student.isScienceMajor);
        System.out.println("Gender? "+student.gender);
    }
}

class TestLocalVariables{
    public static void main(String[] args){
        int x = 0;
        String y = "";
        System.out.println("x is "+x);
        System.out.println("y is "+y);
    }
}






