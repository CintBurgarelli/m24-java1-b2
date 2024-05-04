import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aranha here.
 * 
 * @author Cinthia Burgarelli 
 * @version 2024/04/20
 */
public class Aranha extends Inseto
{
    /**
     * Act - do whatever the Aranha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        //Verifica se o numero aleatorio de 1 a 100 esta menor ou igual a 10
        if (Greenfoot.getRandomNumber(100)+1 <=20) {
            //Add aletatoriamente de -45 a 45º para rotacionar
            turn(Greenfoot.getRandomNumber(91)-45);
        }
        verificarCanto();
        acelerarAranha();
        //Captura a aranha se estiver no alcance
        capturaMosca();
        //Interceptando a abelha
        interceptarAbelha();
    }
    /**
     * Metodo que vai acelerar a aranha em determinada area do tabuleiro
     */
    public void acelerarAranha(){
       if (getX()>=200 && getX()<=600 &&
           getY()>=100 && getY()<=500){
           move(2);
       }
    }

    public void capturaMosca(){
        //Verificando se tocou na mosca
        if (isTouching(Mosca.class)) {
         //Remove a mosca tocada.
         removeTouching(Mosca.class);
         //Adicionando uma nova mosca no mundo
         int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
         int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
         getWorld().addObject(new Mosca(), pX, pY);
     }
    }
    
    public void interceptarAbelha(){
                    //Cast de BeeWorld1 => Força o mundo a ser do tipo BeeWorld1
        Abelha ab = ((BeeWorld1) getWorld()).getAbelha();
        if(ab!=null) {
            turnTowards(ab.getX(), ab.getY());
        }
    }
}


