package hash;
//package : Package is name that organizes a set of related classes and interfaces similar to  
//different folders on my computer
import java.util.HashMap;
import java.util.Map;
public class Generic {
	//public : members which can access as public,public members are visible to all other classes.
			//class : is a context of java that are used to create objects and to define object data types and methods.
	//Java's Map interface (java.util.Map) can be generified.
	//In other words, you can set the specific type of both the keys and 
	//values in a generic Map instance. 
	//This Map can now only accept String instances as keys, and String 
	//instances as values.
		static Map<String, String> hashmap = new HashMap<>();
		 
		private static void checkIfValueExist(String value) {
			// Let's checkout if Value exist
			String result = hashmap.containsValue(value) ? ("Value (" + value + ") exist")
					: ("Value (" + value + ") doesn't exist");
			log(result);
		}
	 
		private static void checkIfKeyExist(String key) {
			// Let's checkout if Key exist
			String result = hashmap.containsKey(key) ? (hashmap.get(key))
					: ("Key (" + key + ") doesn't exist");
			log(result);
			//print result
		}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
				//static used to prepare a field,method or inner classes as a class field.
				//void: it is void if the method does not return a value.
				//main:it is a function name When a program starts running, it has to start execution from somewhere.
				//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		hashmap.put("Google", "Mountain View, CA");
		hashmap.put("Yahoo", "Santa Clara, CA");
		hashmap.put("Microsoft", "Redmond, WA");
 //checks whether the element in list or not
		
		checkIfKeyExist("Google");
		checkIfKeyExist("Facebook");
		checkIfKeyExist("Twitter");
		checkIfKeyExist("Yahoo");
 
		System.out.println("\n");
		checkIfValueExist("Mountain View, CA");
		checkIfValueExist("San Jose, CA");
	}
 
	private static void log(Object object) 
	//prints the object
	{
		System.out.println(object);
		
	}

}
