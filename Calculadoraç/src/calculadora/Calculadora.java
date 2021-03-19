/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author sanco
 */
public class Calculadora {
    
    private int res;
    
    Calculadora(){
    }
    
    public int suma(int num1,int num2){
        this.res=num1+num2;
        return this.res;
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
