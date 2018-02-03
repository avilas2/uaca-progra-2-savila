import java.util.Random;
public class Rogue extends Adventurer{
	Random rand = new Random();
	private boolean poisonedDagger;
	private boolean certainHitActive;
	protected final static int base_str = 50;
	protected final static int base_dex = 80;
	protected final static int base_int = 40;
	protected final static int base_endu = 40;
	protected final static int base_faith = 10;
	protected final static int base_vit = 150;
	protected final static String weapon = "Dagger";
	
	public Rogue(String name) {
		super(name, weapon, base_str, base_dex, base_int, base_endu, base_vit, base_faith);
	}

	public void maxSpeed() {
		System.out.println(this.getName()+" has maximized his speed"); 
		this.setDex(100);
		this.certainHitActive = true;
	}
	
	public void poisonDagger() {
		if(!poisonedDagger) {
		System.out.println(this.getName()+" pulls out a poisoned dagged");
		this.setStr(this.getStr()+20);
		poisonedDagger = true;
		}
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
			if(this.certainHitActive) {
				this.certainHitActive = false;
			}
			break;
		case 2: if(this.isBlocking) {
				break;
			}
			else{this.block();
				break;
			}
		case 3: this.maxSpeed();
			break;					
		case 4: this.poisonDagger();
			break;
		case 5: this.block();
			break;
		case 6: this.attack(target);
			if(this.certainHitActive) {
				this.certainHitActive = false;
			}
			break;
		}
	}
	
	
}
