import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TryAgainLevel3 extends Actor
{
    public void act() 
    {
       if (Greenfoot.mouseMoved(this))
        {
            setImage("Try Again2.png");
        }

       if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("Try Again1.png");
        }
        
       if (Greenfoot.mouseClicked(this))
        {
            
         World Level3 = new Level3();
         Greenfoot.setWorld(Level3);

        }
    }    
}
