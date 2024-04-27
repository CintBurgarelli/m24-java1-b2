import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe que representa a nave no jogo.
 * 
 * @author Cinthia Burgarelli
 * @version 27-04-202
 * 
 */
public class Nave extends Actor
{
    /**
     * Act - do whatever the Nave wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("left")){
            move(-1);
        }
        //
        if (Greenfoot.isKeyDown("right")){
            move(1);
        }
        //Verificando se foi teclado a barra de espaço, criamos a bala
        if (Greenfoot.isKeyDown("space")){
            getWorld().addObject(new Bala(), getX(), getY()-40);
        }
    }
}
