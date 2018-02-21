import java.util.ArrayList;

public class testHerencia_3 {

	public static void main(String[] args) {
		ArrayList<Productos> products = new ArrayList(); 
        Frescos lechuga = new Frescos("Lechuga", "2018-03-05", 1234, "2018-01-23", "Costa Rica");
        Frescos tomate = new Frescos("Tomate", "2018-03-12", 1234, "2018-01-15", "Costa Rica");
        Frescos naranja = new Frescos("Naranja", "2018-03-12", 1234, "2018-01-15", "Nicaragua");
        
        products.add(lechuga);
        products.add(tomate);
        products.add(naranja);
        
        Refrigerados carneRes = new Refrigerados("Lomito de Res", "2018-03-05", 1234, "2018-01-23", "Costa Rica", 1232, 20);
        Refrigerados pollo = new Refrigerados("Pechuga de Pollo", "2018-03-05", 1234, "2018-01-23", "Costa Rica", 1232, 20);
        Refrigerados carneCerdo = new Refrigerados("Pierna de Cerdo", "2018-03-05", 1234, "2018-01-23", "Costa Rica", 1232, 20);
    
        products.add(carneRes);
        products.add(pollo);
        products.add(carneCerdo);
        
        CongAgua camaron = new CongAgua("Camaron Blanco Pelado", "2018-03-05", 1234, "2018-01-23", "China", -18, 20);
        CongAgua langosta = new CongAgua("Cola de Langosta", "2018-03-05", 1234, "2018-01-23", "Argentina", -18, 20);
        CongAire mejillon = new CongAire("Carne de Mejillon", "2018-03-05", 1234, "2018-01-23", "EEUU", -18, 1,2,4,3);
        CongAire helado = new CongAire("Ben & Jerry's", "2018-03-05", 1234, "2018-01-23", "EEUU", -18, 1,2,4,3);
        CongNitro pez = new CongNitro("Pez Espada", "2018-03-05", 1234, "2018-01-23", "EEUU", -18, "Nitrogeno Liquido",2);
        
        products.add(camaron);
        products.add(langosta);
        products.add(mejillon);
        products.add(helado);
        products.add(pez);

        for(Productos p : products){
        	System.out.println("Imprimiendo Producto:");
        	System.out.println("Nombre: "+p.getNombre());
        	System.out.println("Fecha de Caducidad: "+p.getFechaCad());
        	System.out.println("Fecha de Empaquetado: "+p.getFechaEnv());
        	System.out.println("Pais de Origen: "+p.getPaisOrg());
        	System.out.println("Numero de Lote: "+p.getNumLote());
        	System.out.println("Typo de Producto: "+p.getClass());
        	System.out.println("Detalles: "+ p.toString());
        	System.out.println("___________________________");
        }
	}

}
