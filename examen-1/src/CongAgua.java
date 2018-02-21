/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class CongAgua extends Congelados{
    private int NaClGrams;
    public CongAgua(String nombre, String fechaCad, int numLote, String fechaEnv, String paisOrg, int tempMant, int NaClGrams) {
        super(nombre, fechaCad, numLote, fechaEnv, paisOrg, tempMant);
        this.NaClGrams = NaClGrams;
    }

    public int getNaClGrams() {
        return NaClGrams;
    }

    public void setNaClGrams(int NaClGrams) {
        this.NaClGrams = NaClGrams;
    }

    @Override
    public String toString() {
        return "CongAgua{" + "NaClGrams=" + NaClGrams + '}';
    }
    
    
    
    
}
