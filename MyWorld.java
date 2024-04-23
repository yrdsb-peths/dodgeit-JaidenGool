import greenfoot.*;

public class MyWorld extends World
{
    public static int score = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Hero hero = new Hero();
        addObject(hero, 100, 100);
        
        Apple apple = new Apple();
        addObject(apple, 500, 100);
        
        showText("Score: " + score, 50, 25);
        
        if(Greenfoot.mouseClicked(null))
        {
            score++;
            showText("Score: " + score, 50, 25);
        }
    }
    
    public void act()
    {
        showText("Score: " + score, 50, 25);
        if(Greenfoot.mouseClicked(null))
        {
            score++;
            showText("Score: " + score, 50, 25);
        }
    }
}
