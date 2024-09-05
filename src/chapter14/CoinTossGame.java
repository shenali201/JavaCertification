package chapter14;

import java.util.Scanner;

public class CoinTossGame {

    private Scanner sc;
    public static void main(String arg []){

        CoinTossGame game = new CoinTossGame();
        game.sc = new Scanner(System.in);

        Player player1 = new Player(game.GetPlayerName());
        player1.setGuess(game.getPlayersGuess());
        Player player2 = new Player(game.GetPlayerName());
        player2.setGuess(game.getPlayersGuess());

        Coin coin = new Coin();
        game.validateGuess(coin);
        game.getWinner(player1,player2,coin);
    }

    private String GetPlayerName(){
        System.out.println(" Enter name: ");
        return sc.nextLine();
    }

    private String getPlayersGuess(){
        String option1 = Coin.HEADS;
        String option2 = Coin.TAILS;
        String promptOption = String.format("%s or %s?", option1, option2);
        System.out.println(promptOption);
        String guess = sc.nextLine();

        while(!guess.equalsIgnoreCase(Coin.HEADS) && !guess.equalsIgnoreCase(Coin.TAILS)){
            System.out.println("Invalid guess");
            guess = sc.nextLine();
        }

        return guess;
    }

    private void validateGuess(Coin coin){
        coin.flip();
        System.out.println("The coin landed on " + coin.getSide());
    }

    private void getWinner(Player player1, Player player2, Coin coin){
        String winner;
        coin.flip();
        if(coin.getSide().equalsIgnoreCase(player1.getGuess())){
            winner=player1.getName();
        } else {
            winner=player2.getName();
        }
        System.out.println("The winner is " + winner);
    }


}
