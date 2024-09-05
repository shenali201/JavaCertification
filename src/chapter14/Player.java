package chapter14;

public class Player {

    private String name;
    private  String guess;

    public Player(String name){
        this.name = name;
        guess = "heads";
    }
    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
