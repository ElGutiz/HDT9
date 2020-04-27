/**
 * Hoja de Trabajo 9
 * Algoritmos y Estructuras de Datos
 * Sección: 20
 * Fecha de entrega: 27/04/2020
 * Jose Gutierrez	carne: 19111
 * Cesar Rodas  carne: 16776
 */

import java.util.HashMap;

public class Hashing<K extends Comparable<K>, V> implements Mapping<K,V>{
    protected HashMap<K,V> map = new HashMap<K,V>();

    public boolean isHashing(){
        return true;
    }

    public V remove(K key){
        return map.remove(key);
    }

    public V put(Association<K,V> association){
        return map.put((K)association.getKey(), (V)association.getValue());
    }

    public int size(){
        return map.size();
    }

    public V get(Object key){
        return map.get(key);
    }

    public boolean searchValue(String searched){
        if (map.containsKey(searched)) {
            return true;
        }
        return false;
    }
}