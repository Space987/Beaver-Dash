import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends Actor
{
    /**
     * Act - do whatever the Tutorial wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseMoved(this))
        {
            setImage("Tutorial2.png");
        }

        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("Tutorial1.png");
        }
        
        if (Greenfoot.mouseClicked(this))
        {
         getWorld().stopped();  
         World TutorialLevel = new TutorialLevel();
         Greenfoot.setWorld(TutorialLevel);
  
        }
    }    
}
