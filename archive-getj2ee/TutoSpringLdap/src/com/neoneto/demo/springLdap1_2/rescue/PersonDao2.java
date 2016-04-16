package com.neoneto.demo.springLdap1_2.rescue;

import javax.naming.Name;
import javax.naming.directory.Attributes;

import org.springframework.ldap.core.AttributesMapper;
import org.springframework.ldap.core.DistinguishedName;
import org.springframework.ldap.core.LdapTemplate;

public class PersonDao2 {

	private LdapTemplate ldapTemplate;

	private static class PersonAttributMapper implements AttributesMapper {

		public Person2 mapFromAttributes(Attributes attrs)
				throws javax.naming.NamingException {
			Person2 p = new Person2();
			p.setFirstName(attrs.get("givenName").get().toString());
			p.setLastName(attrs.get("sn").get().toString());
			p.setUid(attrs.get("cn").get().toString());
			p.setEmail(attrs.get("mail").get().toString());
			return p;
		}
	}

	public Person2 findByPrimaryKey(String cn) {
		Name dn = buildDn(cn);
		return (Person2) ldapTemplate.lookup(dn, new PersonAttributMapper());
	}

	private Name buildDn(String cn) {
		DistinguishedName dn = new DistinguishedName();
		dn.add("ou", "Faculty and Staff");
		dn.add("ou", "Computer Science - Eng/Comp Sci");
		dn.add("cn", cn);
		return dn;
	}

	public void setLdapTemplate(LdapTemplate ldapTemplate) {
		this.ldapTemplate = ldapTemplate;
	}

}
