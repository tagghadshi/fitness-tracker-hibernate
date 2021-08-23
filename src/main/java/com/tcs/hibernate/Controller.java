package com.tcs.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.tcs.user.AppointmentEntity;
import com.tcs.user.Packages;
import com.tcs.user.TrainerPreference;
import com.tcs.user.UserEntity;

public class Controller {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		// Appointments 1
		AppointmentEntity a1 = new AppointmentEntity();
		a1.setTrainerPreference(TrainerPreference.MALE_TRAINER);
		a1.setNeedPhysiotherapist(false);
		a1.setPack(Packages.ONE_TIME);
		a1.setNoOfWeeks(0);
		a1.setAmmount(500);

		// Appointments 2
		AppointmentEntity a2 = new AppointmentEntity();
		a2.setTrainerPreference(TrainerPreference.NO_PREFERENCE);
		a2.setNeedPhysiotherapist(false);
		a2.setPack(Packages.FOUR_SESSIONS);
		a2.setNoOfWeeks(2);
		a2.setAmmount(400);

		// Appointments 3
		AppointmentEntity a3 = new AppointmentEntity();
		a3.setTrainerPreference(TrainerPreference.FEMALE_TRAINER);
		a3.setNeedPhysiotherapist(true);
		a3.setPack(Packages.FIVE_SESSIONS);
		a3.setNoOfWeeks(4);
		a3.setAmmount(300);

		// Add User1 in Table
		UserEntity user1 = new UserEntity();
		user1.setName("Tag");
		user1.setAge((byte) 18);
		user1.setAddressLine1("Flat No.107 Sundar Appartments");
		user1.setAddressLine2("36 Bakers Street");
		user1.setCity("Mumbai");
		user1.setPincode(400018);
		user1.setState("Maharashtra");
		user1.setCountry("India");

		// Add User2
		UserEntity user2 = new UserEntity();
		user2.setName("Vikrant");
		user2.setAge((byte) 20);
		user2.setAddressLine1("Bunglow No.5");
		user2.setAddressLine2("St Andrews Street");
		user2.setCity("Punji");
		user2.setPincode(500001);
		user2.setState("Goa");
		user2.setCountry("India");

		Set<AppointmentEntity> appointmentOfFirstUser = new HashSet<AppointmentEntity>();
		appointmentOfFirstUser.add(a1);
		appointmentOfFirstUser.add(a2);
		
		Set<AppointmentEntity> appointmentOfSecondUser = new HashSet<AppointmentEntity>();
		appointmentOfSecondUser.add(a3);
		
		user1.setAppointments(appointmentOfFirstUser);
		user2.setAppointments(appointmentOfSecondUser);

		session.save(user1);
		session.save(user2);

		session.getTransaction().commit();
		HibernateUtil.shutdown();

	}
}
