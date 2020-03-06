/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figuras;


import java.util.Scanner;

/**
 *
 * @author Santiago Gómez 
 * En la clase solicito la informacion y llamo a las metodos
 */
public class Logica {
     private IFigura[] vectorGeneral ;
     private Scanner figura;
     /**
     * Costructor solicito la cantidad de figuras y  los metodos de las figuras
     */
     public void Datos(){
        System.out.println("cuantas figuras desea? ");
        Scanner leer=new Scanner(System.in);
        int numero=leer.nextInt();
        int numeroFigura = 0;
       vectorGeneral =new IFigura[numero];
       seleccionFigura(numero,numeroFigura);
        
        for (IFigura vecGe : vectorGeneral) {
            
             if (vecGe instanceof Triangulo) {
                ((Triangulo) vecGe).metodoTriangulo();
            } else if (vecGe instanceof Cuadrado) {
                ((Cuadrado) vecGe).metodoCuadrado();
            } 
               
            }
        }        
    
     /**
     * Metodo para insertar los datos de la figura que selecciono
     * @param numeroFigura el numero de la figura que seleciono
     * @param i  la posiscion que va el for 
     */
    public void insertarDatos(int numeroFigura,int i) {
        switch(numeroFigura){
            case 1:{                
                System.out.println("Inserte los tres lados del triangulo:"); 
                vectorGeneral[i]=(IFigura) new Triangulo(figura.nextInt(),figura.nextInt(),figura.nextInt());
                break;
            }
            case 2:{                
                System.out.println("Inserte los dos lados del cuadrado:");  
                 vectorGeneral[i]=new Cuadrado(figura.nextInt(), figura.nextInt());
                break;
            }
       
            }
        }
    
    
     /**
     * Metodo  para seleciona la figura
     * @param numero la cantidad de figuras q desea
     * @param numeroFigura   el numero  de la figura deseada
     */

    private void seleccionFigura(int numero, int numeroFigura) {
        for(int i=0;i<numero;i++){          
            do{                
                System.out.printf("seleccione la figura que desea %d: ", i+1); 
                System.out.println(" ");
                System.out.println("1. tringulo");
                System.out.println("2. cuadrado o rectangulo");
                
                figura=new Scanner(System.in);
                numeroFigura=figura.nextShort();
            }while(numeroFigura>2 || numeroFigura<1);
            
            insertarDatos(numeroFigura,i);
                            
        }   
    }
}

