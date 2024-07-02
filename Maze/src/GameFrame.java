
public class GameFrame extends MyFrame{
	public void run() {
		Wall wall1=new Wall(10,50,3,0);
		for(int j=0; j<=3; j++) {
		for(int i=0; i<=15; i++) {
		
		wall1.draw(this);
		wall1.move();
		
		}
		
		}
	
	}

}
