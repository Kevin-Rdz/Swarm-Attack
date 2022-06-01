import greenfoot.*;

public abstract class Insect extends Actor
{
    public static final int RIGHT = 0;
    public static final int LEFT = 1;
    private static final int GRAVITY = 1;
    private int counterPush = 0;
    public int fallSpeed = 0;
    public int pushSpeed = 15;
    private int immunityTime = 0;
    
    public void act()
    {
        moveAround();
        takeDamage();
        gravityEffect();
        loseImmunity();
    }
    
    public int getImmunityTime()
    {
        return immunityTime;
    }
    
    public void setImmunityTime(int immunityTime)
    {
        this.immunityTime = immunityTime;
    }
    
    public abstract void moveAround();
    
    public abstract void takeDamage();
    
    protected void gravityEffect()
    {
        if(onGround() == false)
        {
            fall();
        } else
        {
            fallSpeed = 0;
        }
    }
    
    protected boolean onGround()
    {
        Actor obstacle = (Obstacle)getOneObjectAtOffset(0, getImage().getHeight()/2, Obstacle.class);
        
        return obstacle != null;
    }
    
    protected void fall()
    {
        setLocation(getX(), getY() + fallSpeed);
        fallSpeed += GRAVITY;
    }
    
    public void pushed(int direction)
    {
        fallSpeed = -10;
        fall();
        if(direction == RIGHT)
        {
            move(50);
        }
        if(direction == LEFT)
        {
            move(-50);
        }
    }
    
    private void loseImmunity()
    {
        if(immunityTime != 0)
        {
            immunityTime -= 1;
        }
    }

}
