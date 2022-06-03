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
    private static Knight knight;
    private static int points=0;
    public Level2()
    {
        prepare();
        items();
    }
     public static int getScore(){
        points+=knight.getPuntuacion();
        knight.score = 0;
        return points+1;
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
        HuskHornhead huskHornhead = new HuskHornhead();
        addObject(huskHornhead,250,440);
        HuskBully huskbully = new HuskBully();
        addObject(huskbully,650,440);
        LeapingHusk leapingHusk = new LeapingHusk();
        addObject(leapingHusk,350,90);
        Spikes uno = new Spikes();
        addObject(uno,580,117);
        Spikes dos = new Spikes();
        addObject(dos,675,286);
        Crawlid crawlid = new Crawlid();
        addObject(crawlid,900,250);
        Live vida = new Live();
        addObject(vida,1000,50);
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
            addObject(new Orbe(), x, 50);
        }
        for(int x=750;x<1000;x+=40){
            addObject(new Orbe(), x, 280);
        }
        for(int x=500;x<750;x+=40){
            addObject(new Orbe(), x, 470);
        }
        
    }
}
