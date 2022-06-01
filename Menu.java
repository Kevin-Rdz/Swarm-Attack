import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    private GreenfootSound sound=null;


    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        super(1200, 700, 1); 
        prepareMenu();
    }
    private void prepareMenu(){
        addObject(new PersonajeInicio(), 300,350);
        addObject(new Tittle(),740,230);
        addObject(new Play(),700,400);
        addObject(new ComoJugar(),900,550);
        addObject(new Records(),1000,400);
    }

    public void act()
    {
        if(sound==null || !sound.isPlaying()){
            sound= new GreenfootSound("rain.mp3");
            sound.setVolume(25);
            sound.playLoop();
        }
    }
}