import java.util.Random;
public class Warrior extends Adventurer{
	Random rand = new Random();
	protected final static int base_str = 90;
	protected final static int base_dex = 50;
	protected final static int base_int = 20;
	protected final static int base_endu = 70;
	protected final static int base_faith = 10;
	protected final static int base_vit = 250;
	protected final static String weapon = "Axe";
	
	public Warrior(String name) {
		super(name, weapon, base_str, base_dex, base_int, base_endu, base_vit, base_faith);
	}

	public void warCry() {
		System.out.println(this.getName()+" let out a roar!"); 
		this.setStr(base_str*2);
		this.setDex(base_dex/2);
	}
	
	public void focus() {
		System.out.println(this.getName()+" is focusing his next attack");
		this.setStr(this.getStr() - base_dex/2 );
		this.setDex(this.getDex() + base_str/5);
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
		case 3: this.focus();
			break;					
		case 4: this.warCry();
			break;
		case 5: this.block();
			break;
		case 6: this.attack(target);
			break;
		}
	}
	
}
