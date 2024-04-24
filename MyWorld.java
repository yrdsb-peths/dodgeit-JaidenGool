import greenfoot.*;

public class MyWorld extends World
{
    public static int score = 0;
    public static int counts = 0;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Hero hero = new Hero();
        addObject(hero, 100, 100);
        
        Apple apple = new Apple();
        addObject(apple, 500, 100);
        
        showText("Clicks: " + score, 50, 25);
        showText("Score: " + counts, 500, 30);
        
        if(Greenfoot.mouseClicked(null))
        {
            score++;
            showText("Score: " + score, 50, 25);
        }
    }
    
    public void act()
    {
        counts = Apple.counts;
        int gameOver = Apple.gameOver;
        
        showText("Clicks: " + score, 50, 25);
        showText("Score: " + counts, 500, 30);
        if(gameOver == 1)
        {
            showText("Game over!", 300, 100);
        }
        else if(Greenfoot.mouseClicked(null))
        {
            score++;
            showText("Clicks: " + counts, 50, 25);
        }
    }
}
