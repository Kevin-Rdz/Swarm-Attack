import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kingsmould here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kingsmould extends Enemy
{
    private static final int WALKING_RANGE = 110;
    private static final int SPEED_MOVEMENT = 5;
    
    private int attack = 1;
    private int direction;
    private int life = 10;
    
    private int counterMovement;
    
    public void act()
    {
        movement();
    }
    
    public void setDirection(int direction)
    {
        this.direction = direction;
    }
    
    public int getAttack()
    {
        return attack;
    }
    
    public int getDirection()
    {
         return direction;
    }
    
    public void movement()
    {
            if(direction == RIGHT && counterMovement < WALKING_RANGE)
            {
                move(SPEED_MOVEMENT);
                counterMovement++;
                if(counterMovement == WALKING_RANGE)
                {
                    direction = LEFT;
                }
            }
            if(direction == LEFT && counterMovement > -WALKING_RANGE)
            {
                move(-SPEED_MOVEMENT);
                counterMovement--;
                if(counterMovement == -WALKING_RANGE)
                {
                    direction = RIGHT;
                }
            }
    
    }
}
