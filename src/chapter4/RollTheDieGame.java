package chapter4;

import java.util.Random;

public class RollTheDieGame {
    public static void main (String arg []) {

        int totalSpaces = 20;
        int maximumRolls = 5;
        int currentSpaceCount =0;
        int remainingSpaceCount =0;
        Random random = new Random();

        for (int i=0; i<maximumRolls; i++) {
            int dieRoll = random.nextInt(6) + 1;
            currentSpaceCount =  currentSpaceCount + dieRoll;
            remainingSpaceCount = totalSpaces - currentSpaceCount;

            if (remainingSpaceCount == 0 ){
                System.out.println("Roll #" + i + ": You've rolled a " + dieRoll+
                        " . You are now on space " + currentSpaceCount + " You win!!");

            } else if (remainingSpaceCount < totalSpaces){
                System.out.println("Roll #" + i + ": You've rolled a " + dieRoll+
                        " . You are now on space " + currentSpaceCount + " and you have "+
                        remainingSpaceCount + " more to go.");
            } else if (currentSpaceCount > totalSpaces) {
                System.out.println("Roll #" + i + ": You've rolled a " + dieRoll+
                        " . You are now on space " + currentSpaceCount + " You lose!!");           }
        }



        //method 2

//        int lastSpace = 20;
//        int currentSpace = 0;
//        int maxRolls = 5;
//        Random random = new Random();
//
//        System.out.println("Welcome to Roll the Die! Let's begin...");
//
//        for(int i=1; i<=maxRolls; i++){
//
//            int die = random.nextInt(6) + 1;
//            currentSpace = currentSpace + die;
//
//            System.out.print(String.format("Roll #%d: You've rolled a %d. ", i, die));
//
//            if(currentSpace == lastSpace){
//                System.out.print("You're on space " + currentSpace + ". Congrats, you win!");
//                break;
//            }
//            else if(currentSpace > lastSpace){
//                System.out.print("Unfortunately, that takes you past " + lastSpace + " spaces. You lose!");
//                break;
//            }
//            else if(i==maxRolls && currentSpace < lastSpace){
//                System.out.println("You're on space " + currentSpace + ".");
//                System.out.println("Unfortunately, you didn't make it to all " +
//                        lastSpace + " spaces. You lose!");
//            }
//            else{
//                int spacesToGo = lastSpace - currentSpace;
//                System.out.print("You are now on space " + currentSpace +
//                        " and have " + spacesToGo + " more to go.");
//            }
//
//            System.out.println();
//        }

    }
}
