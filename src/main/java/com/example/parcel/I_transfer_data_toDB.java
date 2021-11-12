package com.example.parcel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class I_transfer_data_toDB {
     @Id
	 private long number;
	 private String name;
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
