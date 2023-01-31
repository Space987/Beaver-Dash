import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class GameWon extends World
{
    GreenfootSound gameSound;
    public GameWon(int finalScore)
    {
        super(925, 690, 1);
        prepare();
        Score result = new Score();
        addObject(result, 500, 230);
        result.setImage(new GreenfootImage("Your Score " + (int) finalScore, 40 , Color.WHITE, null));

       if (finalScore <= 5)
        {
            showTextGameWon("Your Beaver is still hungry", 270,310);
        }

        if (finalScore >= 6 && finalScore <= 8)
        {
            showTextGameWon("Your Beaver is almost full", 270, 310);
        }

        if (finalScore >= 9)
        {
            showTextGameWon("Your Beaver is full", 270, 310);
        }
        
        gameSound = new GreenfootSound("game_won.wav");
        started();
    }

    public void showTextGameWon(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(40);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message, x, y);
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
        Beaver beaver = new Beaver();
        addObject(beaver,893,455);
        removeObject(beaver);
        Beaver beaver2 = new Beaver();
        addObject(beaver2,532,362);
        removeObject(beaver2);

        addObject(beaver2,904,676);
        beaver2.setLocation(870,593);
        removeObject(beaver2);
        MainMenu1 mainMenu1 = new MainMenu1();
        addObject(mainMenu1,783,550);
        Beaver beaver3 = new Beaver();
        addObject(beaver3,911,669);
        beaver3.setLocation(906,662);
        fakeCherry fakeCherry = new fakeCherry();
        addObject(fakeCherry,906,662);
        removeObject(fakeCherry);
        beaver3.setLocation(911,682);
        beaver3.setLocation(905,669);

        beaver3.setLocation(903,666);
        smile smile = new smile();
        addObject(smile,903,666);
        removeObject(smile);
        removeObject(beaver3);
        Beaver beaver4 = new Beaver();
        addObject(beaver4,911,676);
        beaver4.setLocation(905,671);
        smile smile2 = new smile();
        addObject(smile2,905,671);
        removeObject(smile2);
        removeObject(beaver4);
        Beaver beaver5 = new Beaver();
        addObject(beaver5,908,680);
        beaver5.setLocation(904,674);
        smile smile3 = new smile();
        addObject(smile3,904,674);
    }

}
