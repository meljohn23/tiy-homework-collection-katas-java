import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by melaniejohnson on 8/22/16.
 */
public class Kata {

//Given an ArrayList of ints, return true if 6 appears as either the first or last element
//in the ArrayList. The ArrayList will be length 1 or more.
//hint: The first element is nums[0] and the last element is nums[nums.length - 1].
//Check if either of those is == 6.


    public static boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }

//Given an array of ints, return true if the array length is 1 or
//more, and the first element and the last element are equal.
//Hint:  The length is nums.length, the first element is nums[0]
//and the last element is nums[nums.length - 1]

    public static boolean sameFirstLast(int[] nums) {
        if ((nums[0] == nums[nums.length - 1]) && nums.length >= 1) {
            return true;
        } else {
            return false;
        }
    }

    //Given an array of ints length 3, return an array with the elements "rotated left" so
//{1, 2, 3} yields {2, 3, 1}
    public static int[] rotateLeft3(int[] nums) {
        int[] move = {nums[1], nums[2], nums[0]};
        return move;
    }

//Given an array of ints length 3, return a new array with the elements in reverse order,
//so {1, 2, 3} becomes {3, 2, 1}

    public int[] reverse3(int[] nums) {
        int[] flip = {nums[2], nums[1], nums[0]};
        return flip;
    }

//Given an ArrayList of Integers of at least length 2, return the sum of the first elements
//in the ArrayList and the second from last element. If the ArrayList length is less than
//2, just sum up the elements that exist, returning 0 if the array is length 0.

    public static int sumFirstPenultimate(int[] nums) {
        if (nums.length >= 2) {
            return (nums[0] + nums[nums.length - 2]);
        } else if (nums.length < 2) {
            return (nums[0] + nums[1]);
        } else {
            return 0;
        }
    }

//Modify and return the given HashMap as follows: if the key "a" has a value, set the key "b"
//to have that value, and set the key "a" to have the value "". Basically "b" is a bully,
//taking the value of "a".

    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

//Modify and return the given HashMap as follows: if the key "a" has a value, set the key
//"b" to have that same value. In all cases remove the key "c", leaving the rest of the
//map unchanged.

    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }

//Modify and return the given HashMap as follows: for this problem the HashMap may or may
//not contain the "a" and "b" keys. If both keys are present, append their 2 string values
//together and store the result under the key "ab".

    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String temp = map.get("a") + map.get("b");
            map.put("ab", temp);
            }

            return map;
        }

//Given an ArrayList of strings, return a HashMap containing a key for every different string
//in the ArrayList, and the value is that string's length.
//string.length = length

    public static HashMap<String, Integer> wordLen(String[] strings) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
            for (int x = 0; x < strings.length; x++) {
            String temp = strings[x];
            map.put(temp, temp.length());
            }
            return map;
        }

////Given an ArrayList of words, return a HashMap> containing keys for every word's first letter.
////The value for the key will be an ArrayList of all words in the list that start with that letter.
////An empty string has no first letter so don't add a key for it.

    public static HashMap<String, ArrayList> indexWords(String[] strings) {
        HashMap<String, ArrayList> map = new HashMap<String, ArrayList>();
        for (int x = 0; x < strings.length; x++) {
            if(strings[x].trim().length()==0)
                continue;
            String f = strings[x].substring(0, 1);
            if (map.containsKey(f)) {
                ArrayList list = map.get(f);
                list.add(strings[x]);
            } else {
                ArrayList newList = new ArrayList();
                newList.add(strings[x]);
                map.put(f, newList);
            }
        }

        return map;
    }
    }


