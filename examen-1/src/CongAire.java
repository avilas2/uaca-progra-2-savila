
public class CongAire extends Congelados{
    private double percN;
    private double percO;
    private double percCO2;
    private double percH2O;
    public CongAire(String nombre, String fechaCad, int numLote, String fechaEnv, String paisOrg, int tempMant, double percN, double percO, double percCO2, double percH2O) {
        super(nombre, fechaCad, numLote, fechaEnv, paisOrg, tempMant);
        this.percN = percN;
        this.percO = percO;
        this.percCO2 = percCO2;
        this.percH2O = percH2O;
    }

    public double getPercN() {
        return percN;
    }

    public void setPercN(double percN) {
        this.percN = percN;
    }

    public double getPercO() {
        return percO;
    }

    public void setPercO(double percO) {
        this.percO = percO;
    }

    public double getPercCO2() {
        return percCO2;
    }

    public void setPercCO2(double percCO2) {
        this.percCO2 = percCO2;
    }

    public double getPercH2O() {
        return percH2O;
    }

    public void setPercH2O(double percH2O) {
        this.percH2O = percH2O;
    }

    @Override
    public String toString() {
        return "CongAire{" + "percN=" + percN + ", percO=" + percO + ", percCO2=" + percCO2 + ", percH2O=" + percH2O + '}';
    }
    
}
