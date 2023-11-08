
/**
 * Décrivez votre classe turtle ici.
 *
 * @LEMOT(votre nom)
 * @20092023 (un numéro de version ou une date)
 */
public class Turtle
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int x;
    private int y;
    private int direction;
    private boolean trace;
    private String color;
    
    /**
     * Constructeur d'objets de classe turtle
     */
    public Turtle()
    {
        // initialisation des variables d'instance
        x = 0;
        y = 0;
        direction = 3;
        trace = true;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public int getDirection()
    {
        return direction;
    }
    
    public boolean getTrace()
    {
        return trace;
    }
    
    public void draw()
    {
        trace = true;
    }
    
    public void undraw()
    {
        trace = false;
    }
    
    public void turn()
    {
        direction++;
        if (direction == 4) {      
            direction = 0;
        }
    }
    
    public void goforward()
        { switch (direction) {
        case 0: x++; break;
        case 1: y++; break;
        case 2: x--; break;
        case 3: y--; 
    }
    }
    
    private void show()
    { 
        draw();            
    }
    
    public void setColor(String color)
    {
         this.color = color;
    }
    
    public String getColor()
    {
        return  color;
    }
}
