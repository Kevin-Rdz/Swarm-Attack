import greenfoot.*;
import java.util.ArrayList;
import java.util.List;

public class Knight extends Insect
{
    private static final int WALK_SPEED = 5;
    private static final int JUMP_HEIGHT = -18;
    private static final int MAX_COUNTER_ATTACK = 30;
    private static final int MAX_COUNTER_PUSHED = 100;
    
    private GreenfootImage []imagesMove;
    private GreenfootImage []imagesAttack;
    private int currentImage;
    private int counterAttack;
    private int counterPushed;
    private int counterLoseImmunity;
    private boolean attackAvaible = true;
    private boolean pushAvaible = true;
    
    private int lives = 1;
    private int immunityTime = 0;
    private int direction = RIGHT;
    
    public Knight()
    {
        imagesMove = new GreenfootImage[3];
        imagesAttack = new GreenfootImage[3];
        imagesMove[0] = new GreenfootImage("images/1.jpg");
        imagesMove[1] = new GreenfootImage("images/2.jpg");
        imagesMove[2] = new GreenfootImage("images/3.jpg");
        imagesAttack[0] = new GreenfootImage("images/hollow_knight_attack_1.png");
        imagesAttack[1] = new GreenfootImage("images/hollow knight attack 2.png");
        imagesAttack[2] = new GreenfootImage("images/hollow knight attack 3.png");
    }
    
    public void act()
    {
        moveAround();
        takeDamage();
        gravityEffect();
        attack();
        death();
        takeItems();
        loseImmunity();
    }
    
    public int getDirection()
    {
        return direction;
    }
    
    private void loseImmunity()
    {
        if(immunityTime > 0)
        {
            counterLoseImmunity++;
            if(counterLoseImmunity < 10)
            {
                return;
            }
            immunityTime--;
        }
    }
    
    private void takeItems()
    {
        Live live = (Live)getOneIntersectingObject(Live.class);
        Immunity immunity = (Immunity)getOneIntersectingObject(Immunity.class);

        if(live != null)
        {
            getWorld().removeObject(live);
            lives++;
        }
        else if(immunity != null)
        {
            getWorld().removeObject(immunity);
            setImmunityTime(100);
        }
    }

    public void moveAround()
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
    
    public void attack()
    {
        if(attackAvaible == true)
        {
            if(Greenfoot.isKeyDown("SPACE") && direction == RIGHT)
            {
                Attack attack = new Attack(10);
                getWorld().addObject(attack, getX() + 10, getY());
                attack.turnTowards(getX() + 100, getY());
                attackAvaible = false;
            }
            if(Greenfoot.isKeyDown("SPACE") && direction == LEFT)
            {
                Attack attack = new Attack(10);
                getWorld().addObject(attack, getX() - 1, getY());
                attack.turnTowards(getX() -100, getY());
                attackAvaible = false;
            }
            
        }
        if(attackAvaible == false)
        {
            counterAttack++;
            if(counterAttack < MAX_COUNTER_ATTACK)
            {
                return;
            }
            attackAvaible = true;
            counterAttack = 0;
        }
    }
    
    public void takeDamage()
    {
        if(pushAvaible == true)
        {
            List<Enemy> attackers = new ArrayList<Enemy>();
            attackers = getIntersectingObjects(Enemy.class);
            
            for(int i=0; i<attackers.size(); i++)
            {
                if(attackers.get(i) != null && immunityTime <= 0)
                {
                    lives = lives - attackers.get(i).getAttack();
                    if(attackers.get(i).getDirection() == RIGHT)
                    {
                        pushed(RIGHT);
                    } else
                    {
                        pushed(LEFT);
                    }
                     setImmunityTime(100);
                }
                
            }
            pushAvaible = false;
            attackers = null;
        }
        if(pushAvaible == false)
        {
            counterPushed++;
            if(counterPushed < MAX_COUNTER_PUSHED)
            {
                return;
            }
            pushAvaible = true;
            counterPushed = 0;
        }
    }
    
    private void death()
    {
        if(lives <= 0)
        {
            //PENDIENTE: QUE SUCEDE CUANDO PIERDE TODAS LAS VIDAS?
        }
    }
    
}
