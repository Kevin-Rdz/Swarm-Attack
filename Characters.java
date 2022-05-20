import greenfoot.*;

public abstract class Characters extends Actor
{
    public static final int RIGHT = 0;
    public static final int LEFT = 1;
    private static final int ACCELERATION_G = 1;
    public int fallSpeed = 0;
    
    public void act()
    {
        actions();
        gravityEffect();
    }
    
    public abstract void actions();
    
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
    
    public boolean onGround()
    {
        Actor obstacle = (Obstacle)getOneObjectAtOffset(0, getImage().getHeight()/2, Obstacle.class);
        
        return obstacle != null;
    }
    
    public void fall()
    {
        setLocation(getX(), getY() + fallSpeed);
        fallSpeed += ACCELERATION_G;
    }
    
}
