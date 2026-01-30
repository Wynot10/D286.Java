import java.util.LinkedList;


public class listInterface7_16 {
    public static void main(String[] args) {
    LinkedList<Integer> myList = new LinkedList<Integer>();

    myList.add(20);
    myList.add(30);
    myList.add(10);


    for (int i = 0; i < myList.size(); i++) {
        System.out.println(myList.get(i));
    }
    }
}
