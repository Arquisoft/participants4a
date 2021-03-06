package es.uniovi.asw.dbupdate;

import es.uniovi.asw.dbupdate.util.Hibernate_Jpa;
import es.uniovi.asw.model.Citizen;

import java.util.List;

/**
 * Created by Pelayo Garcia Lartategui on 10/02/2017. Clase con consultas
 * Hibernate
 */
public class CitizenFinder {

	public static Citizen findByNif(String numero_identificativo) {
		List<Citizen> list = Hibernate_Jpa.getManager().createNamedQuery("Citizen.findByNif", Citizen.class)
				.setParameter(1, numero_identificativo).getResultList();
		if (!list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}

	public static Citizen findByEmailPass(String email, String contrasena) {
		List<Citizen> list = Hibernate_Jpa.getManager().createNamedQuery("Citizen.findByEmailPass", Citizen.class)
				.setParameter(1, email).setParameter(2, contrasena).getResultList();
		if (!list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}

	public static Citizen findByEmail(String email) {
		List<Citizen> list = Hibernate_Jpa.getManager().createNamedQuery("Citizen.findByEmail",Citizen.class)
				.setParameter(1, email).getResultList();
		if (!list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}
}
