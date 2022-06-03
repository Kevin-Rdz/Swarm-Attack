import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouWon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouWon extends World
{

    /**
     * Constructor for objects of class YouWon.
     * 
     */
    public int finalPoints;
    public Save save=new Save();
    private String name;
    public YouWon()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1); 
        finalPoints=0;
        finalPoints=finalPoints+Level1.getScore();
        finalPoints=finalPoints+Level2.getScore();
        finalPoints=finalPoints+Level3.getScore();
        finalPoints=finalPoints-3;
        showText("PUNTAJE FINAL = "+finalPoints, 450, 600);
        addObject(new back(),100,650);
        addObject(save,802,650);
    }
    public void act(){
        if(save.getFalgStatus() == 1){
            save.guardado(finalPoints);
       }
    }
}
