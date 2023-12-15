import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class Pez here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public abstract class Pez extends ActorExtension
{
    /**
     * Act - do whatever the Pez wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    Random ran = new Random();
    boolean isMovingUp;
    int tasaDeGiro;
    
    public void act()
    {
        UpdatePosition();
    }
    
    public void UpdatePosition()
    {
        if (ran.nextInt(125)==66)
        {
            ChangeDirection();
        }
        if (IsAtBottomEdge() || IsAtTopEdge())
        {
            ChangeDirection();
        }
        
        if (isMovingUp)
        {
            BetterMove(0, (int)(-2*velocidad));
        }
        else
        {
            BetterMove(0, (int)(2*velocidad));
        }
    }
    
    public void ChangeDirection()
    {
        isMovingUp=!isMovingUp;
    }
    
    
}
