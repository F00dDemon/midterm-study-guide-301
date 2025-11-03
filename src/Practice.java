import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(List<Integer> numArr) {
        numArr.sort(null);
        return numArr.get(numArr.size()-1) - numArr.get(0);
    }


    // TODO: Implement the other methods from the study guide AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.
    public static String longestWordWithSpecificLetter(String[] list, Character charToFind){
        String result = "";
        charToFind = Character.toLowerCase(charToFind);

        for(int i = 0; i<list.length; i++){
            if(Character.toLowerCase(list[i].charAt(0)) == charToFind && list[i].length() > result.length()){
                result = list[i];
            }
        }

        return result;
    }

    public static int wordCountWithLongAndShort(int longerThan, int shorterThan, String[] list){
        Map<String, Boolean> listMap = new HashMap<>();
        int count = 0;

        for(String word : list){
            if(word.length() > longerThan && word.length() < shorterThan){
                listMap.put(word, true);
            }else{
                listMap.put(word, false);
            }
        }
        for(String word : listMap.keySet()){
            if(listMap.get(word) == true){
                count++;
            }
        }

        return count;
    }

    public static int differenceOfEvenAndOdd(int[] list){
        Map<String, Integer> listMap = new HashMap<>();
        listMap.put("Even", 0);
        listMap.put("Odd", 0);


        for(int num: list){
            if(num % 2 == 0){
                listMap.replace("Even", listMap.get("Even")+1);
            }else{
                listMap.replace("Odd", listMap.get("Odd")+1);
            }
        }

        return Math.abs(listMap.get("Even") - listMap.get("Odd"));
    }

    public static int secondLargestNumber(int[] list){
        Set<Integer> listSet = new HashSet<>();
        int largest = 0;
        for(int num: list){
            listSet.add(num);
            if(num > largest){
                largest = num;
            }
        }
        listSet.remove(largest);
        largest = 0;
        for(int num: listSet){
            if(num > largest){
                largest = num;
            }
        }

        return largest;
    }

}