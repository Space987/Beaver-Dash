import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Start extends Actor
{
    public void act() 
    {
        if (Greenfoot.mouseMoved(this))
        {
            setImage("Start2.png");
        }

        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("Start1.png");
        }
        
        if (Greenfoot.mouseClicked(this))
        {
          getWorld().stopped();  
          World Level1 = new Level1();
          Greenfoot.setWorld(Level1);
          Level1.started();
        }
    }    
    
}
