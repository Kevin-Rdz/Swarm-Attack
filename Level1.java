import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Uno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Levels
{

    /**
     * Constructor for objects of class Uno.
     * 
     */
    public Level1()
    {

        prepare();
        items();
    }
    public void items(){
        for(int x=100;x<370;x+=40){
            addObject(new Orbe(), x, 110);
            addObject(new Orbe(), x, 470);
        }
        for(int x=400;x<800;x+=40){
            addObject(new Orbe(), x, 350);
        }
        for(int x=810;x<1090;x+=40){
            addObject(new Orbe(), x, 150);
            addObject(new Orbe(), x, 470);
        }
        
        
        
        
        
    }
    private void prepare()
    {
        Knight knight = new Knight();
        addObject(knight,70,100);
        Floor floor = new Floor();
        addObject(floor,241,244);
        floor.setLocation(205,331);
        floor.setLocation(277,544);
        Floor floor2 = new Floor();
        addObject(floor2,206,180);
        Floor floor3 = new Floor();
        addObject(floor3,559,428);
        Floor floor4 = new Floor();
        addObject(floor4,947,525);
        Floor floor5 = new Floor();
        addObject(floor5,963,227);
        floor.setLocation(274,534);
        floor.setLocation(235,536);
        HuskHornhead huskHornhead = new HuskHornhead();
        addObject(huskHornhead,146,440);
        huskHornhead.setLocation(186,463);
        LeapingHusk leapingHusk = new LeapingHusk();
        addObject(leapingHusk,543,260);
        huskHornhead.setLocation(227,448);
        Crawlid crawlid = new Crawlid();
        addObject(crawlid,977,137);
        addObject(new Portal1(),1100,410); 
    }
    }

