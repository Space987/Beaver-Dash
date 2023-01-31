import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StoneLevel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StoneLevel3 extends Actor
{
    /**
     * Act - do whatever the StoneLevel3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        touchBeaver();
    }    

    public void touchBeaver()
    {
        Actor Beaver = getOneIntersectingObject(Beaver.class);
        if (Beaver != null) {
            Greenfoot.playSound("rock noise.wav");
            getWorld().stopped(); 
            World GameOverLevel3 =  new  GameOverLevel3();
            Greenfoot.setWorld(GameOverLevel3);
            GameOverLevel3.started();
        }
    }
}
