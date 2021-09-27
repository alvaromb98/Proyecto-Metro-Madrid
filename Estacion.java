package es.upm.dit.adsw.practica4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Esta clase representa una estación en el metro.
 * @author mmiguel
 */
public class Estacion {

	private int id;
	private Vector posicion;
	private String nombre;
	private double tiempo;
	private boolean[] andenOcupado=new boolean[] {false,false};
	private Map<Boolean,List<Tren>> esperando=new HashMap<Boolean,List<Tren>>();

	/**
	 * Crea una nueva estacion en el mapa
	 * @param id identificador de la estacion
	 * @param posicion coordenadas de la estacion en el mapa
	 * @param tiempo tiempo que tardan los trenes en desembarcar/embarcar pasajeros
	 * @param nombre Nombre de la estacion
	 */
	public Estacion(int id, Vector posicion, double tiempo, String nombre) {
		this.id=id;
		this.posicion=posicion;
		this.nombre=nombre;
		this.tiempo=tiempo;
		esperando.put(true, new ArrayList<Tren>());
		esperando.put(false, new ArrayList<Tren>());
	}
	
	/**
	 * Devuelve el identificador de la estacion
	 * @return el identificador
	 */
	public int getId() {
		return id;
	}

	/**
	 * Devuelve las coordenadas de la estacion en el mapa
	 * @return posicion de la estacion
	 */
	public Vector getPosicion() {
		return posicion;
	}

	/**
	 * Devueve el nombre de la estacion
	 * @return nombre de la estacion
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Devuelve el tiempo que estan los trenes en esta estacion
	 * @return tiempo de embarque/desembarque
	 */
	public double getTiempo() {
		return tiempo;
	}
	
	@Override
	public boolean equals(Object otra) {
		if (!(otra instanceof Estacion))
			return false;
		return id == ((Estacion) otra).id;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
}
