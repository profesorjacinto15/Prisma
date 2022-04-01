/**
 * Clase Prisma de base rectangular
 */

public class PrismaRecta {
    private float largo;
    private float ancho;
    private float altura;

    /**
     * Constructor con parametros
     * @param largo de la base
     * @param ancho de la base
     * @param altura del prisma
     */

    public PrismaRecta(float largo, float ancho, float altura) {
        this.largo = largo;
        this.ancho = ancho;
        this.altura = altura;
    }

    /**
     * Constructor vacio
     */

    public PrismaRecta() {
    }

    /**
     * Getter del largo
     * @return
     */
    public float getLargo() {
        return largo;
    }

    
    /** 
     * @param largo
     */
    public void setLargo(float largo) {
        this.largo = largo;
    }

    
    /** 
     * @return float
     */
    public float getAncho() {
        return ancho;
    }

    
    /** 
     * @param ancho
     */
    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    
    /** 
     * @return float
     */
    public float getAltura() {
        return altura;
    }

    
    /** 
     * @param altura
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    
    /** 
     * @return float
     */
    private float areabase() {
        return this.ancho*this.largo;
    }

    
    /** 
     * @return float
     */
    private float arealarga() {
        return this.largo * this.altura;
    }

    
    /** 
     * @return float
     */
    private float areacorta() {
        return this.ancho*this.altura;
    }

    
    /** 
     * @return float
     */
    public float areaprisma() {
        return 2*(this.areabase()+this.arealarga()+this.areacorta());
    }
}
