package com.neoneto.demo.springLdap1_2.rescue;

import org.springframework.ldap.core.ContextSource;
import org.springframework.ldap.core.support.LdapContextSource;

public class LdapContextSourceFactory2 {

	public static ContextSource getLdapContextSource() throws Exception {
		LdapContextSource ldapContextSource = new LdapContextSource();
		ldapContextSource.setUrl("ldap://ldap.baylor.edu:389");
		ldapContextSource.setBase("ou=People,o=Baylor University,"+
"c=US");
		ldapContextSource.afterPropertiesSet();
		return ldapContextSource;
	}
}

