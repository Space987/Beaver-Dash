import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class EndTutorial extends Actor
{
     public void act()
    {
       touchBeaver();
    }

     public void touchBeaver()
    {
        Actor beaver = getOneIntersectingObject(Beaver.class);
        if (beaver != null) {
           getWorld().stopped(); 
          World MainMenu = new MainMenu();
          Greenfoot.setWorld(MainMenu);
          MainMenu.started();
        }
    }
}
