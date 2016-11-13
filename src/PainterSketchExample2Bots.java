import java.awt.Color;


public class PainterSketchExample2Bots 
{

	public static void main(String[] args) 
	{
		// Create a new PainterWorld and a 2 new PainterBots
		PainterWorld world = new PainterWorld();
		PainterBot bot1 = new PainterBot(50, 250);		
		PainterBot bot2 = new PainterBot(450, 50);
		
		//add the PainterBot objects to the PainterWorld object
		world.addPainterBot(bot1);
		world.addPainterBot(bot2);
		
		//Now have some fun...call methods on the PainterBot
		//objects to make them do stuff.
		world.setDelay(60);
		bot1.drawingOn();
		bot1.setDrawColor(Color.YELLOW);
		bot1.setDirection(PainterBot.NORTH);
		bot1.move(200);
		

		
		bot2.drawingOn();
		bot2.setDrawColor(Color.RED);
		bot2.setDirection(PainterBot.SOUTH_WEST);
		bot2.move(200);
		
		
		//start the PainterWorld...which runs the animation
		world.start();
	}

}
