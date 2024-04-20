// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(800, 600, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Aranha aranha =  new  Aranha();
        addObject(aranha, 252, 153);
        Abelha abelha =  new  Abelha();
        addObject(abelha, 44, 338);
        Mosca mosca =  new  Mosca();
        addObject(mosca, 558, 43);
        abelha.setLocation(71, 57);
        mosca.setLocation(29, 336);
        aranha.setLocation(472, 184);
    }
}
