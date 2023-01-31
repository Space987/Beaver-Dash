import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PiranhaLevel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PiranhaLevel3 extends Actor
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
            Greenfoot.playSound("PiranhaBite.mp3");
            getWorld().stopped(); 
            World GameOverLevel3 =  new  GameOverLevel3();
        Greenfoot.setWorld(GameOverLevel3);
             GameOverLevel3.started();
        }
    }
}
