public class Scorekeeper {
    // Fields
    private static int deckSize;
    private static int score;
    private static long startTime;

    // Constructor
    public Scorekeeper() {
        startTime = System.currentTimeMillis(); // Initialize start time
    }

    // Setter for deckSize
    public static void setDeckSize(int size) {
        deckSize = size; // Assign the input parameter to deckSize
    }

    // Method to update the score
    public static void updateScore() {
        // Increment score, logic can be customized as needed (e.g., based on finding a triple)
        score += 10; // Example: increase score by 10
    }

    // Getter for score
    public static int getScore() {
        return score; // Return the current score
    }
}
