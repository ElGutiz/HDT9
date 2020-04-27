/**
 * Hoja de Trabajo 9
 * Algoritmos y Estructuras de Datos
 * Sección: 20
 * Autores:
 Jose Gutierrez, 19111
 Cesar Rodas, 16776
 */

import java.util.*;

class MapFactory<E>
{
    public Map<E,E> getMap(String tipo)
    {
        Map<E,E> mapa=null;
        switch(tipo)
        {
            case "SplayTree": mapa= new SplayTree_calls<E, E>(); break;
            case "HashMap": mapa= new HashMap_<E, E>(); break;
            default: mapa= new HashMap_<E, E>(); break;
        }
        return mapa;
    }
}