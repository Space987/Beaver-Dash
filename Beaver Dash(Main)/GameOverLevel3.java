import greenfoot.*;

public class GameOverLevel3 extends World
{
    GreenfootSound gameSound;
    public GameOverLevel3()
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
        TryAgainLevel3 tryAgainLevel3 = new TryAgainLevel3();
        addObject(tryAgainLevel3,465,390);
        removeObject(tryAgainLevel3);
        TryAgainLevel3 tryAgainLevel32 = new TryAgainLevel3();
        addObject(tryAgainLevel32,250,536);
        MainMenu1 mainMenu1 = new MainMenu1();
        addObject(mainMenu1,600,534);
        GameOver gameOver = new GameOver();
        addObject(gameOver,421,120);
        DeadBeaver1 deadBeaver1 = new DeadBeaver1();
        addObject(deadBeaver1,147,318);
        DeadBeaver2 deadBeaver2 = new DeadBeaver2();
        addObject(deadBeaver2,693,324);
    }
}
