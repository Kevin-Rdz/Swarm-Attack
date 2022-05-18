import greenfoot.*;

public class MyWorld extends World
{
    public MyWorld()
    {
        super(1200, 600, 1);
        prepare();
    }
    
    private void prepare()
    {
        Knight knight = new Knight();
        addObject(knight,100,100);
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
    }
}
