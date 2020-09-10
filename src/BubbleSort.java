
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arrayToSort = new int[0];

        System.out.println("Choose a random number! (Type 'q' to exit)");

        while (!scan.hasNext("q")){

            int[] tempArray = new int[arrayToSort.length + 1];
            int chosenNumber = scan.nextInt();

            for (int i = 0; i < arrayToSort.length; i++){
                tempArray[i]=arrayToSort[i];
            }
            tempArray[tempArray.length -1]=chosenNumber;
            arrayToSort = tempArray;
            System.out.println(Arrays.toString(arrayToSort));

        }
            arraySorted(arrayToSort);
            System.out.println("Sorted Array: " + Arrays.toString(arrayToSort));
    }

    public static int[] arraySorted(int [] arrayToSort){

        int tempNumber = 0;

        for (int i = 0; i < arrayToSort.length; i++){
            for (int j = 1; j < arrayToSort.length - i; j++){

                if (arrayToSort[j] < arrayToSort[j-1]){

                    tempNumber=arrayToSort[j-1];
                    arrayToSort[j-1]=arrayToSort[j];
                    arrayToSort[j]=tempNumber;
                }

            }
        }
        return arrayToSort;
    }

}
