import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class EndLevel2 extends Actor
{
     public void act()
    {
        touchBeaver();
    }

     public void touchBeaver()
    {
       Actor beaver = getOneIntersectingObject(Beaver.class);
       if (beaver != null) {
 
            World Level3 = new Level3();
           Greenfoot.setWorld(new Level3()); 
           Level3.started();
        }
    }
}
