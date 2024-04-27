import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe que representa Brosler
 * 
 * @author Cinthia Burgarelli 
 * @version (a version number or a date)
 */
public class Bala extends Actor
{
    /**
     * Act - do whatever the Bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY()-5);
        //Se atingir o topo, romevemos a bala do mundo
        if(isAtEdge()){
            getWorld(). removeObject(this);
        }
        //Se atingir o alien, removemos e criamos um novo alien
        removerAlien();
    }
    /**
     * Método que identifica se a bala atingiu o alien e remove-0 se atingido
     */
    public void removerAlien(){
        if(isTouching(Alien.class)){
            removeTouching(Alien.class);
            //Criando um novo alien
            getWorld().addObject(new Alien(),
                Greenfoot.getRandomNumber(getWorld().getWidth()),50);
        }
    }
}
