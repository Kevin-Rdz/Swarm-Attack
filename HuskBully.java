import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HuskBully here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HuskBully extends Husk
{
    private int attack = 1;
    private int direction = RIGHT;
    
    public int getAttack()
    {
        return attack;
    }
    
    public int getDirection()
    {
         return direction;
    }
    
    public void setDirection(int direction)
    {
        this.direction = direction;
    }
}
