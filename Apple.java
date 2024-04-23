import greenfoot.*;


public class Apple extends Actor
{
    public void act()
    {
        move(-3);
        
        if(getX() <= 0)
        {
            resetApple();
        }
    }
    
    public void resetApple()
    {
        int num = Greenfoot.getRandomNumber(2);
        if(num ==0)
        {
            setLocation(500, 100);
        }
        else
        {
            setLocation(500, 300);
        }
            
    }
}