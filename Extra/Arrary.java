import java.util.Arrays;

public class Arrary {
    public static void main(String[] args) {

        int[] numbers = { 2, 4, 6, 8, 10 };

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int i : numbers) {
            System.out.println(i);
        }

        // int[][] array = new int[2][4];

        // System.out.println(array[1][2]);

        // int[][] array2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

        // System.out.println(array2[1][2]);

        // int[][] array3 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        // // 1st loop gets the rows, 2nd gets the columns
        // for (int i = 0; i < array3.length; ++i) {
        // for (int j = 0; j < array3[i].length; ++j) {
        // System.out.println(array3[i][j]);
        // }
        // }

        // int[][][] array4 = {
        // { { 1, 2 }, { 3, 4 } },
        // { { 5, 6, }, { 7, 8 } } };

        // for (int i = 0; i < array4.length; ++i) {
        // for (int j = 0; j < array4[i].length; ++j) {
        // for (int Q = 0; Q < array4[i].length; ++Q)
        // System.out.println(array4[i][j][Q]);
        // }
        // }

        // String seasons[] = { "Spring", "Summer", "Fall", "Winter" };
        // String checkValue = "Spring"; // value to search for

        // System.out.println("Array: " + Arrays.toString(seasons)); // display the
        // array as a string

        // if (Arrays.asList(seasons).contains(checkValue)) // check if the array
        // contains the value
        // {
        // // Print the result
        // System.out.println("Yes, " + checkValue + " exists in the array");
        // } else {
        // // Print the result
        // System.out.println("No, " + checkValue + " does not exist in the array");

        // }

        // int[] numbers = { 55, 32, 45, 98, 82, 11, 9, 39, 50 };
        // int smallest = numbers[0]; // initialize with the first element in the array
        // int largest = numbers[0]; // initialize with the first element in the array
        // for (int i = 1; i < numbers.length; i++) // start at index 1, the first
        // element at index0 is the test
        // {
        // if (numbers[i] > largest) // test if the element at that index is larger
        // largest = numbers[i]; // store if it is larger
        // else if (numbers[i] < smallest) // test if the element at that index is
        // smaller
        // smallest = numbers[i]; // store if it is smaller
        // }
        // System.out.println("Largest Number is : " + largest); // largest will be 98

        // String[] languages = { "Java" };
        // String language = languages[1];
        // // this will print an error
        // System.out.println(language);

        // just a concept of a 4d array
        // length width hight inside/outside
        // int[][][][] array5 = {
        // { { 1, 2 }, { 3, 4 } },
        // { { 5, 6 }, { 7, 8 } },
        // { {9, 10 }, {11, ,12 } },
        // { 14, 15 }, { 16, 17 } };

        // for (int i = 0; i < array5.length; ++i) {
        // for (int j = 0; j < array5[i].length; ++j) {
        // for (int Q = 0; Q < array5[i].length; ++Q) {
        // for (int w = 0; w < array5[i].length; ++w)
        // System.out.println(array5[i][j][Q][w]);
        // }
        // }
        // }

    }
}