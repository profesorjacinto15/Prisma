import javax.swing.JOptionPane;

/**
 * Clase Prisma
 * crea prismas de base triangular
 * @param args
 */

public class Prisma {
	int baseTriangulo;
	int alturaPrisma;
	
	public static void main(String[] args) {
		
		double[] areaprismas = creaPrismas();
		ordenaArea(areaprismas);
		imprimeArea(areaprismas);
	}

	/**
	 * Metodo que crea los Prismas
	 * @return
	 */
	
	public static double[] creaPrismas() {
		String mensaje = "Introduce el numero de prismas a crear";
		int numprismas = leerValor (mensaje);
		Prisma misprismas[] = new Prisma[numprismas];
		double areaprismas [] = new double[numprismas];
		System.out.println("=============================");
		System.out.println(" CREACION DE OBJETOS PRISMA: ");
		System.out.println("=============================");
		for (int i=0; i<numprismas; i++) {
			mensaje = "Introduce la base del triangulo del primas-> "+i;
			int bt = leerValor(mensaje);
			mensaje = "Introduce la altura del prismas-> "+i;
			int ap = leerValor(mensaje);
			misprismas[i] = new Prisma(bt, ap);	
			System.out.println("Creado el objeto Prisma "+i);
			System.out.println("    Base: "+misprismas[i].getbaseTriangulo());
			System.out.println("    Altura: "+misprismas[i].getalturaPrisma());
			System.out.println("    Area total: "+misprismas[i].areaTotal()); 
			areaprismas[i] = misprismas[i].areaTotal();
		}
		return areaprismas;
	}
	
	/** Constructor, cuando se crea un objeto Prisma
	 * 
	 * @param basetri
	 * @param alturapri
	 */
	
	public Prisma (int basetri, int alturapri) {
		this.baseTriangulo = basetri;
		this.alturaPrisma = alturapri;
	}
	
	// Getters
	// metodo para obtener la base del Triangulo	
	public int getbaseTriangulo () {
		return baseTriangulo;
	}
	
	// metodo para obtener la altura del Prisma
	public int getalturaPrisma () {
		return alturaPrisma;
	}
	
	// Setters
	// metodo para asignar la base del triangulo
	public void ponbasetriangulo (int basetri) {
		this.baseTriangulo = basetri;
		
	}
	
	// metodo para asignar la altura del Prisma
	public void ponalturaprisma (int alturapri) {
		this.alturaPrisma = alturapri;
	}

	/**
	 * Metodo que lee un valor
	 * @param mensaje a mostrar
	 * @return el valor leido
	 */
	
	public static int leerValor (String mensaje) {
        String bas;


        do {
            bas = JOptionPane.showInputDialog(null, mensaje);
        } while (!esNumero(bas));
        int ba = Integer.parseInt(bas);
        return ba;
    }
	
	/**
	 * Metodo que imprime un valor
	 * @param mensa a mostrar
	 * @param valor a mostrar.
	 */

    public static void imprimirValor (String mensa, String valor) {

        JOptionPane.showMessageDialog(null,mensa+valor);

    }
    
    /**
     * Metodo que comprueba si el valor introducido es un numero
     * @param nume
     * @return
     */

    public static boolean esNumero (String nume) {
        for (int i=0; i<nume.length(); i++) {
            if (Character.isDigit(nume.charAt(i))==false)
                return false;
        }
        return true;
    }
    
    public static void ordenaArea(double [] areaprismas) {
        //Usamos un bucle anidado
        for(int i=0;i<(areaprismas.length-1);i++){
            for(int j=i+1;j<areaprismas.length;j++){
                if(areaprismas[i]<areaprismas[j]){
                    //Intercambiamos valores
                    double aux=areaprismas[i];
                    areaprismas[i]=areaprismas[j];
                    areaprismas[j]=aux;
 
                }
            }
        }
    }
    
    public static void imprimeArea(double [] areaprismas) {
    	for (int i=0; i<(areaprismas.length); i++) {
    		System.out.println("Areas -> "+areaprismas[i]);
    	}
    }
	
	public double alturaTriangulo () {
		double h = (Math.sqrt(3) * baseTriangulo) / 2.0;
		return h;
	}
	
	public double areaBase () {
		double ab = (baseTriangulo * this.alturaTriangulo()) / 2.0;
		return ab;
	}
	
	public double perimetro () {
		double p = 3 * baseTriangulo;
		return p;
	}
	
	public double areaLateral () {
		double al = this.perimetro() * alturaPrisma;
		return al;
	}
	
	public double areaTotal () {
		double at = (2*this.areaBase()) + this.areaLateral();
		return at;
	}
	
}
