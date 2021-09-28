package bisdi.pertemuan05;

public class Test {
    public static void main(String[] args){
        A a = new A("Hello" +
                "" +
                "");
        a.print();
    }

    static class A{
        String s;

        A(){
        }

        A(String newS){
            s = newS;
        }

        public void print(){
            System.out.println(s);
        }
    }
}
