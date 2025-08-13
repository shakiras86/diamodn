import kareltherobot.*;

public class Main implements Directions{
  public static void main(String[] args) {
   int size = 7;
    World.setVisible(true);// allows us to see the run
    World.setDelay(0);
    World.setSize(2*size-1, 2*size-1);
    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    Robot leftUp = new Robot(1,size ,North, 1000);
		Robot leftDown = new Robot(7,8-size ,South, 1000);
    Robot rightUp = new Robot(0,size*2 ,North, 1000);
    Robot rightDown = new Robot(size, 0, South, 1000);
    // examples of commands you can invoke on a Robot
   // move one step in the direction it is facing
  for(int i=0; i < size; i++){
  leftUp.putBeeper();
    leftUp.move();
  leftUp.turnLeft();
  leftUp.turnLeft();
  leftUp.turnLeft();
  leftUp.move();

leftUp.turnLeft();
  }

}}