package com.BitePu.TGBP.Entity.Customer;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Setter;

import lombok.Getter;

@Entity
@Table (name = "customer")
public class Customer implements Serializable{

	private static final long serialVersionUID = -8577700180093849057L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id")
	@Getter @Setter private long id;
	
	@Column (name = "name")
	@Getter @Setter private String name;
	
	@Column (name = "address")
	@Getter @Setter private String address;
	
	@Column (name = "phone")
	@Getter @Setter private String phone;
	
	@Column (name = "current_lattitude")
	@Getter @Setter private String current_lattitude;
	
	@Column (name = "current_longitude")
	@Getter @Setter private String current_longitude;
	
	@Column (name = "status")
	@Getter @Setter private int status;
	
	@Column (name = "created_time")
	@Getter @Setter private Date created_time;

	@Column (name = "updated_time")
	@Getter @Setter private Date updated_time;
}
