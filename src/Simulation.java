import java.util.Random;

public class Simulation {
    /* UC4:-Repeat till the Player reaches the winning position 100.
    Note In case the player position moves below 0, then the player restarts from 0*/
    final int noPLAY = 0;
    final int isLADDER = 1;
    final int isSNAKE = 2;

    public void StartPosition() //startPosition fun
    {
        int startPosition = 0;
        System.out.println("Game played with single player at StartPosition:" + startPosition);
    }

    public void StartPlaying() {
        int startpos=0;
        System.out.println("Game started");
        while (startpos != 100) {

            int playerPosition = 0;
            //DiceRolled between 1 to 6
            Random random = new Random();
            int diceRoll = random.nextInt(1, 7);
            System.out.println("The dice rolled :" + diceRoll);

            //random fun for snake ,ladder or position.
            Random rando = new Random();
            int optionCheck = rando.nextInt(0, 3);
            System.out.println("Option " + optionCheck);
            switch (optionCheck) {
                case noPLAY:
                    playerPosition = 0;
                    break;
                case isLADDER:
                    playerPosition = playerPosition + diceRoll;
                    break;
                case isSNAKE:
                    playerPosition = playerPosition - diceRoll;
                    break;
            }
            System.out.println("Player Position :" + playerPosition);
        }
    }

        public static void main(String args[])
        {
            Simulation sm = new Simulation();
            sm.StartPosition();
            sm.StartPlaying();

        }
    }


