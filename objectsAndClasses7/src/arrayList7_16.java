import java.util.ArrayList;

public class arrayList7_16 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(10);

        for (int i = 0; i < myList.size(); ++i) {
            System.out.println(myList.get(i));
        }

        int myInt = myList.get(0); // Explicit Unboxing

        System.out.println(myInt + 1);


    }
}
