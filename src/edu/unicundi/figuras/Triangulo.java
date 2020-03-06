/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figuras;

/**
 *
 * @author rojas
 */
/**
* clase de  figura Triangulo del padre de figura 2d
*/
public class Triangulo extends FiguraPadre {
    
    private int lado2;
    private int lado3;
    private String nombre;
    private int lado;
     /**
    * constructor  del Triangulo con  los datos
    * @param lado lado del Triangulo
    * @param lado2 lado2 del Triangulo
    * @param lado3 lado3 del Triangulo
    */
    public Triangulo(int lado, int lado2, int lado3) {
        this.lado = lado;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.nombre=QueTriangulo(lado, lado2, lado3);
    }
    /**
    * metodoCirculo imprime el resultado 
    */
    public void metodoTriangulo() {
       System.out.println("El area del "+nombre+" es "+hallarArea());
        System.out.println("El perimetro del "+nombre+" es "+hallarPerimetro());
    }
      /**
    * metodo  del QueTriangulo con  los datos
    * @param lado lado del Triangulo
    * @param lado2 lado2 del Triangulo
    * @param lado3 lado3 del Triangulo
    * @return nombre de la figura 
    */
    
    public String QueTriangulo(int lado, int lado2, int lado3){
       if(lado== lado2 && lado2==lado3 && lado==lado3){
           return "Equilatero";
       }else if(lado!=lado2 && lado!=lado3 & lado2!=lado3){
           return "Escaleno"; 
       }else{
           return "Isosceles";
       }
    }
    /**
    * metodo de  abstracto 
    * @return hallarPerimetro
    */

    @Override
    public double hallarPerimetro() {
         return lado+lado2+lado3;
    }
    /**
    * metodo de  interface figura
    * @return hallarArea
    */

    @Override
    public double hallarArea() {
    float s=(lado+lado2+lado3)/2; //semiperimetro
    return Math.sqrt(s*(s-lado)*(s-lado2)*(s-lado3));
    }
    
    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

 
    
}
