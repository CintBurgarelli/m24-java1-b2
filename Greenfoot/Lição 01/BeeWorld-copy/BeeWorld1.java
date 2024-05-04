import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe BeeWorld que representa o mundo da abelha no jogo.
 * 
 * @author Cinthia Burgarelli
 * @version 2024/04/20
 */
public class BeeWorld1 extends World
{
    //Campos e fields
    private Abelha abelha = null;
    
    /**
     * Constructor da classe BeeWorld.
     * 
     */
    public BeeWorld1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        abelha = new Abelha();
        addObject(abelha,54,62);
        
        Aranha aranha = new Aranha();
        addObject(aranha,505,163);
        
        //Utilizando o for para criar as moscas
        for (int i=0;i<20;i++){
             int pX = Greenfoot.getRandomNumber(getWidth());
             int pY = Greenfoot.getRandomNumber(getHeight());
             int vel = Greenfoot.getRandomNumber(5)+1;
             int ang = Greenfoot.getRandomNumber(360);
             //A
             addObject(new Mosca(vel,ang), pX, pY);
            }
        Mosca mosca = new Mosca();
        addObject(mosca,32,347);
        abelha.setLocation(56,68);
    }
    /**
     * Método para obter a instância da abelha criada no mundo.
     */
    public Abelha getAbelha(){
        return abelha;
    }
}
