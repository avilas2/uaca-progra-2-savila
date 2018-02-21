
public class Congelados extends Productos{
    private int tempMant; 
    public Congelados(String nombre, String fechaCad, int numLote, String fechaEnv, String paisOrg, int tempMant) {
        super(nombre, fechaCad, numLote, fechaEnv, paisOrg);
        this.tempMant = tempMant;
    }

    public int getTempMant() {
        return tempMant;
    }

    public void setTempMant(int tempMant) {
        this.tempMant = tempMant;
    }

    @Override
    public String toString() {
        return "Congelados{" + "tempMant=" + tempMant + '}';
    }
    
    
}
