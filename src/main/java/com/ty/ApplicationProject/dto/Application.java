package com.ty.ApplicationProject.dto;
	import javax.persistence.CascadeType;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.ManyToOne;

	@Entity
	public class Application {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String app_name;
		private String user_name;
		private String user_password;
		@ManyToOne(cascade = CascadeType.ALL)
		private User user;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getApp_name() {
			return app_name;
		}
		public void setApp_name(String app_name) {
			this.app_name = app_name;
		}
		public String getUser_name() {
			return user_name;
		}
		public void setUser_name(String user_name) {
			this.user_name = user_name;
		}
		public String getUser_password() {
			return user_password;
		}
		public void setUser_password(String user_password) {
			this.user_password = user_password;
		}
		
		
		
		

	}


