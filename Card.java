import greenfoot.*; // Import Greenfoot library



// Card class
public class Card extends Actor 
{
    // Enumerations for Shape and Color
    enum Shape { SQUARE, TRIANGLE, CIRCLE, NO_SHAPE }
    enum Color { RED, GREEN, BLUE, NO_COLOR }

    // Fields
    private Shape shape;
    private Color color;
    private boolean isSelected;
    private GreenfootImage cardImage, selectedCardImage;
    private int numberOfShapes, shading;

    // Constructor
    public Card(Shape shape, Color color, int numberOfShapes, int shading, GreenfootImage cardImage, GreenfootImage selectedCardImage) {
        this.shape = shape;
        this.color = color;
        this.numberOfShapes = numberOfShapes;
        this.shading = shading;
        this.cardImage = cardImage;
        this.selectedCardImage = selectedCardImage;
        this.isSelected = false; // Default value
        setImage(cardImage); // Set the initial image
    }

    // Getters
    public Shape getShape() {
        return shape;
    }

    public Color getColor() {
        return color;
    }

    public boolean getIsSelected() {
        return isSelected;
    }

    public GreenfootImage getCardImage() {
        return cardImage;
    }

    public GreenfootImage getSelectedCardImage() {
        return selectedCardImage;
    }

    public int getNumberOfShapes() {
        return numberOfShapes;
    }

    public int getShading() {
        return shading;
    }

    // Setter for isSelected
    public void setIsSelected(boolean isSelected) {
        this.isSelected = isSelected;
        if (isSelected) {
            setImage(selectedCardImage); // Change to selected image
        } else {
            setImage(cardImage); // Change to normal image
        }
    }

    // Set Image (Override Actor's method)
    @Override
    public void setImage(GreenfootImage image) {
        super.setImage(image); // Call the Actor class's setImage method
    }
}
