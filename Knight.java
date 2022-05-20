import greenfoot.*;
public class Knight extends Characters
{
    private static final int WALK_SPEED = 5;
    private static final int JUMP_HEIGHT = -18;
    
    private int lives = 3;
    private int immunityTime = 0;
    private int direction = RIGHT;
    
    public void actions()
    {
        moveAround();
        //checkCollisions();
    }
    
    private void moveAround()
    {
        if(Greenfoot.isKeyDown("RIGHT"))
        {
            direction = RIGHT;
            move(WALK_SPEED);
        }
        if(Greenfoot.isKeyDown("LEFT"))
        {   direction = LEFT;
            move(-WALK_SPEED);
        }
        if(Greenfoot.isKeyDown("UP") && onGround() == true)
        {
            fallSpeed = JUMP_HEIGHT;
            fall();
        }
    }
    
    private void checkCollisions()
    {
        Obstacle obstacle = (Obstacle)getOneIntersectingObject(Obstacle.class);
        
        if(obstacle != null)
        {
            if(direction == RIGHT)
            {
                setLocation(obstacle.getImage().getWidth(), getY());
            }
        }
    }
}
