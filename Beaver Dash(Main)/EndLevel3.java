import lang.stride.*;
import java.util.*;
import greenfoot.*;
import java.util.List.*;

public class EndLevel3 extends Actor
{
    public void act()
    {
        touchBeaver();
    }

    public void touchBeaver()
    {
        Actor Beaver = getOneIntersectingObject(Beaver.class);
        if (Beaver != null) {
   
            Level3 level3 = (Level3) getWorld();
            Greenfoot.setWorld(new GameWon(level3.score.YourScore()));
        }
    }
}
