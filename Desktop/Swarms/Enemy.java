import greenfoot.*;

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Enemy extends Insect
{
    private static final int SPEED_MOVEMENT = 3;
    private int counterMovement = 0;
    private static final int WALKING_RANGE = 25;
    private int direction;
    private int life = 3;
    private int immunityTime;
    private boolean hitByAttack = false;
    
    public abstract int getAttack();
    
    public void moveAround()
    {
        if(isLive() == true)
        {
            if(getDirection() == RIGHT && counterMovement < WALKING_RANGE)
            {
                move(SPEED_MOVEMENT);
                counterMovement++;
                if(counterMovement == WALKING_RANGE)
                {
                    setDirection(LEFT);
                }
            }
            if(getDirection() == LEFT && counterMovement > -WALKING_RANGE)
            {
                move(-SPEED_MOVEMENT);
                counterMovement--;
                if(counterMovement == -WALKING_RANGE)
                {
                    setDirection(RIGHT);
                }
            }
        }
    }
    
    public void takeDamage()
    {
        if(isTouching(Attack.class) && hitByAttack == false)
        {
            life--;
            hitByAttack = true;
        }
        else if(!isTouching(Attack.class))
        {
            hitByAttack = false;
        }
        if(life <= 0)
        {
            eliminated();
        }
    }
    
    private void eliminated()
    {
        setLocation(0,-10000);
    }
    
    private boolean isLive()
    {
        if(life > 0)
        {
            return true;
        }
        
        return false;
    }
    
    public int getImmunityTime()
    {
        return immunityTime;
    }
    
    public abstract int getDirection();
    
    public abstract void setDirection(int direction);
}
