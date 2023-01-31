import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class Log extends Actor
{
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
        }
    }
}
