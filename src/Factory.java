/**
 * Hoja de Trabajo 9
 * Algoritmos y Estructuras de Datos
 * Sección: 20
 * Fecha de entrega: 27/04/2020
 * Jose Gutierrez	carne: 19111
 * Cesar Rodas  carne: 16776
 */

public class Factory{
    public Mapping<String,String> getMapping(String type){
        if(type == null){
            System.out.println("-Se ha ingresado un valor no valido, por favor ingresar de nuevo...");
            return null;
        }

        if(type.equals("HashMap")){
            return new Hashing<String,String>();
        }

        else if(type.equals("SplayTree")){
            return new SplayTreeMapping();
        }

        System.out.println("-Se ha ingresado un valor no valido, por favor ingresar de nuevo...");
        return null;
    }
}