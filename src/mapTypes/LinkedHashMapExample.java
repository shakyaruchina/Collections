package mapTypes;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		
		//Creating a LinkedHashMap
		LinkedHashMap<Integer, String> sampleMapping = new LinkedHashMap<>();
		
		//Adding new key-value pairs in LinkedHashMap
		
		sampleMapping.put(3, "Jessica");
		sampleMapping.put(4, "Lia");
		sampleMapping.put(2, "Taylor");
		sampleMapping.put(5, "Adele");
		sampleMapping.put(1, "Selena");
		
		//printing the key-values
		System.out.println(sampleMapping);
		
		//setting the integer to keySet
		//if there is same type of key and value we can assign it with this set method
		Set<Integer> set = sampleMapping.keySet();
		
		System.out.println("Output with key values : ");
		
		//Using entrySet iteration(forEach and lambda)
		//printing only key values
		sampleMapping.entrySet().forEach(entry ->{
			System.out.println(entry.getKey());
		});
		
		System.out.println("After sorting according to key values in natural order: ");
		
		//Converting to treemap to sort 
		Map<Integer,String> convertIntoTreeMap = new TreeMap<Integer,String>(sampleMapping);
		
		//using for loop to iterate in ascending order of keys
		for(Integer intKey: convertIntoTreeMap.keySet()){
			
			System.out.println("Key:" + intKey + "\t" + "Value: " +sampleMapping.get(intKey));
			
		}
	}

}
