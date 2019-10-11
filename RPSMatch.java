
/**
 * Write a description of class RPSMatch here.
 *
 * @author Shruthi Ravichandran, Isy Herman, Yasmin Ahuja
 * @version 09 11 2019
 */
public class RPSMatch
{
    // instance variables - replace the example below with your own
    private int compSign;
    private int humanSign;
    private int computerWins;
    private int humanWins;
    private int ties;
    public static final int ROCK = 0;
    public static final int PAPER = 1;
    public static final int SCISSORS = 2;

    /**
     * Constructor for objects of class RPSMatch
     */
    public RPSMatch()
    {
        computerWins = 0;
        humanWins = 0;
        ties = 0;
    }

    /**
     * Returns human sign
     * @return human sign
     */
    public int getHumanSign()
    {
        return humanSign;
    }
    
    /**
     * Returns computer sign
     * @return computer sign
     */
    public int getCompSign()
    {
        return compSign;
    }
    
    /**
     * Returns computer wins
     * @return computer wins
     */
    public int getComputerWins()
    {
        return computerWins;
    }
    
    /**
     * Returns human wins
     * @return human wins
     */
    public int getHumanWins()
    {
        return humanWins;
    }
    
    /**
     * Returns ties
     * @return ties
     */
    public int getTies()
    {
        return ties;
    }
    
    /**
     * Sets human sign
     */
    public void setHumanPlay(int sign)
    {
        humanSign = sign;
    }
    
    /**
     * Sets computer sign
     */
    public void setComputerSign()
    {
        compSign = (int)(Math.random() * 3);
    }
    
    public String getComputerText()
    {
        if (compSign == ROCK)
        {
            return "Rock";
        }
        else if (compSign == PAPER)
        {
            return "Paper";
        }  
        else
        {
            return "Scissors";
        }         
    }
    
    public int getResult()
    {
        int result = 0;
        if (compSign == humanSign)
        {
            ties++;
            result = 0;
        }
        else if (humanSign % 3 - compSign % 3 == 1)
        {
            humanWins++;
            result = 1;
        }
        else
        {
            computerWins++;
            result = -1;
        }
        return result;
    }
}
