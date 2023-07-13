package fundamentals.__NOTES__.hashmap_notes;
import java.util.HashMap;
import java.util.Set;

public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>(); //Here we are creating a HashMap called userMap
        //hashmap use .put() to add key value pairs 
        userMap.put("nninja@codingdojo.com", "Nancy Ninja");
        userMap.put("ssamurai@codingdojo.com", "Sam Samurai");
        userMap.put("wwizard@codingdojo.com", "Walter Wizard");
        //to retrieve a value, use .get() and pass the key
        
        //Sets are similar to hashmaps, but they only store the keys and not the values
        // we can get the keys by using the keySet method; keySet returns a Set with all the keys

        Set<String> keys = userMap.keySet(); //Here we are creating a Set called keys and assigning it to the keySet of userMap. The set stores all the keys of userMap
        
        //we can then iterate through the set of keys ("keys") using an enhanced for loop. We chose an enhanced for loop because we don't need the index
        for(String key : keys) { 
            //for each key, we can then use the key to get the value from the userMap
            System.out.println("Key: " + key);                  // printing the key
            System.out.println("Value: " + userMap.get(key));    //printing value of the key from the userMap
            //or we can do it all in one line:
            System.out.printf("KEY: %s, VALUE: %s", key, userMap.get(key));
        }
    }
}
//You can do a quite a bit more with HashMaps. Some of the most commonly used methods are: 
//clear: removes all key-value pairs from the HashMap 

//containsKey: returns true if the HashMap contains the key, false if not

//containsValue: returns true if the HashMap contains the value, false if not

//isEmpty: returns true if the HashMap is empty, false if not

//keySet: returns a Set of all the keys in the HashMap

//remove: removes the key-value pair from the HashMap 

//replace:  replaces the value at the given key with the new value

//size: returns the number of key-value pairs in the HashMap 

//values: returns a Collection of all the values in the HashMap
