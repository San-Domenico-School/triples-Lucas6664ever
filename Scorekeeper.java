public class Scorekeeper  
{
    private static int deckSize;
    private static int score;
    private static long startTime = System.currentTimeMillis();
   
    public static void setDeckSize(int deckSize)
    {
        Scorekeeper.deckSize = deckSize;
    }
   
    public static void updateScore()
    {
        score += 27;
    }
   
    public static int getScore()
    {
        return score;
    }
   
}