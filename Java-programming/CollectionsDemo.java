import java.util.*;

public class CollectionsDemo {

    public static void main(String args[]) {

        // Creating an ArrayList
        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Amit");
        students.add("Priya");

        // Sorting the list
        Collections.sort(students);

        System.out.println("Students");

        // Iterating through the ArrayList
        for (String s : students)

            System.out.println(s);

        // Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Rahul");
        map.put(102, "Priya");

        System.out.println("\nStudent Directory");

        System.out.println(map);

    }

}