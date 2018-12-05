package org.danny.stringprograms;
import java.util.LinkedHashMap;
import java.util.Map;

//Approach 1 using LinkedHashMap//

public class FirstNonRepeatedCharacterFromString { 
	public static void main(String[] args) {
	       String s = "ffeeddbbaaclck";
	       Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	       char c[] = s.toCharArray();
	 
	       for (char ch : c) {
	           if (map.containsKey(ch)) {
	               int count = map.get(ch);
	               map.put(ch, count + 1);
	           } else {
	               map.put(ch, 1);
	       }
	   }
	 
	       for (char ch : c) {
	           if (map.get(ch) == 1) {
	              System.out.println("First non repeated characted in String \""
	              + s + "\" is:" + ch);
	              break;
	           }
	       }
	       
	       //*Approach2 Index Comparision*//
	       
	       String s1 = "ffeeddbbaaclck";
	       for (char c1 : s.toCharArray()) {
	           if (s1.indexOf(c1) == s1.lastIndexOf(c1)) {
	               System.out.println("First non repeated characted in String \""
	               + s1 + "\" is:" + c1);
	               break;
	           }
	       }
	       
	       
	}
}
	       
	       
	       
          
       
              
           



