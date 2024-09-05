package chapter7;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 6;
    public static void main(String arg[]){

        printTicket(randomNum());
    }

    public static int[] randomNum(){
        int [] lottery = new int[LENGTH];
        Random random = new Random();

        for(int i=0; i<LENGTH; i++){
            int randomNumber ;
            //run the do while until the random number is not already existing in the current array
            do{
                randomNumber  = random.nextInt(MAX_TICKET_NUMBER)+1;
            } while( searchDuplicates(lottery,randomNumber));
            lottery[i] = randomNumber;
        }
        return lottery;
    }

    //sequential search for duplicates
    private static boolean searchDuplicates(int[] array, int randomNumber) {
        for(int value: array) {
            if (value == randomNumber){
                return true;
            }
        }
        return false;
    }

    //binary search for binary search
    private static boolean binarySearchDuplicates(int[] array, int randomNumber) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, randomNumber);
        if(index >= 0){
            return true;
        }
        else return false;
    }

    public static void printTicket(int[] lotto){
        for (int i=0; i< LENGTH; i++){
            System.out.print(lotto[i]+" | ");
        }
    }

}
