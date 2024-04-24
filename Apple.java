import greenfoot.*;

public class Apple extends Actor
{
    public static int counts = MyWorld.score;
    public static int gameOver = 0;
    
    public void act()
    {
        move(-3);
        
        if(getX() <= 0)
        {
            resetApple();
            counts++;
        }
        
        if(isTouching(Hero.class))
        {
            SadFace sadFace = new SadFace();
            getWorld().addObject(sadFace, 300, 200);
            getWorld().removeObject(this);
            gameOver = 1;
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
