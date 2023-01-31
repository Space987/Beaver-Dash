import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class MainMenu extends World
{
    GreenfootSound gameSound;
    public MainMenu()
    {
        super(990, 557, 1);
        prepare();
        gameSound = new GreenfootSound("GameplayMusic.wav");
    }
   
    public void started()
    {
        gameSound.playLoop();
    }
    
    public void stopped()
    {
        gameSound.stop();
    }

    private void prepare()
    {
        Start start = new Start();
        addObject(start,219,269);
        Controls controls = new Controls();
        addObject(controls,195,424);
        controls.setLocation(280,416);
        removeObject(controls);
        Controls controls2 = new Controls();
        addObject(controls2,216,427);
        Controls controls3 = new Controls();
        addObject(controls3,224,361);
        removeObject(controls2);
        controls3.setLocation(222,358);
        removeObject(controls3);
        removeObject(start);
        Start start2 = new Start();
        addObject(start2,212,274);
        Controls controls4 = new Controls();
        addObject(controls4,212,423);
        Tutorial tutorial = new Tutorial();
        addObject(tutorial,748,269);
        Creator creator = new Creator();
        addObject(creator,778,427);
        creator.setLocation(828,408);
        removeObject(creator);
        Creator creator2 = new Creator();
        addObject(creator2,746,428);
    }
}
