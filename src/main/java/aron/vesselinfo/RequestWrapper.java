package aron.vesselinfo;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

// Wrapping the vessel and position objects for the response entity

public class RequestWrapper {
	
	
	@JsonIgnore
	private @Id @GeneratedValue Long id;
	
	Vessel vessel;
	Position position;
	
	public Long getId() {
		return this.id;
	}
	
	public Vessel getVessel() {
		return this.vessel;
	}
	
	public Position getPosition() {
		return this.position;
	}
		  
	public void setVessel(Vessel vessel) {
		this.vessel = vessel;
	}
		  
	public void setPosition(Position position) {
		this.position = position;
	}
	

}
