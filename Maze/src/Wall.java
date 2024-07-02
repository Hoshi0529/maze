
public class Wall {
	int x,y,vx,vy;
	public Wall(int x,int y,int vx,int vy){
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
		
	}

	public void draw(MyFrame frame) {
		
		frame.fillRect(x+20, y+20, 20, 20);
	}
	
	public void move() {
		
		if(x<=300 ) {
		x+=20;
		}
		else if(y<=300) {
			y+=20;
		}
		else if(x>=20) {
			x-=20;
		}
		else {
			y-=20;
		}
	}
		
	
	
}
