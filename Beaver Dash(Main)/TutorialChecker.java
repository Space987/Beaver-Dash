import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TutorialChecker extends Actor
{
    /**
     * Act - do whatever the TutorialChecker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isGameLost()) {
            Restart();
        }
    }    
    
    public boolean isGameLost()
    {
        World world = getWorld();
        if (world.getObjects(Beaver.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    public void Restart()
    {
        getWorld().stopped();
        World tutorialWorld =  new  TutorialLevel();
        Greenfoot.setWorld(tutorialWorld);

    } 
}
