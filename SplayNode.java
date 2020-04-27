/**
 * Hoja de Trabajo 9
 * Algoritmos y Estructuras de Datos
 * Sección: 20
 * Autores:
 Jose Gutierrez, 19111
 Cesar Rodas, 16776
 */

public class SplayNode {
    SplayNode left, right, parent;

    String english;
    String spanish;




    /** Constructor **/

    public SplayNode(String english,String spanish)

    {
        this.left=null;
        this.right=null;
        this.parent=null;
        this.english=english;
        this.spanish=spanish;

    }

    public SplayNode()

    {
        this.left=null;
        this.right=null;
        this.parent=null;
        this.english=null;
        this.spanish=null;
    }

}