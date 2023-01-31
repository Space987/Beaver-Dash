import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackTutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackTutorial extends Actor
{
    /**
     * Act - do whatever the BackTutorial wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseMoved(this))
        {
            setImage("Back2.png");
        }

        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("Back1.png");
        }
        
        if (Greenfoot.mouseClicked(this))
        {
          getWorld().stopped(); 
          World MainMenu = new MainMenu();
          Greenfoot.setWorld(MainMenu);
          MainMenu.started();
        }
    }     
}
