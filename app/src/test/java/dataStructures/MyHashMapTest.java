package dataStructures;

import dataStructures.hashMap.MyHashMap;
import dataStructures.hashMap.MyHashMapExample;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MyHashMapTest
{

    /**
     * Test inserting data into the hashmap with sequential Integer keys
     */
    @Test void integer_string_sequential_no_conflict()
    {
        MyHashMap<Integer, String> map = new MyHashMapExample<>();

        String[] exp = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        for(int i = 0; i < exp.length; i++)
        {
            map.put(i,exp[i]);
        }

        for(int i = 0; i < exp.length; i++)
        {
            assertEquals(exp[i], map.get(i));
        }
    }

    /**
     * Test inserting data into the hashmap with sequential String keys
     */
    @Test void string_string_sequential_no_conflict()
    {
        MyHashMap<String, String> map = new MyHashMapExample<>();

        String[] exp = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        for (String s : exp) {
            map.put(s, s);
        }

        for (String s : exp) {
            assertEquals(s, map.get(s));
        }
    }

    /**
     * Test inserting data into the hashmap with non-sequential Integer keys without any conflicting hashes
     */
    @Test void integer_string_nonsequential_no_conflict()
    {
        MyHashMap<Integer, String> map = new MyHashMapExample<>();

        Integer[] exp_key = {4852,1582,188492,5821,9562,11193,94552,233457,3284,10,3303,4883,4002,3475,27444,3,4882,-1,4772,4022,-1220,40,200,482762,4472,4942};
        String[] exp_value = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        for(int i = 0; i < exp_key.length; i++)
        {
            map.put(exp_key[i],exp_value[i]);
        }

        for(int i = 0; i < exp_key.length; i++)
        {
            assertEquals(exp_value[i], map.get(exp_key[i]));
        }
    }

    /**
     * Test inserting data into the hashmap with non-sequential String keys without any conflicting hashes
     */
    @Test void string_string_nonsequential_no_conflict()
    {
        MyHashMap<String, String> map = new MyHashMapExample<>();

        String[] exp_key = {"z","y","x","w","v","u","t","s","r","q","p","o","n","m","l","k","j","i","h","g","f","e","d","c","b","a"};
        String[] exp_value = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        for(int i = 0; i < exp_key.length; i++)
        {
            map.put(exp_key[i],exp_value[i]);
        }

        for(int i = 0; i < exp_key.length; i++)
        {
            assertEquals(exp_value[i], map.get(exp_key[i]));
        }
    }

    /**
     * Test inserting data into the hashmap with non-sequential Integer keys where some keys conflict to the same hash
     */
    @Test void integer_string_nonsequential_with_conflict()
    {
        MyHashMap<Small, String> map = new MyHashMapExample<>();

        Integer[] exp_key = {  1,  2,  3 , 4 ,-5 ,257,258,259,260,261};
        String[] exp_value = {"a","b","c","d","e","f","g","h","i","j"};

        for(int i = 0; i < exp_key.length; i++)
        {
            map.put(new Small(exp_key[i]),exp_value[i]);
        }

        for(int i = 0; i < exp_key.length; i++)
        {
            assertEquals(exp_value[i], map.get(new Small(exp_key[i])));
        }
    }
}


/**
 * A class that holds a short number n that when hashed is mod 256
 */
class Small
{
    short s;

    public Small(int i)
    {
        this.s = (short) i;
    }

    @Override
    public int hashCode()
    {
        return  Math.abs(s) % 256;
    }

    @Override
    public boolean equals(Object other)
    {
        if(other instanceof Small)
            return ((Small) other).s == s;
        return false;
    }
}
