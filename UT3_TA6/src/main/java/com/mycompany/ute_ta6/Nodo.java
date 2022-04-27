package com.mycompany.ute_ta6;
/**
 *
 * @author ernesto
 * @param <T>
 */
public class Nodo<T> implements INodo<T> {

    private final Comparable etiqueta;
    private T dato;
    private Nodo<T> siguiente = null;
    
    public Nodo(T dato ) {
        this.etiqueta = null;
        this.dato = dato;
    }
    
    public T getDato() {
        return this.dato;
    }

    public void setDato(T dato) {
        this.dato = dato;

    }

    @Override
    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

    @Override
    public void imprimir() {
        System.out.println(dato.toString());
    }

    @Override
    public void imprimirEtiqueta() {
        System.out.println(this.etiqueta);
    }

    public Nodo<T> clonar() {
        return new Nodo<>(this.dato);
    }

    /**
     *
     * @param unNodo
     * @return
     */

    public boolean equals(Nodo unNodo) {
        return this.dato.equals(unNodo.getDato());
    }

    @Override
    public int compareTo(Comparable etiqueta) {
        return this.etiqueta.compareTo(etiqueta);
    }

    @Override
    public Nodo<T> getSiguiente() {
        return this.siguiente;
    }

    @Override
    public void setSiguiente(Nodo<T> nodo) {
        this.siguiente = nodo;
    }

}
