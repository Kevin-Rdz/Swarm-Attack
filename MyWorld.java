import greenfoot.*;

public class MyWorld extends World
{
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }
    
    private void prepare()
    {
        Knight knight = new Knight();
        addObject(knight,100,100);
        Floor floor = new Floor();
        addObject(floor,241,244);
        floor.setLocation(205,331);
    }
}
