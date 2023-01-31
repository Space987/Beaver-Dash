import greenfoot.*;  

public class FakeBeaver extends Actor
{
    public void act() 
    {
        Swim();
    } 

    public void Swim()
    {     
        if (Greenfoot.isKeyDown("right")) {
            turn(4);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-4);
        }
    }    
}
