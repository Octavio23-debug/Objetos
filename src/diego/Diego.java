/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diego;
import clase.Alumno;
import clase.Arbol;
import clase.Balon;
import clase.Botella;
import clase.Cama;
import clase.Carro;
import clase.Casa;
import clase.Celular;
import clase.Dinosaurio;
import clase.Laptop;
import clase.Galon;
import clase.Gato1;
import clase.Lentes;
import clase.Licuadora;
import clase.Oso;
import clase.Pantalon;
import clase.Perro;
import clase.Refrigerador;
import clase.Reloj;
import clase.Zapatos;
/**
 *
 * @author Invitado
 */
public class Diego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro familiar = new Carro("Rojo", 2018, "Sedan");
        Casa bonita=new Casa("grande", 2000000, "zona rural"); 
        Celular caro=new Celular("iPhoe", 11000, "128 gb");
        Laptop buena=new Laptop("Gamer", 17, "Core I7");
        Galon bonafont =new Galon(20, 35, "Agua");
        Perro uno=new Perro("Grande", 2, "Pastor Aleman");
        Gato1 miau= new Gato1(1, "Naranja", "Desconocida");
        Dinosaurio grrrua =new Dinosaurio(150, "Pterodactilo", "Extinto");
        Lentes xd= new Lentes("guess", 2500, "playa");
        Zapatos jaja = new Zapatos(27, 500, "Un par");
        Oso grrrr =new Oso(170, 10, "desconocido");
        Balon boin =new Balon(32, 5, "pirma");
        Alumno yo = new Alumno(2019670174, "Diego Garcia", "2CM1");
        Refrigerador ow = new Refrigerador(2.4, "Whirpool", 17000);
        Pantalon str = new Pantalon(32, "masculino", "Strech");
        Reloj clock = new Reloj("Rolex", "24 hrs", "digital");
        Arbol dom =new Arbol(3, "frutal", 15);
        Botella glu = new Botella(600, 15, "Coca-Cola");
        Licuadora brrr = new Licuadora(6, 2, "verde");
        Cama ogiogi= new Cama(3500, "kingsize", "Madera");
        
        
        
        System.out.println();
    }

}
