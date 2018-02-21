public class CongNitro extends Congelados {
    private String metodo;
    private int tiempoSec;
    public CongNitro(String nombre, String fechaCad, int numLote, String fechaEnv, String paisOrg, int tempMant, String metodo, int tiempoSec) {
        super(nombre, fechaCad, numLote, fechaEnv, paisOrg, tempMant);
        this.metodo = metodo;
        this.tiempoSec = tiempoSec;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public int getTiempoSec() {
        return tiempoSec;
    }

    public void setTiempoSec(int tiempoSec) {
        this.tiempoSec = tiempoSec;
    }

    @Override
    public String toString() {
        return "CongNitro{" + "metodo=" + metodo + ", tiempoSec=" + tiempoSec + '}';
    }
    
    
    
    
}
