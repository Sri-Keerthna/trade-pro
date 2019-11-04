package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stock")
public class Stock {

	 @Id
	 @GeneratedValue
	private int stockid;
	 @Column
	private String name;
	 @Column
	private int quantity;
	 @Column
	private double price;
	 @Column
	private float brokerage;
	public int getStockid() {
		return stockid;
	}
	public void setStockid(int stockid) {
		this.stockid = stockid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public float getBrokerage() {
		return brokerage;
	}
	public void setBrokerage(float brokerage) {
		this.brokerage = brokerage;
	}
	@Override
	public String toString() {
		return "Stock [stockid=" + stockid + ", name=" + name + ", quantity=" + quantity + ", price=" + price
				+ ", brokerage=" + brokerage + "]";
	}
	public Stock(int stockid, String name, int quantity, double price, float brokerage) {
		super();
		this.stockid = stockid;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.brokerage = brokerage;
	}
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
}
	