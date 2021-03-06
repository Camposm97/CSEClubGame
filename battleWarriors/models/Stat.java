package models;

import java.io.Serializable;

public class Stat implements Serializable {
	private static final long serialVersionUID = 5893866242420478740L;
	private String name;
	private int value;
	
	public Stat (String name, int value){
		this.name = name;
		this.value = value;
	}
	public Stat (String name){
		this.name = name;
		this.value = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	public void modifyValue (int mod) {
		this.value += mod;
	}

}
