package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="buy")
public class Buyer {

	@Id
	private int buy_id;
	@Column
	private String user_name;
	@Column
	private String stock_name;
	@Column
	private int quantity;
	@Column
	private double price;
	@Column
	private int brokerage;
	@Column
	private double total_price;
	
	public int getBuy_id() {
		return buy_id;
	}
	public void setBuy_id(int buy_id) {
		this.buy_id = buy_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getStock_name() {
		return stock_name;
	}
	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
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
	public int getBrokerage() {
		return brokerage;
	}
	public void setBrokerage(int brokerage) {
		this.brokerage = brokerage;
	}
	public double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}
	
	@Override
	public String toString() {
		return "Buyer [buy_id=" + buy_id + ", user_name=" + user_name + ", stock_name=" + stock_name + ", quantity="
				+ quantity + ", price=" + price + ", brokerage=" + brokerage + ", total_price=" + total_price + "]";
	}
	
	public Buyer(int buy_id, String user_name, String stock_name, int quantity, double price, int brokerage,
			double total_price) {
		super();
		this.buy_id = buy_id;
		this.user_name = user_name;
		this.stock_name = stock_name;
		this.quantity = quantity;
		this.price = price;
		this.brokerage = brokerage;
		this.total_price = total_price;
	}
	
	public Buyer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
