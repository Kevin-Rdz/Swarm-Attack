import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
import java.io.*;
import java.io.File;

/**
 * Write a description of class Save here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Save extends Botones
{
    /**
     * Act - do whatever the Save wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String name;
    private int flag=0;
    private Integer[] score;
    private String[] nombres;

    public Save(){
        flag=0;
        score =new Integer[6];
        nombres =new String[6];
        lecturaNombres(nombres);
        lecturaPuntos(score);
    }

    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            name=JOptionPane.showInputDialog("GamerTag: ");
            flag=1;
        }
    }

    public String getName(){
        return name;
    }

    public int getFalgStatus(){
        return flag;
    }

    public void setFalgStatus(){
        flag=0;
    }

    public void lecturaNombres(String[] nombres) {
        int i=0;
        try
        {
            FileReader fileNombre=new FileReader("Nombre de Scores.txt");
            BufferedReader bufferedReader=new BufferedReader(fileNombre);
            String nombre;
            while((nombre=bufferedReader.readLine())!=null && i<5) 
            {
                nombres[i]=nombre;
                i++;
            }
            fileNombre.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public void lecturaPuntos(Integer[] puntos) {
        int i=0;
        int punto;
        try
        {
            FileReader filePuntos=new FileReader("Puntajes de scores.txt");
            BufferedReader bufferedReader=new BufferedReader(filePuntos);
            String score;
            while((score=bufferedReader.readLine())!=null && i<5) 
            {
                punto=Integer.parseInt(score);
                puntos[i]=punto;
                i++;
            }
            filePuntos.close();

        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public void eliminarArchivos(){
        File nombres;
        File puntos;
        nombres= new File("Nombre de Scores.txt");
        puntos = new File("Puntajes de scores.txt");
        nombres.delete();
        puntos.delete();
    }

    public void guardado(int finalPoints){
        if(getFalgStatus() == 1){
            insertNuevoScore(finalPoints);
            eliminarArchivos();
            guardaNombres();
            guardaPuntos();
            setFalgStatus();
        }
    }

    public void insertNuevoScore(int finalPoints){
        score[5]=finalPoints;
        nombres[5]=name;
        ordenaScore();
    }

    public void ordenaScore(){
        int i,j,k;
        for(i=0;i<score.length-1; i++){
            k = i;
            for (j = i + 1; j < score.length; j++){
                if (score[j] > score[k]){
                    k = j;
                }
            }
            if (k != i)
                intercambiar ( i, k);
        }
    }

    public void intercambiar (int i, int j)
    {
        int auxscore=score[i];
        score[i] = score[j];
        score[j] = auxscore;
        
        String auxnombre=nombres[i];
        nombres[i] = nombres[j];
        nombres[j] = auxnombre;
    }
    
    public void guardaNombres()
    {
        try
        {
            BufferedWriter fileNombres=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Nombre de Scores.txt",true)));
            for(int i=0; i<6;i++){
                fileNombres.write(""+ nombres[i]); 
                fileNombres.write("\n");
            }
            fileNombres.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public void guardaPuntos() 
    {
        try
        {
            BufferedWriter puntos=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Puntajes de scores.txt",true)));
            for(int i=0; i<6;i++){
                puntos.write(""+ score[i]);
                puntos.write("\n");
            }
            puntos.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    } 
}

