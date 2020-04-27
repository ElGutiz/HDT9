/**
 * Hoja de Trabajo 9
 * Algoritmos y Estructuras de Datos
 * Sección: 20
 * Autores:
 Jose Gutierrez, 19111
 Cesar Rodas, 16776
 */

public class Main{
    public static void main(String[] args) {
        while(true)
        {
            try
            {
                System.out.println("Se traducira el archivo texto.txt\n");
                Translator translator= new Translator();
                translator.PrepararDiccionario();
                String traduccionFinal= translator.Traducir();
                System.out.println(traduccionFinal);

            }
            catch(Exception e)
            {

            }

        }
    }
}