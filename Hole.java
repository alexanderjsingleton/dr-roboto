import greenfoot.*;

/**
 * Write a description of class Hole here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hole extends Actor
{
    /**
     * Act - do whatever the Hole wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        tryToCatch( Robot.class );
        randomMove( 8 );
    }
    public void tryToCatch( Class prey )
    {
        Actor target = getOneObjectAtOffset(0, 0, prey);
        if (target  != null) // if target not equal to world,
        {
            getWorld().removeObject(target);
        }
    }
    public void randomMove(int  maxAmount )
    {
        setLocation(getX()+(Greenfoot.getRandomNumber
                           (2*maxAmount+1)-maxAmount), //xoordinate
                    getY()+(Greenfoot.getRandomNumber
                           (2*maxAmount+1)-maxAmount));
    }
}

