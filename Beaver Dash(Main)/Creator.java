import greenfoot.*;

public class Creator extends Actor
{
    public void act() 
    {
        if (Greenfoot.mouseMoved(this))
        {
            setImage("Creator2.png");
        }

        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("Creator1.png");
        }

        if (Greenfoot.mouseClicked(this))
        {
            getWorld().stopped();  
            World CreationInfo = new CreationInfo();
            Greenfoot.setWorld(CreationInfo);
            CreationInfo.started();
        }
    }    
}
