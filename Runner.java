import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");

//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");

//        3. Add "Islay" after "Jura" and before "Mull"
        int index = scottishIslands.indexOf("Jura");
        scottishIslands.add(index + 1, "Islay");

//        4. Print out the index position of "Skye"
        System.out.println("Skye index: " + scottishIslands.indexOf("Skye"));

//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");

//        6. Remove "Arran" from the list by index
        scottishIslands.remove(scottishIslands.indexOf("Arran"));

//        7. Print the number of islands in your arraylist
        System.out.println("Number of islands: " + scottishIslands.size());

//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);

//        9. Print out all the islands using a for loop
        for (String island : scottishIslands) {
            System.out.println(island);
        }

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
           if (number % 2 == 0) {
               evenNumbers.add(number);
           }
        }
        System.out.println("Even numbers: " + evenNumbers);

//        2. Print the difference between the largest and smallest value
        int largest = Collections.max(numbers);
        int smallest = Collections.min(numbers);
        System.out.println("Difference between the largest and smallest value: " + (largest - smallest));

//        Collections. min() and Collections. max() method

//        3. Print True if the list contains a 1 next to a 1 somewhere.
        boolean containsDoublesOnes = false;
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) == 1 && numbers.get(i + 1) == 1) {
                containsDoublesOnes = true;
                break;
            }
        }

//        4. Print the sum of the numbers,
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers is: " + sum);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.
        int specialSum = 0;
        boolean skipNext = false;
        for (Integer number : numbers) {
            if (number == 13) {
                skipNext = true;
                continue;
            }
            if (!skipNext) {
                specialSum += number;
            }    else {
                    skipNext = false;
                }
            }
            System.out.println("The Special sum is " + specialSum);
        }
        // break; stops the loop
        // continue; everything in array apart from number specified

    }


