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
        Spikes spikes = new Spikes();
        addObject(spikes,562,364);
        Spikes spikes2 = new Spikes();
        addObject(spikes2,800,458);
        Spikes spikes3 = new Spikes();
        addObject(spikes3,317,468);
        Crawlid crawlid = new Crawlid();
        addObject(crawlid,961,156);
        crawlid.setLocation(957,102);
        HuskBully huskBully = new HuskBully();
        addObject(huskBully,651,324);
        huskBully.setLocation(1143,434);
        huskBully.setLocation(1085,425);
        huskBully.setLocation(1041,396);
        huskBully.setLocation(1079,429);
        huskBully.setLocation(904,371);
        spikes2.setLocation(1138,460);
        huskBully.setLocation(953,429);
        HuskHornhead huskHornhead = new HuskHornhead();
        addObject(huskHornhead,146,440);
        spikes3.setLocation(304,466);
        spikes3.setLocation(226,121);
        huskHornhead.setLocation(186,463);
        LeapingHusk leapingHusk = new LeapingHusk();
        addObject(leapingHusk,543,260);
        huskHornhead.setLocation(227,448);
    }
}
