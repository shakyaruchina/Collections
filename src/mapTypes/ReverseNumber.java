package mapTypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ReverseNumber {
	
	public static<T> List<T> reverseList(List<T> numbers){
		List<T> reverse = new ArrayList<>(numbers);
		
		//method
		Collections.reverse(reverse);
		return reverse;
		
		
	}

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>(100);
		//for loop to print 1to 100
		for(int i=1; i<=100; i++) {
			numbers.add(i);
			System.out.println(numbers.get(i-1));
			
			
		}
		
		//printing reverse of the list
		List<Integer> reverse = reverseList(numbers);
		System.out.println(reverse);
		

	}

}
