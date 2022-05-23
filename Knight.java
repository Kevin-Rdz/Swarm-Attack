import greenfoot.*;
import java.util.ArrayList;
import java.util.List;

public class Knight extends Characters
{
    private static final int WALK_SPEED = 5;
    private static final int JUMP_HEIGHT = -18;
    
    private int lives = 10;
    private int immunityTime = 0;
    private int direction = RIGHT;
    
    public void actions()
    {
        moveAround();
        takeDamage();
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
    
    private void takeDamage()
    {   
        List<Enemy> attackers = new ArrayList<Enemy>();
        attackers = getIntersectingObjects(Enemy.class);
        
        for(int i=0; i<attackers.size(); i++)
        {
            if(attackers.get(i) != null)
            {
                lives = lives - attackers.get(i).getAttack();
            }
        }
        
        attackers = null;
    }
}
