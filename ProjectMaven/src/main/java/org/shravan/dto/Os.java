package org.shravan.dto;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Os {

	@Id
	private int id;
	private String bit;
	private String name;
	
	
	//
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBit() {
		return bit;
	}
	public void setBit(String bit) {
		this.bit = bit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	}
	 

	 
	
	


