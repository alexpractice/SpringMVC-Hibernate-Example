package com.alexpractice.app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="COUNTRY")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Country{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="countryName")
	String countryName;	
	
	@Column(name="population")
	long population;

}