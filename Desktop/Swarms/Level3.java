import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tres here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends Levels
{

    /**
     * Constructor for objects of class Tres.
     * 
     */
     public Level3()
    {
        prepare();
        items();
    }
    private void prepare()
    {
        Knight knight = new Knight();
        addObject(knight,1130,70);
        Floor floor = new Floor();
        addObject(floor,241,244);
        floor.setLocation(205,331);
        floor.setLocation(277,544);
        Floor floor2 = new Floor();
        addObject(floor2,206,180);
        Floor floor3 = new Floor();
        addObject(floor3,650,350);
        Floor floor4 = new Floor();
        addObject(floor4,947,525);
        Floor floor5 = new Floor();
        addObject(floor5,963,150);
        
        addObject(new Portal3(),1100,410); 
    }
    public void items(){
        for(int x=100;x<370;x+=40){
            addObject(new Orbe(), x, 110);
            addObject(new Orbe(), x, 470);
        }
        for(int x=480;x<800;x+=40){
            addObject(new Orbe(), x, 280);
        }
        for(int x=810;x<1090;x+=40){
            addObject(new Orbe(), x, 90);
            addObject(new Orbe(), x, 470);
        }
        
    }
}
