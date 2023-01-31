import greenfoot.*;

public class MainMenu1 extends Actor
{

    public void act() 
    {

        if (Greenfoot.mouseMoved(this))
        {
            setImage("Main Menu2.png");
        }

        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("Main Menu1.png");
        }

        if (Greenfoot.mouseClicked(this))
        {
            World MainMenu = new MainMenu();
            Greenfoot.setWorld(MainMenu);

        }   
    }
}
