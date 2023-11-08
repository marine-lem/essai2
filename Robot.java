
/**
 * Décrivez votre classe Robots ici.
 *
 * @author (Marine LEMOT)
 * @version (18-09-2023)
 */
public class Robot
{
    private int xPosition;
    private int yPosition;
    private String name;
    private static int numberOfUnnamedRobots = 1;
    private static final int MIN_NAME_LENGTH;
    private static final int MIN_POSITION;
    private static final int MAX_POSITION;
    private String colourBody;
    
    private CanvasRobot canvasRobot;
    /**
     * Constructeur d'objets de classe Robot
     */
    public Robot(String name, String colourBody){
        setName(name);
        setColourBody(colourBody);
    }   
    public Robot(String name, int xPosition, int yPosition, String colourBody){
        setName(name);
        setXPosition(xPosition);
        setYPosition(yPosition);
        setColourBody(colourBody);
    }
    
    static{
        MIN_NAME_LENGTH = 3;
        MIN_POSITION = -5;
        MAX_POSITION = 5; }
    
    
    public void setName(String newName){
        newName = newName.trim();
        if (newName.length() >= MIN_NAME_LENGTH){
            this.name = newName;}
        else{
            this.name = "iRobot" + numberOfUnnamedRobots;
            numberOfUnnamedRobots++;}
    }
    public String getName(){
        return name;
    }
    
    public void setXPosition(int newxPosition){
        if (newxPosition >= MIN_POSITION){
            if (newxPosition <= MAX_POSITION){
                this.xPosition = newxPosition;
            }
        }
    }
        
    public int getXPosition(){
        return xPosition;
    }
    
    public void setYPosition(int newyPosition){
        if (newyPosition >= MIN_POSITION){
            if(newyPosition <= MAX_POSITION){
                this.yPosition = newyPosition;
            }
        }
    }
    
    public int getYPosition(){
        return yPosition;
    }
    
    public void setColourBody(String newColourBody)
    {
        colourBody = newColourBody;
    }
    
    public String getColourBody()
    { 
        return colourBody;
    }
}


