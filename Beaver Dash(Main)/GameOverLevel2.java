import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class GameOverLevel2 extends World
{
    GreenfootSound gameSound;
    public GameOverLevel2()
    {
        super(862, 691, 1);
        prepare();
        gameSound = new GreenfootSound("GameOver.wav");
    }
    
    public void started()
    {
        gameSound.play();
    }
        
    public void stopped()
    {
        gameSound.stop();
    }
    
    private void prepare()
    {
        TryAgainLevel2 tryAgainLevel2 = new TryAgainLevel2();
        addObject(tryAgainLevel2,466,395);
        tryAgainLevel2.act();
        removeObject(tryAgainLevel2);
        TryAgainLevel1 tryAgainLevel1 = new TryAgainLevel1();
        addObject(tryAgainLevel1,247,525);
        MainMenu1 mainMenu1 = new MainMenu1();
        addObject(mainMenu1,569,522);
        GameOver gameOver = new GameOver();
        addObject(gameOver,423,150);
        DeadBeaver1 deadBeaver1 = new DeadBeaver1();
        addObject(deadBeaver1,148,338);
        DeadBeaver2 deadBeaver2 = new DeadBeaver2();
        addObject(deadBeaver2,693,342);
        removeObject(gameOver);
        GameOver gameOver2 = new GameOver();
        addObject(gameOver2,418,119);
        removeObject(tryAgainLevel1);
        removeObject(mainMenu1);
        TryAgainLevel2 tryAgainLevel22 = new TryAgainLevel2();
        addObject(tryAgainLevel22,253,533);
        MainMenu1 mainMenu12 = new MainMenu1();
        addObject(mainMenu12,594,524);
    }
}
