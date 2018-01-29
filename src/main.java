import java.util.Random;

public class main {
	
	Random rand = new Random();
	static Rogue p1 = new Rogue("Sly Coon");
	static Mage p2 = new Mage("Gandalf the White");
	static Warrior p3 = new Warrior("Rhagnar Lothbrock");
	static Cleric p4 = new Cleric("Papa Francisco");
	public static void main(String[] args) { 
		doBattle(p3, p4);

	}
	
	public static void doBattle(Adventurer p1, Adventurer p2) {
	while(p1.getVit() > 0 && p2.getVit() > 0) {
		p1.turn(p2);
		if(p2.getVit()<=0) {
			System.out.println(p2.getName()+" is dead!");
			break; 
		}
		p2.turn(p1);
		if(p1.getVit()<=0) {
			System.out.println(p1.getName()+ " is dead!");
			break;
		}
	}
	}
}

