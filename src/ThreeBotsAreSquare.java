import java.awt.Color;


public class ThreeBotsAreSquare {
	public static void main(String[] args) {
		PainterWorld world = new PainterWorld();
		PainterBot bot1 = new PainterBot(50, 50);
		world.addPainterBot(bot1);
		PainterBot bot2 = new PainterBot(100, 100);
		world.addPainterBot(bot2);
		PainterBot bot3 = new PainterBot(150,150);
		world.addPainterBot(bot3);
		
		bot1.drawingOn();
		bot1.setDrawColor(Color.MAGENTA);
		bot1.setDirection(PainterBot.SOUTH);
		bot1.move(400);
		bot1.setDirection(PainterBot.EAST);
		bot1.move(400);
		bot1.setDirection(PainterBot.NORTH);
		bot1.move(400);
		bot1.setDirection(PainterBot.WEST);
		bot1.move(400);
		
		bot2.drawingOn();
		bot2.setDrawColor(Color.BLACK);
		bot2.setDirection(PainterBot.SOUTH);
		bot2.move(300);
		bot2.setDirection(PainterBot.EAST);
		bot2.move(300);
		bot2.setDirection(PainterBot.NORTH);
		bot2.move(300);
		bot2.setDirection(PainterBot.WEST);
		bot2.move(300);
		
		bot3.drawingOn();
		bot3.setDrawColor(Color.YELLOW);
		bot3.setDirection(PainterBot.SOUTH);
		bot3.move(200);
		bot3.setDirection(PainterBot.EAST);
		bot3.move(200);
		bot3.setDirection(PainterBot.NORTH);
		bot3.move(200);
		bot3.setDirection(PainterBot.WEST);
		bot3.move(200);
		
		world.start();
}
}