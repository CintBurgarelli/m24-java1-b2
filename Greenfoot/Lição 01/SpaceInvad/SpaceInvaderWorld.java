import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Cinthia Burgarelli 
 * @version 27-04-2024
 */
public class SpaceInvaderWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public SpaceInvaderWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Alien alien = new Alien();
        addObject(alien,427,44);
        Nave nave = new Nave();
        addObject(nave,423,651);
    }
}
