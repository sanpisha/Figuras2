/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figuras;

/**
 *
 * @author Santiago Gómez clase abstract figura 2d implementando figura
 */
public abstract class FiguraPadre implements IFigura {

    private double perimetro;
    private double area;
    int lado;
    private int lado2;

  

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    /**
     * Devuelve el valor del perimetro
     *
     * @return devuelve el perimetro
     */
    public double getPerimetro() {
        return perimetro;
    }

    /**
     * le da el valor al perimetro
     *
     * @param perimetro
     */
    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    /**
     * obtiene el area
     *
     * @return devuelve el area
     */
    public double getArea() {
        return area;
    }

    /**
     * le da el valor al area
     *
     * @param area
     */
    public void setArea(int area) {
        this.area = area;
    }

    /**
     *
     * abstract hallarPerimetro;
     */
    public abstract double hallarPerimetro();

    /**
     * Imprime la información
     */
    public void iprimirInfo() {
        System.out.println("El area es: " + area + " y el perimetro es: " + perimetro);
    }
}
