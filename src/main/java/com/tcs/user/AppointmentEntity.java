package com.tcs.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AppointmentEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer appointmenId;
	private TrainerPreference trainerPreference;
	private boolean needPhysiotherapist;
	private Packages pack;
	private int noOfWeeks;
	private double ammount;

	@ManyToOne
	private UserEntity user;

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public Integer getAppointmenId() {
		return appointmenId;
	}

	public void setAppointmenId(Integer appointmenId) {
		this.appointmenId = appointmenId;
	}

	public TrainerPreference getTrainerPreference() {
		return trainerPreference;
	}

	public void setTrainerPreference(TrainerPreference trainerPreference) {
		this.trainerPreference = trainerPreference;
	}

	public boolean isNeedPhysiotherapist() {
		return needPhysiotherapist;
	}

	public void setNeedPhysiotherapist(boolean needPhysiotherapist) {
		this.needPhysiotherapist = needPhysiotherapist;
	}

	public Packages getPack() {
		return pack;
	}

	public void setPack(Packages pack) {
		this.pack = pack;
	}

	public int getNoOfWeeks() {
		return noOfWeeks;
	}

	public void setNoOfWeeks(int noOfWeeks) {
		this.noOfWeeks = noOfWeeks;
	}

	public double getAmmount() {
		return ammount;
	}

	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}

}
