import java.util.Random;

public class TextWarriors {
	
	Random rand = new Random();
	static Rogue p1 = new Rogue("Sly Coon");
	static Mage p2 = new Mage("Gandalf the White");
	static Warrior p3 = new Warrior("Rhagnar Lothbrock");
	static Cleric p4 = new Cleric("Friar John");
	public static void main(String[] args) { 
		doBattle(p3, p1);

	}
	
	public static void doBattle(Adventurer p1, Adventurer p2) {
	battle battle = new battle();
	while(p1.getVit() > 0 && p2.getVit() > 0) {
		battle.executeTurn(p1, p2);
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

