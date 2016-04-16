package com.neoneto.demo.springLdap1_2.rescue;

import org.springframework.ldap.core.ContextSource;
import org.springframework.ldap.core.LdapTemplate;

public class TestLdap2 {

	/** Retrieve a Person from ldap server and display it in Standard Out - Use Baylor University server*/
	public static void main(String[] args) {

		// 1 Retrieve a LdapContextSource
		ContextSource ldapContextSource = null;
		try {
			ldapContextSource = LdapContextSourceFactory2.getLdapContextSource();
		} catch (Exception e) {
			System.out.println("Impossible to get a"
+" LdapContextSource.");
			e.printStackTrace();
		}

		// 2 Instanciate a LdapTemplate
		LdapTemplate ldapTemplate = new LdapTemplate();
		ldapTemplate.setContextSource(ldapContextSource);

		// 3 instanciate a PersonDao
		PersonDao2 dao = new PersonDao2();
		dao.setLdapTemplate(ldapTemplate);

		// 4 retrieve a Person and display it
		Person2 person = dao.findByPrimaryKey("Patrick Hynan");
		System.out.println("Uid: " + person.getUid());
		System.out.println("FirstName: " + person.getFirstName());
		System.out.println("LastName: " + person.getLastName());
		System.out.println("Email: " + person.getEmail() + "\n");

	}
}

