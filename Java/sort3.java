// Name: Eric Yvorchuk
// Student Number: V00864667

import java.util.*;

public class sort3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = input.nextInt();
        System.out.print("Enter y: ");
        int y = input.nextInt();
        System.out.print("Enter z: ");
        int z = input.nextInt();
        System.out.print("In ascending order: ");
        if (x <= y && y <= z) {
        	System.out.print(x + " ");
     		System.out.print(y + " ");
     		System.out.print(z);
     	} else if (x <= z && z <= y) {
     		System.out.print(x + " ");
     		System.out.print(z + " ");
     		System.out.print(y);
     	} else if (y <= x && x <= z) {
     		System.out.print(y + " ");
     		System.out.print(x + " ");
     		System.out.print(z);
     	} else if (y <= z && z <= x) {
     	    System.out.print(y + " ");
     	    System.out.print(z + " ");
     	    System.out.print(x);
     	} else if (z <= x && x <= y) {
     		System.out.print(z + " ");
     		System.out.print(x + " ");
     		System.out.print(y);
     	} else if (z <= y && y <= x) {
     		System.out.print(z + " ");
     		System.out.print(y + " ");
     		System.out.print(x);
     	}
     	System.out.println();
    }
}     
     	