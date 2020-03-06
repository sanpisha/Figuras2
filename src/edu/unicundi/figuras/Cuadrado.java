/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figuras;

/**
 *
 * @author Santiago Gómez
 */
/**
* clase de  figura Cuadrado del padre de figura 2d
*/
public class Cuadrado extends FiguraPadre {
    
    private int lado2;
    private String nombre;
    private int lado;
    /**
    * constructor  de Cuadrado con  los datos
    * @param lado lado del cuadrado
    * @param lado2 segundo lado del cuadrado
    */
    public Cuadrado(int lado, int lado2) {       
        this.lado = lado;
        this.lado2 = lado2;
        if(lado==lado2){
            this.nombre = "Cuadrado";
        }else{
            this.nombre = "Rectangulo";
        }
    }
    /**
    * metodoCirculo imprime el resultado 
    */
    public void metodoCuadrado() {
       System.out.println("El area del "+nombre+" es "+hallarArea());
        System.out.println("El perimetro del "+nombre+"  es "+hallarPerimetro());
    }
    /**
    * metodo de  abstracto 2
    * 
    * @return hallarPerimetro
    */
     
     @Override
    public double hallarPerimetro() {
       return (2*lado+2*lado2);
    }
    /**
    * metodo de  interface figura
    * @return hallarArea
    */

    @Override
    public double hallarArea() {
        return lado*lado2;
    }
    /**
     * Metodo que devuelve lado2
     * @return lado2
     */
    public int getLado2() {
        return lado2;
    }
    /**
     * Metodo para asignar lado2
     * @param lado2 
     */

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    /**
     * Metodo que devuelve nombre
     * @return nombre
     */

    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo para asignar nombre
     * @param nombre 
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo que devuelve lado
     * @return lado
     */

    public int getLado() {
        return lado;
    }
    /**
     * Metodo para asignar lado
     * @param lado 
     */

    public void setLado(int lado) {
        this.lado = lado;
    }

   
    
}
