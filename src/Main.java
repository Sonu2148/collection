import java.util.*;

public class Main {

    public static void main(String[] args) {


        // Set example (HashSet) duplicates not allowed,unordered, used to maintain uniqueness
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("JavaScript");
        hashSet.add("Java");
        hashSet.add("java");
        System.out.println("\nHashSet (Set): " + hashSet);
        System.out.println("Does HashSet contain JavaScript :" + hashSet.contains("JavaScript"));

        // Map duplicate values ,unique key
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Java");
        hashMap.put(2, "Python");
        hashMap.put(3, "JavaScript");
        hashMap.put(4, "JavaScript");
        hashMap.put(1, "C++");
        System.out.println("\nHashMap (Map): " + hashMap);
        System.out.println("Value for key 1 in HashMap: " + hashMap.get(1));

        // Queue example (LinkedList)
        Queue<String> queue = new LinkedList<>();
        queue.add("Task1");
        queue.add("Task2");
        queue.add("Task3");
        queue.add("Task4");
        System.out.println("\nQueue before polling (Queue): " + queue);
//        queue.poll();  // Removes Task1
        System.out.println("Queue after polling (Queue): " + queue);
        // Queue offers peek, which gets the head without removal
        System.out.println("Head of Queue using peek: " + queue.peek());
    }
}
