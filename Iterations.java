public class Iterations {
    public static void main(String[] args) {

        // SIMPLE FOR LOOP
        System.out.println("SIMPLE FOR LOOP:");
        int num = 5; // declare a integee variable set to 5
        for(int i = 1; i <= num; i++)
        {
            // output what is stored in i
            System.out.println(i);
        }

        // FOR loop with arrays
        System.out.println("FOR LOOP WITH ARRAY:");
        // declare n array of integers
        int [] numbers = {6, 13, 12, 7, 10, 2};

        // this for loop, loops through the array and outputs each element
        for(int number: numbers){
            System.out.println(number);
        }

        // while loop to output values in an array
        System.out.println("FOR LOOP WITH ARRAY: SUM VALUES:");
        // declare n array of integers
        int [] n = {6, 13, 12, 7, 10, 2};
        int add = 0; // integer to hold the sum of the values in the array
        // loop through the array
        for(int count: n){
            //add each value at position 'count' to the 'add; variable
            add += count;
        }
        System.out.println("Sum of the array: " + add);

        // WHILE
        System.out.println("WHILE LOOP:");
        int i = 1, k = 5; // declare 2 integer variables,
                        // i is the counter, k is the end value

        // loop from 1 to 5
        while(i <= k)
        {
            // output the value in i
            System.out.println(i);
            i++; // increment the counter by 1 with each loop
        }

        //
        System.out.println("WHILE LOOP WITH ARRAY:");

        int[] listNumbers = {1,2,3,4,5,6,7,8,9,10};
        int x = 0; // counter to track number of iterations
        // loop as long as x is less than the length of the array
        while(x < listNumbers.length) //length: gets size of array
        {
            // output each element in the array
            // x holds the index value, as it inrements, it advances 1 position
            // in the array
            System.out.print(listNumbers[x] + " ");
            x++; //increment the counter by 1 with each loop
        }


        System.out.println("\nDO-WHILE LOOP:");
        int j = 1, l = 5;

        //do... while loop from 1 to 5
        do { // do-while executes the code in the loop once before checking the condition
            System.out.println(j); // output the value in j
            j++; // increment counter
        }while (j <= l); // loop while the value in j is less than or equal to the value in l (5)


    }
}
