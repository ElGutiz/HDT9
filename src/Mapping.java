/**
 * Hoja de Trabajo 9
 * Algoritmos y Estructuras de Datos
 * Sección: 20
 * Fecha de entrega: 27/04/2020
 * Jose Gutierrez	carne: 19111
 * Cesar Rodas  carne: 16776
 */

public interface Mapping<K extends Comparable<K>,V> {
    public boolean isHashing();

    public V remove(K key);

    public V put(Association<K,V> association);

    public int size();

    public boolean searchValue(String searched);

    public V get(Object key);
}