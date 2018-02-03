
public class battle {
	
	
	public battle() {
		super();
	}

	public void executeTurn(Adventurer a, Adventurer t) {
		if(a instanceof Warrior) {
			Warrior w = (Warrior)a;
			w.turn(t);
		}
		else if(a instanceof Rogue) {
			Rogue r = (Rogue)a;
			r.turn(t);			
		}
		else if(a instanceof Mage) {
			Mage m = (Mage)a;
			m.turn(t);			
		}
		else if(a instanceof Cleric) {
			Cleric c = (Cleric)a;
			c.turn(t);			
		}
	}
}
