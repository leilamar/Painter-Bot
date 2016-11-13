import java.awt.Color;

//Leila Mardoum
//September 24, 2014
public class Initials {
	public static void main(String[] args) {
		PainterWorld world = new PainterWorld();
		PainterBot bot = new PainterBot(50, 50);
		world.addPainterBot(bot);
		
		bot.drawingOn();
		bot.setDrawColor(Color.RED);
		bot.setDirection(PainterBot.SOUTH);
		bot.move(200);
		bot.setDirection(PainterBot.EAST);
		bot.move(100);
		
		bot.drawingOff();
		bot.move(50);
		bot.setDrawColor(Color.BLUE);
		bot.drawingOn();
		bot.setDirection(PainterBot.NORTH);
		bot.move(200);
		
		bot.setDirection(PainterBot.SOUTH_EAST);
		bot.move(50);
		bot.setDirection(PainterBot.NORTH_EAST);
		bot.move(50);
		bot.setDirection(PainterBot.SOUTH);
		bot.move(200);
		
		world.start();

	}
}
