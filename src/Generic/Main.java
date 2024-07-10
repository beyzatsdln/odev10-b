public class Main {
    public static void main(String[] args) {

        Generic<Integer> i = new Generic<>();
        i.setObject(100);
        System.out.println(i.getObject());


        Generic<String> s = new Generic<>();
        s.setObject("Test");
        System.out.println(s.getObject());


        Generic<Boolean> b = new Generic<>();
        b.setObject(true);
        System.out.println(b.getObject());


        Generic<Double> d = new Generic<>();
        d.setObject(2.9);
        System.out.println(d.getObject());


    }
}