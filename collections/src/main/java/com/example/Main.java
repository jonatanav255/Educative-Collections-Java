package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("3");
        list.set(1, "4");

        list.contains("1");

        // System.out.println(list);
        // for (String element : list) {
        //     System.out.println(element);
        // }
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.println(list.get(i));
        // }
        // List<String> names = Arrays.asList("John", "Jane", "Bob");
        List<String> names = new ArrayList<>(Arrays.asList("John", "Jane",
                "Bob"));

        Iterator<String> it = names.iterator();
            it.forEachRemaining(element -> System.out.println(element));

        while (it.hasNext()) {
            // String name = it.next();

            // if ("john".equals(name)) {
            //     it.remove();
            // }
            // System.out.println(name);
        }
// Output: John, Jane, Bob
        // List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        //     Iterator<Integer> example = numbers.iterator();
        //     while (example.hasNext()) {
        //         Integer num = example.next();
        //         if (num % 2 == 0) {
        //             example.remove();  // Remove even numbers safely
        //         }
        //     }
        //     System.out.println(numbers);  // [1, 3, 5]
        // }
    }
}
