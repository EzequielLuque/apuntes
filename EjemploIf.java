
import java.util.Scanner;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
*
* @author alumno
*/
public class EjemploIf {


public static void main(String[] args) {

Scanner miSc= new Scanner(System.in);



//defino variables
String nombre;
String clave;
String sexo;
String localidad;
String colorFavorito;


//tomo dato.
System.out.println("Ingrese nombre");
nombre=miSc.next();

System.out.println("Ingrese clave");

clave=miSc.next(); 

System.out.println("Ingrese sexo");

sexo=miSc.next();

System.out.println("Ingrese localidad");

localidad=miSc.next();

System.out.println("Ingrese color favorito");

colorFavorito=miSc.next();

/*
__Si es masculino que viva en lanus o avellaneda y que su color favorito 
sea el rojo mostra el msj sos de indendiente
__Si el nombre es andrea la localidad es moron y el color favorito es 
ver o azul msj feliz primavera 
__


*/

if(sexo.equals("m")&&colorFavorito.equals("rojo"))
    {
    if(localidad.equals("lanus")||localidad.equals("avellaneda"))
    
                {

                    System.out.println("Sos de independiente");

                }
    
   }





//si el nombre es admi bienvenido administrador
//si el nombre es otro bienvendio usuario nombre.

if("admi".equals(nombre) )
{

System.out.println("Binevenido querdio administrador");

}else
    {

       System.out.println("Bienbemido : " + nombre);

    }
//ingresa m o f
//mujer feliz dia de la mujer 
if(sexo.equals("f") && localidad.equals("lanus"))

    {

        System.out.println("Feliz dia de la mujer");
        System.out.println("bienvenida");
        
        
    }

//celeste o blanco sos un patriota
if(colorFavorito.equals("blanco")||colorFavorito.equals("celeste"))
    
{
    System.out.println("sos un patriota");

}





}

}



