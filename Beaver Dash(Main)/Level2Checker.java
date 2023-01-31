import greenfoot.*;

public class Level2Checker extends Actor
{
    public void act() 
    {
        if (isGameLost()) {
            transitionToGameOver();
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

    public void transitionToGameOver()
    {
 
        World GameOverLevel2 =  new  GameOverLevel2();
        Greenfoot.setWorld(GameOverLevel2);
        GameOverLevel2.started();  
    }
}
