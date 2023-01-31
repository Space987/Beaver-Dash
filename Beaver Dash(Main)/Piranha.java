import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class Piranha extends Actor
{
    public void act()
    {
        move();
        touchStone();
        touchRock();
        touchBeaver();
    }

    public void move()
    {
        move(2);
    }

    public void touchStone()
    {
        Actor Stone = getOneIntersectingObject(Stone.class);
        if (Stone != null) {
            World world = getWorld();
            turn(180);
            setImage("piranha2.png");
        }
    }

    public void touchRock()
    {
        Actor rock = getOneIntersectingObject(rock.class);
        if (rock != null) {
            World world = getWorld();
            turn(180);
            setImage("piranha1.png");
        }
    }

    public void touchBeaver()
    {
        Actor Beaver = getOneIntersectingObject(Beaver.class);
        if (Beaver != null) {
            World world = getWorld();
            world.removeObject(Beaver);
            Greenfoot.playSound("PiranhaBite.mp3");
        }
    }
}
