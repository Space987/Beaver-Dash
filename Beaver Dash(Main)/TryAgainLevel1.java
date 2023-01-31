import greenfoot.*;

public class TryAgainLevel1 extends Actor
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
         World Level1 = new Level1();
         Greenfoot.setWorld(Level1);

        }
    }   
    

}
