import greenfoot.*;

/**
 * Write a description of class RobotWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(new Robot(), 250, 150);
        populateHoles();
    }
    public void populateHoles()
    {
        //GreenfootPages: 268,469
        for  (int i = 1; i <= 6; i++)
        {
            addObject(new Hole(),
                       Greenfoot.getRandomNumber(getWidth()),
                       Greenfoot.getRandomNumber(getHeight()));
        }
    }
}
