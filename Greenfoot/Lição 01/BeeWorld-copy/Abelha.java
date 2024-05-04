import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe abelha para ser utilizada no jogo BeeWorld
 * 
 * @author Cinthia Burgarelli 
 * @version 2024/04/20
 */
public class Abelha extends Actor
{
    //Constantes
    public static int PONTOS = 100;
    //Campos ou fields
    public int vidas = 0;
    public int score = 0;
    //Criando campo do tipo conjunto de imagens
    private GreenfootImage[] imagens;
    //Constructors
    public Abelha(){
        vidas = 3;
        score = 0;
        //Definir o tamanho do conjunto 
        imagens = new GreenfootImage[4]; //definindo o tamanho do conjunto em 4 elementos 
        //Definir as imagens
        for (int i=0;i<4;i++){
            imagens[i] = new GreenfootImage("bee0"+(i+1)+".png");
        }
    }
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
    //Verificando se está nos cantos
    verificarPosicao();
    //Verifica se toca em uma mosca
    capturaMosca();
    //Verifica se foi capturada pela aranha
    capturaPelaAranha();
    //Mostrando vidas
    mostrarVidas();
    //Mostra score
    mostrarScore();
 }
 /**
  * Método que verifica se está na direita do mundo
  */
 public boolean isNaDireita(){
     if (getX() > getWorld().getWidth()-10){
         return true;
         
     }return false;
 }
 /**
  * Método que verifica se esta na esquerda do mundo
  */
 public boolean isNaEsquerda(){
     return (getX()<10);
 }
 /**
  * Método que verifica se está no topo do mundo
  */
 public boolean isNaBase(){
     return (getY() > getWorld().getHeight()-10);
 }
 /**
  * Método que verifica se está no topo do mundo
  */
 public boolean isNoTopo(){
     return (getY() < 10);
 }
 /**
 * Método que verifica se a abelha está nos cantos e reposiciona ela
 */ 
 public void verificarPosicao(){
    //Verificando se está na direita
    if (isNaDireita()){
        setLocation(10, getY());
    }
    //Verifica se esta na esquerda
    if (isNaEsquerda()){
        setLocation(getWorld(). getWidth()-10, getY());
    }
    //Verifica se está no topo do mundo
    if (isNoTopo()){
        setLocation(getX(), getWorld().getHeight()-10);
    }
    //Verifica se esta na base do mundo
    if (isNaBase()){
        setLocation(getX(),-10);
    }
 }
 /**
  * Método de captura a mosca
  */
 public void capturaMosca(){
     //Verificando se tocou na mosca
     if (isTouching(Mosca.class)) {
         //Remove a mosca tocada.
         removeTouching(Mosca.class);
         //Aumentar score
         score += PONTOS; //score + score + PONTOS
         //Adicionando uma nova mosca no mundo
         int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
         int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
         getWorld().addObject(new Mosca(Greenfoot.getRandomNumber(5)+1, Greenfoot.getRandomNumber(359)), pX, pY);
     }
 }
 /**
  * Método que irá capturar a abelha pela aranha
  */
 public void capturaPelaAranha(){
     if (isTouching(Aranha.class)){
         int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
         int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
         setLocation(pX, pY);
         vidas--; //decremento
         vidas -=1; //vidas = vidas -1; 
         if (vidas<1){
             Greenfoot.stop();
             getWorld().showText("GAMER OVER", 400, 300);
         }
     }
 }

 public void mostrarVidas(){
     getWorld().showText("Vidas: " + vidas, 60, 20);
 }
 public void mostrarScore(){
     getWorld().showText("Score: " + score, 700, 20);
 }
}

