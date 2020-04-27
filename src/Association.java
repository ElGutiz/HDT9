/**
 * Hoja de Trabajo 9
 * Algoritmos y Estructuras de Datos
 * Sección: 20
 * Fecha de entrega: 27/04/2020
 * Jose Gutierrez	carne: 19111
 * Cesar Rodas  carne: 16776
 */

public class Association<K extends Comparable<K>, V> {
    private K key;
    private V value;

    public Association(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public int compareTo(Association<K,V> association){
        return key.compareTo(association.key);
    }
}