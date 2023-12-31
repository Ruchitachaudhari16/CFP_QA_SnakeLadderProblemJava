import java.util.Random;

public class Simulation {
    /* Uc3-The Player then checks for Option. They are No Play,
Ladder or Snake. - Use ((RANDOM)) to check for Options - In Case of No Play the player stays in the same
position
- In Case of Ladder the player moves ahead by the
number of position received in the die
- In Case of Snake the player moves behind by the*/
    final int noPLAY = 0;
    final int isLADDER = 1;
    final int isSNAKE = 2;

    public void StartPosition() //startPosition fun
    {
        int startPosition = 0;
        System.out.println("Game played with single player at StartPosition:"+startPosition);
    }

    public void OptionCheck()
    {
        //UC3: The Player then checks for a Option. They are No Play,
        //Ladder or Snake. -Use((RANDOM)) to check for Options

       int playerPosition=0;


       //DiceRolled between 1 to 6
        Random random=new Random();
        int diceRoll=random.nextInt(1,7);
        System.out.println("The dice rolled :"+diceRoll);

        Random rando = new Random();
        int optionCheck = rando.nextInt(0, 3);
        System.out.println("Option " + optionCheck);
        switch (optionCheck)
        {
            case noPLAY:
                playerPosition = 0;
                break;
            case isLADDER:
                playerPosition =playerPosition+ diceRoll;
                break;
            case isSNAKE:
                playerPosition = playerPosition-diceRoll;
                break;
        }
        System.out.println("Player Position :" + playerPosition);
    }

    public static void main(String[] args)
    {
        Simulation sm= new Simulation();
        sm.StartPosition();
        sm.OptionCheck();

    }
}

