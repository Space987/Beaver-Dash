import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SplashScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Splash_Screen extends World
{
    protected double timeEndScreenCreation = System.currentTimeMillis();
    GreenfootSound gameSound;
    /**
     * Constructor for objects of class Splash_Screen.
     */
    public Splash_Screen()
    {
        super(860,640,1);
        prepare();
    }

    /**
     * 
     */
    public void act()
    {
        if (System.currentTimeMillis() >= (timeEndScreenCreation + 3000)) {
            transitionToMainMenu();
        }
    }

    public void transitionToMainMenu()
    {
        World MainMenu = new MainMenu();
        Greenfoot.setWorld(MainMenu);
    }
   

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GameProgram gameProgram = new GameProgram();
        addObject(gameProgram,414,71);
        Vanier vanier = new Vanier();
        addObject(vanier,409,276);
        Team team = new Team();
        addObject(team,339,584);
        removeObject(team);
        Team team2 = new Team();
        addObject(team2,443,592);
        team2.setLocation(438,557);
        removeObject(team2);
        Team team3 = new Team();
        addObject(team3,446,540);
        Natan natan = new Natan();
        addObject(natan,412,605);
        removeObject(vanier);
        Vanier vanier2 = new Vanier();
        addObject(vanier2,408,306);
        vanier2.setLocation(451,298);
        vanier2.setLocation(531,282);
        removeObject(vanier2);
        Vanier vanier3 = new Vanier();
        addObject(vanier3,423,302);
    }
}
