package chapter7;

import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 6;
    public static void main(String arg[]){

        printTicket(randomNum());
    }

    public static int[] randomNum(){
        int [] lottery = new int[LENGTH];
        Random random = new Random();

        for(int i=0; i<LENGTH; i++){
        lottery[i] = random.nextInt(MAX_TICKET_NUMBER)+1;
        }
        return lottery;
    }

    public static void printTicket(int[] lotto){
        for (int i=0; i< LENGTH; i++){
            System.out.print(lotto[i]+" | ");
        }
    }
}


