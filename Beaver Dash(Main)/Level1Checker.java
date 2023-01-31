import greenfoot.*;

public class Level1Checker extends Actor
{
    Score score = new Score();
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
            score.score = 0;
            return true;
        }
        else {
            return false;
        }
    }

    public void transitionToGameOver()
    {

        World GameOverLevel1 =  new  GameOverLevel1();
        Greenfoot.setWorld(GameOverLevel1);
        GameOverLevel1.started();
    }
}
