import lang.stride.*;
import java.util.*;
import greenfoot.*;
import java.awt.Color;

public class Beaver extends Actor
{
    static int score = 0;
    protected GreenfootImage image1;
    protected GreenfootImage image2;
    protected GreenfootImage image3;

    public Beaver()
    {
        image1 =  new  GreenfootImage("Beaver.png");
        image2 =  new  GreenfootImage("Beaver2.png");
        image3 =  new  GreenfootImage("Beaver3.png");
    }

    public void act()
    {
        Swim();
        Reverse();
        eat();
        eat2();
    }

    public void Swim()
    {
        move(2);
        if (getImage() == image3) {
            setImage(image2);
        }
        else {
            setImage(image3);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(4);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-4);
        }

    }

    public void Reverse()
    {
        if (isTouching(Whirlpool.class)) {
            if (Greenfoot.isKeyDown("right")) {
                turn(-6);
            }
            if (Greenfoot.isKeyDown("left")) {
                turn(6);
            }
        }
    }

    public boolean isTouching()
    {
        return isTouching(Cherry.class);
    }
    
    public boolean isTouching2()
    {
        return isTouching(GoldenCherry.class);
    }
    
    public void eat()
    {
        Actor fakeCherry = getOneIntersectingObject(fakeCherry.class);
        if (fakeCherry != null) {
            World world = getWorld();
            world.removeObject(fakeCherry);
            Greenfoot.playSound("eating.wav");
        }
    }
    
    public void eat2()
    {
        Actor fakeGoldenCherry = getOneIntersectingObject(fakeGoldenCherry.class);
        if (fakeGoldenCherry != null) {
            World world = getWorld();
            world.removeObject(fakeGoldenCherry);
            Greenfoot.playSound("eating.wav");
        }
    }

}
