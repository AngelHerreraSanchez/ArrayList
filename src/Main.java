import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Orange");
        arrayList.add("Mango");


        System.out.println("ArrayList: " + arrayList);

        arrayList.remove(2);

        System.out.println("ArrayList: " + arrayList);

    }
}
