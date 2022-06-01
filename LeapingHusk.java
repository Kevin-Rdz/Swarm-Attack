import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeapingHusk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeapingHusk extends Husk
{
    private int attack = 1;
    private int direction = LEFT;
    
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
