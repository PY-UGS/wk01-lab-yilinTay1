package wk01_Lab;

import java.util.Scanner;

public class wk01_lab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Example 2 (A)
        System.out.println("Example 2 (A)");
        System.out.println("Hello, I am [Yi Lin]!");

        // Example 2 (B)
        System.out.println("Example 2 (B)");
        System.out.println("Enter Module Code: ");
        String moduleCode = input.nextLine();  // Read user input
        switch(moduleCode)
        {
    case "CSC1006":
        System.out.println("Mathematics 2");
        break;
    case "CSC1007":
        System.out.println("Operating Systems");
        break;
    case "CSC1008":
        System.out.println("Data Structure and Algorithm");
        break;
    case "CSC1009":
        System.out.println("Object Oriented Programming");
        break;
    case "CSC1010":
        System.out.println("Computer Networks");
        break;
    default:
        System.out.println("Unknown Module");
        break;
}

        // Example 2 (C)
        System.out.println("Example 2 (C)");
        for (int i = 102; i >= 66; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
