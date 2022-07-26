package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hotel database table.
 * 
 */
@Entity
@NamedQuery(name="Hotel.findAll", query="SELECT h FROM Hotel h")
public class Hotel implements Serializable {
	private static final long serialVersionUID = 1L;

	private String businessType;

	private double costperDay;

	private String hname;

	private String locations;

	private String services;

	private String type;

	public Hotel() {
	}

	public String getBusinessType() {
		return this.businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public double getCostperDay() {
		return this.costperDay;
	}

	public void setCostperDay(double costperDay) {
		this.costperDay = costperDay;
	}

	public String getHname() {
		return this.hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getLocations() {
		return this.locations;
	}

	public void setLocations(String locations) {
		this.locations = locations;
	}

	public String getServices() {
		return this.services;
	}

	public void setServices(String services) {
		this.services = services;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}