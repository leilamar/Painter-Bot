import java.awt.Color;
public class MoreCoolStuff {
	public static void main(String[] args) {
		PainterWorld world = new PainterWorld();
		PainterBot bot1 = new PainterBot(100,200);
		world.addPainterBot(bot1);
		PainterBot bot2 = new PainterBot(100,200);
		world.addPainterBot(bot2);
		
		bot1.drawingOn();
		bot1.setDrawColor(new Color(255,0,220));
		bot1.setDirection(PainterBot.SOUTH);
		bot1.move(100);
		bot1.setDirection(PainterBot.EAST);
		bot1.move(100);
		bot1.setDirection(PainterBot.NORTH);
		bot1.move(100);
		bot1.setDirection(PainterBot.WEST);
		bot1.move(100);
		
		bot2.drawingOn();
		bot2.setDrawColor(new Color(255,0,220));
		bot2.setDirection(PainterBot.NORTH_EAST);
		bot2.move(100);
		bot2.setDrawColor(new Color(255,0,220));
		bot2.setDirection(PainterBot.EAST);
		bot2.move(100);
		bot2.setDirection(PainterBot.SOUTH);
		bot2.move(100);
		bot2.setDirection(PainterBot.WEST);
		bot2.move(100);
		bot2.setDirection(PainterBot.NORTH);
		bot2.move(100);
		
		bot1.drawingOff();
		bot1.setDrawColor(new Color(255,0,220));
		bot1.setDirection(PainterBot.SOUTH);
		bot1.move(100);
		bot1.setDirection(PainterBot.EAST);
		bot1.move(100);
		bot1.drawingOn();
		bot1.setDirection(PainterBot.NORTH_EAST);
		bot1.move(100);
		
		
		world.start();
	}
}
