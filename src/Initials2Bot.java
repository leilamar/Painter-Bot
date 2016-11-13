import java.awt.Color;


public class Initials2Bot {
	public static void main(String[] args) {
		PainterWorld world = new PainterWorld();
		PainterBot bot1 = new PainterBot(50, 50);
		world.addPainterBot(bot1);
		PainterBot bot2 = new PainterBot(220, 250);
		world.addPainterBot(bot2);
		
		bot1.drawingOn();
		bot1.setDrawColor(Color.MAGENTA);
		bot1.setDirection(PainterBot.SOUTH);
		bot1.move(200);
		bot1.setDirection(PainterBot.EAST);
		bot1.move(100);
		
		bot2.drawingOn();
		bot2.setDrawColor(Color.CYAN);
		bot2.setDirection(PainterBot.NORTH);
		bot2.move(200);
		bot2.setDirection(PainterBot.SOUTH_EAST);
		bot2.move(50);
		bot2.setDirection(PainterBot.NORTH_EAST);
		bot2.move(50);
		bot2.setDirection(PainterBot.SOUTH);
		bot2.move(200);
		
		world.start();
	}
}
