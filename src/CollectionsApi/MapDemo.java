package CollectionsApi;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String a[]){

        Map<String, Integer> students = new HashMap<>();

        students.put("Ali",8);
        students.put("Sonia",16);
        students.put("Med",12);
        students.put("Ahmed",18);
        students.put("Ali",13);

        System.out.println(students.get("Ahmed"));
        System.out.println(students);

        System.out.println(students.keySet());
    }
}
