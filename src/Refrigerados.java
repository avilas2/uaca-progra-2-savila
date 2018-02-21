
public class Refrigerados extends Productos {
    
    private int tempMant;
    private int codOSA;
    
    public Refrigerados(String nombre, String fechaCad, int numLote, String fechaEnv, String paisOrg, int codOSA, int tempMant) {
        super(nombre, fechaCad, numLote, fechaEnv, paisOrg);
        this.codOSA = codOSA;
        this.tempMant = tempMant;

    }

    public int getTempMant() {
        return tempMant;
    }

    public void setTempMant(int tempMant) {
        this.tempMant = tempMant;
    }

    public int getCodOSA() {
        return codOSA;
    }

    public void setCodOSA(int codOSA) {
        this.codOSA = codOSA;
    }

	@Override
	public String toString() {
		return "Refrigerados [tempMant=" + tempMant + ", codOSA=" + codOSA + "]";
	}

    
    
}
