package clase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Invitado
 */
public class Carro {
    public String color;
    public int año;
    public String tipo;
    
    public Carro(String color, int año, String tipo)
    { 
        this.color = color;
        this.año = año;
        this.tipo = tipo;
    }
    public void carreras()
    {
      
        System.out.println("I`m the winner");
    }
   
    }