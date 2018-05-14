

import java.awt.Color;
import java.awt.Graphics2D;

public class SpaceShip extends Sprite{

	int step = 16;
	
	public SpaceShip(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}

	@Override
	public void draw(Graphics2D g) {
		//g.setColor(Color.GREEN);
		//g.fillRect(x, y, width, height);

		g.setColor(Color.YELLOW);
		g.fillRect(x+3,y-10,15,10);
		g.setColor(Color.GREEN);
		g.fillRect(x,y+20,8,15);
		g.setColor(Color.GREEN);
		g.fillRect(x+12,y+20,8,15);
			
		
		g.setColor(Color.PINK);
		g.fillRect(x+15,y,10,15);
		g.setColor(Color.PINK);
		g.fillRect(x-5,y,5,15);


		g.setColor(Color.RED);
		g.fillRect(x,y,width,height);
		
	}

	public void move(int direction){
		x += (step * direction);
		if(x < 0)
			x = 0;
		if(x > 400 - width)
			x = 400 - width;
	}

}
