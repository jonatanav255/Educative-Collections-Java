package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 1. Basic ArrayList Operations
        System.out.println("=== Basic ArrayList Operations ===");
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");                    // Add element
        list.add(0, "Banana");               // Add at index
        System.out.println("After adds: " + list);
        list.set(1, "Cherry");               // Update element
        System.out.println("After set: " + list);
        list.remove("Cherry");               // Remove by value
        System.out.println("After remove: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Contains Banana: " + list.contains("Banana"));

        // 2. Iterating with for-each (most common)
        System.out.println("\n=== For-each Loop ===");
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 3. Iterating with index
        System.out.println("\n=== Index Loop ===");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(i + ": " + fruits.get(i));
        }

        // 4. Iterator - Safe removal during iteration
        System.out.println("\n=== Iterator with Removal ===");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Before: " + numbers);
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            Integer num = it.next();
            if (num % 2 == 0) {
                it.remove();  // Safe way to remove while iterating
            }
        }
        System.out.println("After removing evens: " + numbers);

        // 5. Iterator - forEachRemaining
        System.out.println("\n=== Iterator forEachRemaining ===");
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        Iterator<String> colorIt = colors.iterator();
        colorIt.forEachRemaining(color -> System.out.println(color));

        // 6. Bulk operations
        System.out.println("\n=== Bulk Operations ===");
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("A", "B"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("C", "D"));
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        list1.addAll(list2);           // Add all from list2
        System.out.println("After addAll: " + list1);
        list1.removeAll(list2);        // Remove all matching
        System.out.println("After removeAll: " + list1);
    }
}
