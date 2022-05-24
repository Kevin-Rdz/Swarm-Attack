import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Enemy extends Characters
{
    private static final int SPEED_MOVEMENT = 3;
    private int counterMovement = 0;
    private static final int WALKING_RANGE = 25;
    private int direction = getDirection();
    private int life = 3;
    
    public abstract int getAttack();
    
    public void actions()
    {
        moveAround();
    }
    
    private void moveAround()
    {
        if(isLive() == true)
        {
            if(direction == RIGHT && counterMovement < WALKING_RANGE)
            {
                move(SPEED_MOVEMENT);
                counterMovement++;
            }
            if(counterMovement == WALKING_RANGE)
            {
                direction = LEFT;
            }
            if(direction == LEFT && counterMovement > -WALKING_RANGE)
            {
                move(-SPEED_MOVEMENT);
                counterMovement--;
            }
            if(counterMovement == -WALKING_RANGE)
            {
                direction = RIGHT;
            }
        }
    }
    
    private boolean isLive()
    {
        if(life == 0)
        {
            return false;
        }
        
        return true;
    }
    
    
    
    public abstract int getDirection();
}
