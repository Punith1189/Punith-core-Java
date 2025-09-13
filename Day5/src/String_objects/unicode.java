package String_objects;

import java.util.Scanner;

public class unicode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);  
        int unicode = ch; 
        System.out.println("Unicode value of '" + ch + "' is: " + unicode);
    }
}

