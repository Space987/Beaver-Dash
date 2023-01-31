import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class EndLevel1 extends Actor
{
    public void act()
    {
        touchBeaver();
    }

    public void touchBeaver()
    {
        Actor beaver = getOneIntersectingObject(Beaver.class);
        if (beaver != null) {

            World Level2 = new Level2();
            Greenfoot.setWorld(new Level2()); 

        }
    }
}
