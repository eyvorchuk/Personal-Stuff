import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
    	Scanner prompt = new Scanner(System.in);
    	System.out.print("How many terms? ");
    	int terms = prompt.nextInt();		
    	int[] sequence;
    	if (terms == 1) {
    		sequence = new int[1];
    		sequence[0] = 1;
    	} else if (terms == 2) {
    		sequence = new int[2];
    		sequence[0] = sequence[1] = 1;
    	} else {		
    		sequence = fib(terms);
    	}	
    	System.out.print(sequence[0]);
    	for (int index = 1; index < sequence.length; index++) {
    		System.out.print(", " + sequence[index]);
    	}
    	System.out.println();	
    }
    
    public static int[] fib(int terms) {
    	int [] data = new int[terms];
    	data[0] = data[1] = 1;
    	for (int index = 2; index < terms; index++) {
    		data[index] = data[index - 1] + data[index - 2];
    	}
    	return data;
    }
}    			