package com.tcs.user;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class UserEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Integer Id;
	
	@Column(name = "USER_NAME", unique = false, nullable = false, length = 100)
	private String name;
	private byte age;
	
	@Column(name = "ADD_LINE_1", unique = false, nullable = false, length = 100)
	private String addressLine1;
	
	@Column(name = "ADD_LINE_2", unique = false, nullable = false, length = 100)
	private String addressLine2;
	
	@Column(name = "CITY", unique = false, nullable = false, length = 100)
	private String city;
	private int pincode;
	
	@Column(name = "STATE", unique = false, nullable = false, length = 100)
	private String state;
	
	@Column(name = "COUNTRY", unique = false, nullable = false, length = 100)
	private String country;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "User_ID")
	private Set<AppointmentEntity> appointments;
	
	public Set<AppointmentEntity> getAppointments() {
		return appointments;
	}

	public void setAppointments(Set<AppointmentEntity> appointments) {
		this.appointments = appointments;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		this.Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
