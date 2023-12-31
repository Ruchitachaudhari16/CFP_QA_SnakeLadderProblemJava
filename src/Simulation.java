import java.util.Random;

public class Simulation {
    //Uc2:-The Player rolls the die to get a number between 1 to 6. - Use ((RANDOM)) to get the number between
    //1 to 6

    public void StartPosition() //startPosition fun
    {
        int startPosition = 0;
        System.out.println("Game played with single player at StartPosition:"+startPosition);
    }
    public void RolledDie()
    {
        //Random function for 1 to 6
        Random random=new Random();
        int x=random.nextInt(1,6);
        System.out.println("The dice rolled :"+x);
    }

    public static void main(String[] args)
    {
        Simulation sm=new Simulation();
        sm.StartPosition();
        sm.RolledDie();

    }
}

