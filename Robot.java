import greenfoot.*;

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int age;
    
    public Robot()
    {
        age = 0;
    }
    
    public void act() 
    {
        age++; // same as age = age + 1 | a)lternatively, age += 1
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-1);
        }
        age++; // same as age = age + 1 | a)lternatively, age += 1
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+1);
        }
        age++; // same as age = age + 1 | a)lternatively, age += 1
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-1,getY());
        }
       age++; // same as age = age + 1 | a)lternatively, age += 1
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+1,getY());
        } 
       
    }    
}
