import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Mosca destinada a fazer parte do jogo BeeWorld.
 * 
 * @author Cinthia Burgarelli
 * @version 2024/04/20
 */
public class Mosca extends Inseto
{
    //Campo e fields
    private int velocidade;
    //Constructor padrão (não recebe parametros)
    public Mosca(){
        velocidade = 1;
    }
    //Constructor personalizado como sobrecarga de metodos
    public Mosca(int vel, int ang){
        velocidade = vel;
        setRotation(ang); // colocando no angulo que eu passar
    }
    /**
     * Metodo Act é executado sempre que apertarmos o botão Act ou ficará em 
     * execução quando apertarmos o botão Run.
     */
    public void act()
    {
        // Add your action code here.
        move(velocidade);
        verificarCanto();        
    }
}
