import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe abelha para ser utilizada no jogo BeeWorld
 * 
 * @author Cinthia Burgarelli 
 * @version 2024/04/20
 */
public class Abelha extends Actor
{
    /**
     * Método que será executado quando apertado o botão Act ou Run
     */
    public void act()
    {
        // Add your action code here.
        move(1);
    //Se teclar para direita, gira -10    
    if (Greenfoot.isKeyDown("left")){
       turn(-10);
    }
    //Se teclar para direita, gira 10
    if (Greenfoot.isKeyDown("right")){
        turn(10);
    }
}
}
