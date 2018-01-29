import java.util.Random;
public class Mage extends Adventurer{
	Random rand = new Random();
	protected final static int base_str = 20;
	protected final static int base_dex = 40;
	protected final static int base_int = 80;
	protected final static int base_endu = 30;
	protected final static int base_faith = 60;
	protected final static int base_vit = 150;
	protected final static String weapon = "Staff";
	
	public Mage(String name) {
		super(name, weapon, base_str, base_dex, base_int, base_endu, base_vit, base_faith);
	}

	public void castSpell(Adventurer target) {
		System.out.println(this.getName()+" cast a spell!"); 
		int damage = this.getIntel()+this.getStr() - target.getIntel();
		target.takeDamage(damage);
		System.out.println(this.getName()+"'s spell hits "+target.getName()+" dealing "+damage+" damage!");
	}
	
	public void confuse(Adventurer target) {
		System.out.println(this.getName()+" confused "+ target.getName());
		target.setDex(target.getDex()-this.getEndu());
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
		case 3: this.castSpell(target);
			break;					
		case 4: this.confuse(target);
			break;
		case 5: this.confuse(target);
			break;
		case 6: this.castSpell(target);
			break;
		}
	}
	
}
