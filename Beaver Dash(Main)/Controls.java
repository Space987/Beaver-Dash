import greenfoot.*;

public class Controls extends Actor
{
    public void act() 
    {
        if (Greenfoot.mouseMoved(this))
        {
            setImage("Controls2.png");
        }

        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("Controls1.png");
        }
        
        if (Greenfoot.mouseClicked(this))
        {
          getWorld().stopped(); 
          World ControlList = new ControlList();
          Greenfoot.setWorld(ControlList);
          ControlList.started();
        }
    }    
}
