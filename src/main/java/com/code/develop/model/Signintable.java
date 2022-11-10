package com.code.develop.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Signintable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
		private Long signid;
		private String email;
		private String pasword; // new password
//		private String oldPassword;
		public Long getSignid() {
			return signid;
		}
		public void setSignid(Long signid) {
			this.signid = signid;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPasword() {
			return pasword;
		}
		public void setPasword(String pasword) {
			this.pasword = pasword;
		}
//		public String getOldPassword() {
//			return oldPassword;
//		}
//		public void setOldPassword(String oldPassword) {
//			this.oldPassword = oldPassword;
//		}
		@Override
		public int hashCode() {
			return Objects.hash(signid);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Signintable other = (Signintable) obj;
			return Objects.equals(signid, other.signid);
		}
		
		
		
	

		
		
	}



