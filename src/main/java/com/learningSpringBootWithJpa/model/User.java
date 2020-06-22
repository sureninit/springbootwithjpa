package com.learningSpringBootWithJpa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="user")
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private Long id;
	@Column(name="user_name")
	private String name;
	@Column(name="user_password")
	private String password;
	@Column(name="user_email")
	private String email;
	@Column(name="user_phone")
	private String phone;
	@Column(name="user_age")
	private int age;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="reg_date")
	private Date regDate;

}
