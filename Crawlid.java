import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crawlid extends Enemy
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
