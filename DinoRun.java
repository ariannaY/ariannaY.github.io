//1:11 ish - talking about starting game...talking about something...like you should..shouldn;t 
package dinorun;

//import ddf.minim.AudioPlayer;
//import ddf.minim.Minim;
import processing.core.PApplet;
import processing.core.PImage;


public class DinoRun extends PApplet 
{
	PImage img;
	//Minim minim;
	//AudioPlayer song;
	
	public static void main(String[] args)
	{
		PApplet.main("dinorun.DinoRun");

	}

	//list of objects in our game
	Avatar avatar; 
	
	Obstacle[] obstacleArray;
	
	public void settings()
	{
		size(1280, 640);
	}
	
	public void setup() 
	{
		img = loadImage("dinorunbackground.png");
		background(img);
		//build our main character:
		//(this, "avatar.png", 30, 500, 50, 41)
		avatar = new Avatar(this, "avatar.png", width/5, 450, 50, 41);
		//song = minim.loadFile("dinorunpiano.mp3", 512);
		//song.play();
		//song.loop();
		//song.setVolume(30);
		obstacleArray = new Obstacle[5];
		for(int i = 0; i < 5; i++)
		{
			//System.out.println("Count is:" + i);
			obstacleArray[i] = new Obstacle(this, width/2 - 100 + i*200, height-200, 40, 180);
		}	
	}

	public void draw()
	{
		//100, 30, 250
		background(img);
		avatar.display();
		//obstacleArray.draw();
		for(int i = 0; i < 5; i++)
		{
			obstacleArray[i].draw();
			
		}

	}
	
	public void keyPressed()
	{
		if(key == 'w')
		{
			avatar.activateJump();
		}
		
	}
}

//when m choosing dinasour, choose one, then said actually this one is much cuter. only me: heheh. and then a sec later everyone else after someone said something. 
//2:11 'while everyone is copying it down i need to run to the bathroom desparately' (M)
//percedes
//most meteor showers are like 200. um. 200 an hour. 600. thats like 600 witches! (swirls finger in air small)
//1:49 ish - just helped me with the photoshop thing, stepped back and just told me yeah just save as...touches left side of my head accidentally, like a one sec thing. M: "sorry..i just touched your hair.. :|"
//3:07 ish - M: thank you guys for coming back on time. i really needed a breather. i needed a cookie. like i couldn't have survived withouta cookie (something), my bad. and it wasn't a really good cookie either xD
//3:11 me: oh. can we like make like music when you do something. like sound effects for actions...
//M: we already know how to add music already...like we can put it in "jump" so when you press spacebar it'll be boing, boing :)
//add a personal background
//add music via import
//making obstacles
//moving obstacles
//"jump"

//4:22 ish - hey i just found out the meteor shower starts at midnight. (kelly actuallyh said that before)

//4:29 ish - roh you're next. (he was helping an) (but my name was after her...it got erased bc needed to explain on board)
