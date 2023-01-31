import greenfoot.*;

public class TryAgainLevel2 extends Actor
{
    GreenfootSound gameSound;
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
        gameSound = new GreenfootSound("GameplayMusic.wav");
       if (Greenfoot.mouseClicked(this))
        {
         World Level2 = new Level2();
         Greenfoot.setWorld(Level2);

        }
    }
    
    public void started()
    {
        gameSound.playLoop();
    }
    
    public void stopped()
    {
        gameSound.stop();
    }
}
