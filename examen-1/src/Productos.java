/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class Productos {
    private String nombre;
    private String fechaCad;
    private int numLote;
    private String fechaEnv;
    private String paisOrg;

    public Productos(String nombre, String fechaCad, int numLote, String fechaEnv, String paisOrg) {
        this.nombre = nombre;
        this.fechaCad = fechaCad;
        this.numLote = numLote;
        this.fechaEnv = fechaEnv;
        this.paisOrg = paisOrg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaCad() {
        return fechaCad;
    }

    public void setFechaCad(String fechaCad) {
        this.fechaCad = fechaCad;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    public String getFechaEnv() {
        return fechaEnv;
    }

    public void setFechaEnv(String fechaEnv) {
        this.fechaEnv = fechaEnv;
    }

    public String getPaisOrg() {
        return paisOrg;
    }

    public void setPaisOrg(String paisOrg) {
        this.paisOrg = paisOrg;
    }

	@Override
	public String toString() {
		return "Productos [nombre=" + nombre + ", fechaCad=" + fechaCad + ", numLote=" + numLote + ", fechaEnv="
				+ fechaEnv + ", paisOrg=" + paisOrg + "]";
	}
    
    
    
    
    
}
