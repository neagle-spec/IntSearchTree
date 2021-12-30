// Chapter 17 Binary Search Tree Code Along
// Author:      Aaron Neagle
// Date:        12/9/2021
// Filename:    IntSearchTree.java

// This program tests the IntSearchTree class by constructing a
// binary search tree of integers and printing its contents as
// well as its structure.

import java.util.*;

public class IntSearchTreeClient {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        IntSearchTree numbers = new IntSearchTree();
        System.out.print("Next int (0 to quit)? ");
        int number = console.nextInt();
        while (number != 0) {
            numbers.add(number);
            System.out.print("Next int (0 to quit)? ");
            number = console.nextInt();
        }
        System.out.println();

        System.out.println("Tree Structure:");
        numbers.printSideways();
        System.out.println("Sorted list:");
        numbers.print();

        //new code to exercise/call added public methods
        // (sum, countLevels, countLeaves, printPreorder, printPostorder).
        System.out.println("Sum: " + numbers.sum());
        System.out.println("Levels: " + numbers.countLevels());
        System.out.println("Leaves: " + numbers.countLeaves());
        numbers.printPreorder();
        numbers.printPostorder();




    }
}
