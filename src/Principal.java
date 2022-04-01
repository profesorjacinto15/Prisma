import java.util.Scanner;

public class Principal {

    
    /** 
     * @param mensaje
     * @return float
     */
    public static float leerfloat(String mensaje) {
        Scanner tec = new Scanner(System.in);
        System.out.print(mensaje);
        float valor = tec.nextFloat();
        return valor;
    }

    
    /** 
     * @param areas[]
     */
    public static void ordenaareas(float areas[]) {
        float aux = 0f;
        for(int i=0; i<areas.length-1;i++) {
            for(int j=i; j<areas.length; j++) {
                if (areas[i]<areas[j]) {
                    aux = areas[i];
                    areas[i] = areas[j];
                    areas[j] = aux;
                }
            }
        }
    }

    
    /** 
     * @param areas[]
     */
    public static void imprimirareas(float areas[]) {
        for(int i=0; i < areas.length; i++) {
            System.out.println("Las áreas ordenadas son -> "+areas[i]);
        }
    }

    
    /** 
     * @param args
     */
    public static void main(String[] args) {

        /*Creamos el objeto utilizando constructor sin parámetros y luego setter
        PrismaRecta miprisma = new PrismaRecta();
        float ancho = leerfloat("Introduce el ancho -> ");
        miprisma.setAncho(ancho);
        float largo = leerfloat("Introduce el largo-> ");
        miprisma.setLargo(largo);
        float altura = leerfloat("Introduce la altura-> ");
        miprisma.setAltura(altura);
         */



        /*
        Crear vector de objetos PrismaRecta
        */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número de prismas -> ");
        int numeroprismas = teclado.nextInt();
        PrismaRecta misprismas[] = new PrismaRecta[numeroprismas];
        float areasprimas[] = new float[numeroprismas];
        for (int i=0; i<misprismas.length; i++) {
            float ancho = leerfloat("Introduce el ancho -> ");
            float largo = leerfloat("Introduce el largo-> ");
            float altura = leerfloat("Introduce la altura-> ");
            //Creamos el objeto utilizando el constructor con parámetros
            System.out.println("Creando el Prima numero -> "+i);
            misprismas[i] = new PrismaRecta(ancho, largo, altura);
            //System.out.println("Area del primas -> "+ i + " es -> "+misprismas[i].areaprisma());
            areasprimas[i] = misprismas[i].areaprisma();
        }
        ordenaareas(areasprimas);
        imprimirareas(areasprimas);
        teclado.close();
    }
}