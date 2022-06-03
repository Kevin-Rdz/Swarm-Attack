import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Attack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Attack extends Item
{
    private int speedAttack;
    
    Attack(int speedAttack)
    {
        this.speedAttack = speedAttack;
    }
    
    public void act()
    {
        moveAttack();
        move(speedAttack);
    }
    
    public void moveAttack()
    {
        
    }
    
    public int getScore()
    {
        return 0;
    }
}

