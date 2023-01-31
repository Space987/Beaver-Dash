import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class GameOverLevel1 extends World
{
    GreenfootSound gameSound;
    public GameOverLevel1()
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
        DeadBeaver1 deadBeaver1 = new DeadBeaver1();
        addObject(deadBeaver1,184,269);
        DeadBeaver2 deadBeaver2 = new DeadBeaver2();
        addObject(deadBeaver2,648,276);
        GameOver gameOver = new GameOver();
        addObject(gameOver,423,132);
        TryAgainLevel1 tryAgainLevel1 = new TryAgainLevel1();
        addObject(tryAgainLevel1,195,505);
        deadBeaver1.setLocation(52,339);
        TryAgainLevel2 tryAgainLevel2 = new TryAgainLevel2();
        addObject(tryAgainLevel2,580,446);
        removeObject(tryAgainLevel2);
        MainMenu1 mainMenu1 = new MainMenu1();
        addObject(mainMenu1,595,506);
        removeObject(deadBeaver1);
        DeadBeaver1 deadBeaver12 = new DeadBeaver1();
        addObject(deadBeaver12,231,293);
        deadBeaver2.setLocation(645,302);
        deadBeaver2.setLocation(513,401);
        removeObject(gameOver);
        GameOver gameOver2 = new GameOver();
        addObject(gameOver2,420,123);
        removeObject(deadBeaver12);
        removeObject(deadBeaver2);
        removeObject(mainMenu1);
        removeObject(tryAgainLevel1);
        gameOver2.setLocation(611,196);
        removeObject(gameOver2);
        GameOver gameOver3 = new GameOver();
        addObject(gameOver3,416,198);
        DeadBeaver1 deadBeaver13 = new DeadBeaver1();
        addObject(deadBeaver13,127,377);
        DeadBeaver2 deadBeaver22 = new DeadBeaver2();
        addObject(deadBeaver22,689,371);
        deadBeaver13.setLocation(257,536);
        TryAgainLevel1 tryAgainLevel12 = new TryAgainLevel1();
        addObject(tryAgainLevel12,257,536);
        deadBeaver22.setLocation(576,536);
        MainMenu1 mainMenu12 = new MainMenu1();
        addObject(mainMenu12,576,536);
        removeObject(deadBeaver22);
        removeObject(deadBeaver13);
        DeadBeaver1 deadBeaver14 = new DeadBeaver1();
        addObject(deadBeaver14,133,371);
        DeadBeaver2 deadBeaver23 = new DeadBeaver2();
        addObject(deadBeaver23,668,383);
        removeObject(gameOver3);
        GameOver gameOver4 = new GameOver();
        addObject(gameOver4,432,126);
        removeObject(deadBeaver23);
        removeObject(deadBeaver14);
        DeadBeaver1 deadBeaver15 = new DeadBeaver1();
        addObject(deadBeaver15,132,336);
        DeadBeaver2 deadBeaver24 = new DeadBeaver2();
        addObject(deadBeaver24,673,338);
        mainMenu12.setLocation(521,552);
        tryAgainLevel12.setLocation(266,558);
        removeObject(mainMenu12);
        removeObject(tryAgainLevel12);
        TryAgainLevel1 tryAgainLevel13 = new TryAgainLevel1();
        addObject(tryAgainLevel13,221,553);
        MainMenu1 mainMenu13 = new MainMenu1();
        addObject(mainMenu13,600,548);
    }
}
