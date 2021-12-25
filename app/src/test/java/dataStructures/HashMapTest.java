package dataStructures;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashMap;

public class HashMapTest
{

    /**
     * Test inserting data into the hashmap with sequential Integer keys
     */
    @Test void integer_string_sequential_no_conflict()
    {
        HashMap<Integer, String> map = new HashMap<>();

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
        HashMap<String, String> map = new HashMap<>();

        String[] exp = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        for(int i = 0; i < exp.length; i++)
        {
            map.put(exp[i], exp[i]);
        }

        for(int i = 0; i < exp.length; i++)
        {
            assertEquals(exp[i], map.get(exp[i]));
        }
    }

    /**
     * Test inserting data into the hashmap with non-sequential Integer keys
     */
    @Test void integer_string_nonsequential_no_conflict()
    {
        HashMap<Integer, String> map = new HashMap<>();

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
     * Test inserting data into the hashmap with sequential String keys
     */
    @Test void string_string_nonsequential_no_conflict()
    {
        HashMap<String, String> map = new HashMap<>();

        String[] exp_key = {"hello","darkness","my","old","friend","i've","come","to","talk","with","you","again",
                            "because","a","vision","softly","creeping","left","it's","seeds","while","I","was","sleeping","and","the"};
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
}
