import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class rock extends Actor
{

    /**
     * Act - do whatever the rock wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        touchBeaver();
    }


    public void touchBeaver()
    {
        Actor Beaver = getOneIntersectingObject(Beaver.class);
        if (Beaver != null) {
            World world = getWorld();
            world.removeObject(Beaver);
            Greenfoot.playSound("rock noise.wav");
        }
    }
}

