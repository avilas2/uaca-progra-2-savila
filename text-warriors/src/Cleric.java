import java.util.Random;
public class Cleric extends Adventurer{
	Random rand = new Random();
	protected final static int base_str = 10;
	protected final static int base_dex = 50;
	protected final static int base_int = 60;
	protected final static int base_endu = 30;
	protected final static int base_faith = 90;
	protected final static int base_vit = 120;
	protected final static String weapon = "Holy Staff";
	
	public Cleric(String name) {
		super(name, weapon, base_str, base_dex, base_int, base_endu, base_vit, base_faith);
	}

	public void heal() {
		System.out.println(this.getName()+" uses heal!"); 
		this.setVit(Math.abs(rand.nextInt(this.getBase_faith()/4)*2));
	}
	
	public void curse(Adventurer target) {
		System.out.println(this.getName()+" cursed "+ target.getName());
		target.takeDamage(this.getFaith()+rand.nextInt(this.getIntel())-target.getFaith());
	}
		
	public int getBase_str() {
		return base_str;
	}

	public int getBase_dex() {
		return base_dex;
	}

	public int getBase_int() {
		return base_int;
	}

	public int getBase_endu() {
		return base_endu;
	}

	public int getBase_faith() {
		return base_faith;
	}

	public int getBase_vit() {
		return base_vit;
	}
	public void turn(Adventurer target) {
		switch(rand.nextInt(6)+1) {
		case 1: this.attack(target);
			break;
		case 2: if(this.isBlocking) {
				break;
			}
			else{this.block();
				break;
			}
		case 3: this.heal();
			break;					
		case 4: this.curse(target);
			break;
		case 5: this.curse(target);
			break;
		case 6: this.heal();
			break;
		}
	}
	
}
