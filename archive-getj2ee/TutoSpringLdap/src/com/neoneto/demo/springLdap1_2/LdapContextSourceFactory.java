package com.neoneto.demo.springLdap1_2;

import org.springframework.ldap.core.ContextSource;
import org.springframework.ldap.core.support.LdapContextSource;



public class LdapContextSourceFactory {
	public static ContextSource getLdapContextSource() throws Exception {
		LdapContextSource ldapContextSource = new LdapContextSource();
		ldapContextSource.setUrl("ldap://www.openldap.com:389");
		ldapContextSource.setBase("dc=OpenLDAP,dc=org");
		ldapContextSource.afterPropertiesSet();
		return ldapContextSource;
		//Gravit� et description	Chemin	Ressource	Emplacement	Heure de cr�ation	ID
		//Le type org.springframework.beans.factory.InitializingBean ne peut pas �tre r�solu. Il est r�f�renc� indirectement � partir de fichiers .class requis.	testTutoSPLdap/src/com/neoneto/demo/springLdap1_2	LdapContextSourceFactory.java	ligne 0	1200450973681	455052

	}
}
