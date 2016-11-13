
import java.awt.Color;
public class CoolStuff {
public static void main(String[] args) {
	PainterWorld world = new PainterWorld();
	PainterBot bot1 = new PainterBot(50,50);
	world.addPainterBot(bot1);
	PainterBot bot2 = new PainterBot(100,100);
	world.addPainterBot(bot2);
	PainterBot bot3 = new PainterBot(750,50);
	world.addPainterBot(bot3);
	PainterBot bot4 = new PainterBot (700,100);
	world.addPainterBot(bot4);
	
	bot1.drawingOn();
	bot1.setDrawColor(Color.CYAN);
	bot1.setDirection(PainterBot.SOUTH);
	bot1.move(100);
	bot1.setDirection(PainterBot.EAST);
	bot1.move(100);
	bot1.setDirection(PainterBot.SOUTH);
	bot1.move(100);
	bot1.setDirection(PainterBot.EAST);
	bot1.move(100);
	bot1.setDirection(PainterBot.SOUTH);
	bot1.move(100);
	bot1.setDirection(PainterBot.EAST);
	bot1.move(100);
	bot1.setDirection(PainterBot.SOUTH);
	bot1.move(100);
	bot1.setDirection(PainterBot.EAST);
	bot1.move(50);
	bot1.drawingOff();
	bot1.move(800);
	
	bot2.drawingOn();
	bot2.setDrawColor(Color.BLACK);
	bot2.setDirection(PainterBot.SOUTH);
	bot2.move(100);
	bot2.setDirection(PainterBot.EAST);
	bot2.move(100);
	bot2.setDirection(PainterBot.SOUTH);
	bot2.move(100);
	bot2.setDirection(PainterBot.EAST);
	bot2.move(100);
	bot2.setDirection(PainterBot.SOUTH);
	bot2.move(100);
	bot2.setDirection(PainterBot.EAST);
	bot2.move(100);
	bot2.setDirection(PainterBot.SOUTH);
	bot2.move(50);
	bot2.drawingOff();
	bot2.move(800);
	
	bot3.drawingOn();
	bot3.setDrawColor(Color.PINK);
	bot3.setDirection(PainterBot.SOUTH);
	bot3.move(100);
	bot3.setDirection(PainterBot.WEST);
	bot3.move(100);
	bot3.setDirection(PainterBot.SOUTH);
	bot3.move(100);
	bot3.setDirection(PainterBot.WEST);
	bot3.move(100);
	bot3.setDirection(PainterBot.SOUTH);
	bot3.move(100);
	bot3.setDirection(PainterBot.WEST);
	bot3.move(100);
	bot3.setDirection(PainterBot.SOUTH);
	bot3.move(100);
	bot3.setDirection(PainterBot.WEST);
	bot3.move(50);
	bot3.drawingOff();
	bot3.move(800);
	
	bot4.drawingOn();
	bot4.setDrawColor(Color.GRAY);
	bot4.setDirection(PainterBot.SOUTH);
	bot4.move(100);
	bot4.setDirection(PainterBot.WEST);
	bot4.move(100);
	bot4.setDirection(PainterBot.SOUTH);
	bot4.move(100);
	bot4.setDirection(PainterBot.WEST);
	bot4.move(100);
	bot4.setDirection(PainterBot.SOUTH);
	bot4.move(100);
	bot4.setDirection(PainterBot.WEST);
	bot4.move(100);
	bot4.setDirection(PainterBot.SOUTH);
	bot4.move(50);
	bot4.drawingOff();
	bot4.move(800);
	
	
	world.setDelay(1);
	world.start();
}
}
