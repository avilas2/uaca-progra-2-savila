import java.util.Random;

public class Adventurer {
	private String name;
	private String weapon;
	private int str;
	private int dex;
	private int intel;
	private int endu;
	private int vit;
	private int faith;
	public boolean isBlocking = false;
	
	public void attack(Adventurer target) {
		Random rand = new Random();
		System.out.println(this.name+" attacks!");
		boolean hit = (rand.nextInt(10)+1)*10 >= 100-this.dex;
		if(target.getDex()>= this.dex) {
			if((rand.nextInt(5)+1)*20<target.dex) {
				hit = false;
				target.evade();
				return;
			}
		}
		if(hit) {
		int damage = (this.str+this.dex) - (target.getEndu()+rand.nextInt(target.getStr()));
		if (target.isBlocking) {
			System.out.println(target.getName()+" blocks the attack");
			damage -= target.getStr()/2;
			target.block();
		}
		if(damage <=0) {
			damage = 0;
		}
		target.takeDamage(damage);
		System.out.println(this.name+" hits "+target.getName()+" with his "+this.weapon+". Dealing "+damage+" damage");
		System.out.println(target.getName()+" VIT: "+target.getVit());
		}
		else {
			System.out.println(this.name+"'s attack missed");
		}
	};
	public void block() {
		this.isBlocking = !this.isBlocking;
	};
	public void setName(String name) {
		this.name = name;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public void setStr(int str) {
		this.str = str;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	public void setIntel(int intel) {
		this.intel = intel;
	}
	public void setEndu(int endu) {
		this.endu = endu;
	}
	public void setVit(int vit) {
		this.vit = vit;
	}
	public void setFaith(int faith) {
		this.faith = faith;
	}
	
	public void evade() {
		System.out.println(this.name+" evades the attack");
	};
	
	public void takeDamage(int damage){
		this.vit -= damage;
	}

	public String getName() {
		return name;
	}
	public String getWeapon() {
		return weapon;
	}
	public int getStr() {
		return str;
	}
	public int getDex() {
		return dex;
	}
	public int getIntel() {
		return intel;
	}
	public int getEndu() {
		return endu;
	}
	public int getVit() {
		return vit;
	}
	public int getFaith() {
		return faith;
	}
	@Override
	public String toString() {
		return "Adventurer [name=" + name + ", weapon=" + weapon + ", str=" + str + ", dex=" + dex + ", intel=" + intel
				+ ", endu=" + endu + ", vit=" + vit + ", faith=" + faith + ", isBlocking=" + isBlocking + "]";
	}
	public Adventurer(String name, String weapon, int str, int dex, int intel, int endu, int vit, int faith) {
		this.name = name;
		this.weapon = weapon;
		this.str = str;
		this.dex = dex;
		this.intel = intel;
		this.endu = endu;
		this.vit = vit;
		this.faith = faith;
	}
	
	public void turn(Adventurer target) {};


	
}
