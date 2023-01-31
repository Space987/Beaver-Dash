import greenfoot.*;

public class Score extends Actor
{
    public static int score = 0;
    public int YourScore;
    public void act() 
    {
        eat();
        setImage(new GreenfootImage("Score: " + (int) score + " ",55 , Color.WHITE, null));
    }    

    public void eat()
    {
        Beaver beaver = (Beaver)getWorld().getObjects(Beaver.class).get(0);
        if (beaver!=null)
        {
            if(beaver.isTouching())
            {
                getWorld().removeObjects(getWorld().getObjects(Cherry.class));
                Greenfoot.playSound("eating.wav");
                score = score + 1;
            }   

            if (beaver!=null)
            {
                if(beaver.isTouching2())
                {
                    getWorld().removeObjects(getWorld().getObjects(GoldenCherry.class));
                    Greenfoot.playSound("eating.wav");
                    score = score + 3;
                }   

            }
        }
    }

    public int YourScore()
    {
        return score;
    }
}

