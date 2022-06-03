import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portal1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portal1 extends Portal
{
    /**
     * Act - do whatever the Portal1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(isTouching(Knight.class)){
            Greenfoot.setWorld(new Level2());
        }
    }   
    }

