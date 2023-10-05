package com.ads.dealshop.model;


import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.Table;



@Entity

@Table(name="Product")

public class Product {
	 @Id

	  @GeneratedValue(strategy= GenerationType.AUTO)

	  @Column(name="ProductId")

	  private int id;

	  @Column(name="Name")

	  private String name;

	  @Column(name="Description")

	  private String description;

	 

	  public Product(int id,String name,String description) {

	    this.id=id;

	    this.name=name;

	    this.description=description;

	  }

	 

	  public Product() {

	 

	  }

	 

	  public int getId() {

	    return id;

	  }

	 

	  public void setId(int id) {

	    this.id=id;

	  }

	 

	  public String getName() {

	    return name;

	  }

	 

	  public void setName(String name) {

	    this.name=name;

	  }

	 

	  public String getDescription() {

	    return description;

	  }

	 

	  public void setDescription(String description) {

	    this.description=description;

	  }

	}
	
	
	
	
	
	
	

