/**
 * @author Linyuan Zhang
 * @version 08/27/2019
 * Comp7700 Assignment2
 */
public class FindMinMax {

    public static void main(String[] args) {
        int[] newArray = {8, 5, 10, 3, 2, -1, 4};
        // for invalid case: null & empty
        //int[] newArray2 = null;
        //int[] newArray3 = new int[0];

        Integer min = findMin(newArray);
        Integer max = findMax(newArray);


        System.out.println("the maximum value is " + max + "\n"
            + "the minimum value is " + min);
    }
    public static Integer findMax (int[] intArray) {
        //int[] axArray = intArray;
        if (intArray == null || intArray.length == 0) {
            return null;
        }
        int maxValue = intArray[0];
        for(int i = 1; i < intArray.length; i++) {
            if (maxValue < intArray[i])
                maxValue = intArray[i];
        }
        return maxValue;
    }

    public static Integer findMin (int[] intArray) {
        if (intArray == null || intArray.length == 0)
            return null;

        int minValue = intArray[0];
        for(int i = 1; i < intArray.length; i++) {
            if (minValue > intArray[i])
                minValue = intArray[i];
        }
        return minValue;
    }
}
