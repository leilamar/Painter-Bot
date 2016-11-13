import java.awt.Color;


public class PainterSketchExample 
{

	public static void main(String[] args) 
	{
		// Create a new PainterWorld and a new PainterBot
		PainterWorld world = new PainterWorld();
		PainterBot bot = new PainterBot(50, 250);
		
		//add the PainterBot object to the PainterWorld object
		world.addPainterBot(bot);
		
		
		//Now have some fun...call methods on the PainterBot
		//object to make it do stuff. Spell your name :)
		bot.drawingOn();
		bot.setDrawColor(Color.YELLOW);
		bot.setDirection(PainterBot.NORTH);
		bot.move(200);
		
		
		bot.setDirection(PainterBot.EAST);
		bot.move(100);
		
		
		
		bot.setDrawColor(Color.RED);
		bot.setDirection(PainterBot.SOUTH);
		bot.move(200);
		
		bot.setDirection( PainterBot.WEST);
		bot.move(100);
		
		
		//move without leaving a trail...and move quickly
		world.setDelay(15);	//sets delay to 15 milliseconds
		bot.drawingOff();
		bot.setDirection(PainterBot.EAST);
		bot.move(200);
		
		//leave a trail again...but move really quickly
		world.setDelay(7);
		bot.drawingOn();
		bot.setDrawColor(Color.BLUE);
		bot.setDirection(PainterBot.NORTH);
		bot.move(200);
		bot.setDirection(PainterBot.SOUTH);
		bot.move(100);
		
		
		bot.setDirection(PainterBot.EAST);
		bot.setDrawColor(Color.GREEN);
		bot.move(100);
		bot.setDirection(PainterBot.SOUTH);
		bot.move(50);
		
		//slow down and change color for a kewl finish
		bot.setDrawColor(Color.PINK);
		world.setDelay(70);
		bot.move(50);
		
		
		
		//start the PainterWorld...which runs the animation...without this line, you will see no action onscreen
		world.start();
	}

}
