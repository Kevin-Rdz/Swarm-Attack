import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends Levels
{

    /**
     * Constructor for objects of class Dos.
     * 
     */
    public Level2()
    {
        prepare();
        items();
    }
    private void prepare()
    {
        Knight knight = new Knight();
        addObject(knight,100,100);
        Floor floor = new Floor();
        addObject(floor,207,544);
        Floor floor2 = new Floor();
        addObject(floor2,206,180);
        Floor floor1 = new Floor();
        addObject(floor1,406,180);
        Floor floor4 = new Floor();
        addObject(floor4,670,544);
        Floor floor5 = new Floor();
        addObject(floor5,850,350);
        Floor floor6 = new Floor();
        addObject(floor6,980,130);

        addObject(new Portal2(),100,410); 
    }
    public void items(){
        for(int x=130;x<370;x+=40){
            addObject(new Orbe(), x, 470);
        }
        for(int x=130;x<600;x+=40){
            addObject(new Orbe(), x, 110);
        }
        for(int x=800;x<1200;x+=40){
            addObject(new Orbe(), x, 280);
            addObject(new Orbe(), x, 50);
        }
        for(int x=500;x<750;x+=40){
            addObject(new Orbe(), x, 470);
        }
        
    }
}
