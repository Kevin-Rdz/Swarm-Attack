import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class back extends Botones
{
    /**
     * Act - do whatever the back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            GreenfootSound  sound = new GreenfootSound("minecraft_click.mp3");
            sound.setVolume(100);
            Greenfoot.delay(10);
            sound.play();
            Greenfoot.delay(40);
            Greenfoot.setWorld(new Menu());
        }
    }
}
