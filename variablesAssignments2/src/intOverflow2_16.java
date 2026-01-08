public class intOverflow2_16 {
    public static void main(String[] args) {
        int num;

        num = 100;
        num = num * 100;
        System.out.println("num: " + num);

        num = num * 100;
        System.out.println("num: " + num);

        num = num * 100;
        System.out.println("num: " + num);

        num = num * 100;
        System.out.println("num: " + num);

        num =  num *  100; // overflow occurs
        System.out.println("num: " + num);

        num = num * 100; // result after overflow
        System.out.println("num: " + num);
    }
}
