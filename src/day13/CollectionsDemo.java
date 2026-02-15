package day13;


    import java.util.*;

    public class CollectionsDemo {
        public static void main(String[] args) {

            // 🔹 LIST (Allows duplicates, maintains order)
            List<String> list = new ArrayList<>();

            // CREATE
            list.add("Apple");
            list.add("Banana");
            list.add("Apple");

            // READ
            System.out.println("List: " + list);

            // UPDATE
            list.set(1, "Mango");

            // DELETE
            list.remove("Apple");

            System.out.println("Updated List: " + list);


            // 🔹 SET (No duplicates)
            Set<String> set = new HashSet<>();

            set.add("Java");
            set.add("Python");
            set.add("Java");  // Duplicate ignored

            System.out.println("Set: " + set);

            set.remove("Python");

            System.out.println("Updated Set: " + set);


            // 🔹 MAP (Key-Value pairs)
            Map<Integer, String> map = new HashMap<>();

            map.put(1, "John");
            map.put(2, "Alice");

            System.out.println("Map: " + map);

            // UPDATE
            map.put(1, "Mike");

            // DELETE
            map.remove(2);

            System.out.println("Updated Map: " + map);
        }
    }


