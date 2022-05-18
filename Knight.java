import greenfoot.*;
public class Knight extends Characters
{
    private static final int ACCELERATION = 1;
    private static final int WALK_SPEED = 5;
    
    private int fallSpeed = 0;
    private int jumpHeight = -10;
    
    public void act()
    {
        moveAround();
        gravityEffect();
    }
    
    private void gravityEffect()
    {
        if(onGround() == false)
        {
            fall();
        } else
        {
            fallSpeed = 0;
        }
    }
    
    private boolean onGround()
    {
        Actor obstacle = (Obstacle)getOneObjectAtOffset(0, getImage().getHeight()/2, Obstacle.class);
        
        return obstacle != null;
    }
    
    private void fall()
    {
        setLocation(getX(), getY() + fallSpeed);
        fallSpeed += ACCELERATION;
    }
    
    private void moveAround()
    {
        if(Greenfoot.isKeyDown("RIGHT"))
        {
            move(WALK_SPEED);
        }
        if(Greenfoot.isKeyDown("LEFT"))
        {
            move(-WALK_SPEED);
        }
        if(Greenfoot.isKeyDown("UP") && onGround() == true)
        {
            fallSpeed = jumpHeight;
            fall();
        }
    }
}
