package com.bz.bazarscan.dto;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="PRODUCT_SUPPLIER")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name="PRODUCT_SUPPLIER")
public class Product_Supplier {
	@Id
	@Column(name="supplier_id")
	public String supplier_id;
	@Column(name="product_id")
	public String product_id;
	@Column(name="price")
	public Double price;
	@Column(name="discount")
	public Double discount; 
	@Column(name="mrp")
	public Double mrp;
	@Column(name="in_stock")
	public char in_stock; 
	@Column(name="currency")
	public String currency; 
	@Column(name="product_url")
	public String product_url;
	@Column(name="emi_available")
	public String emi_available;
	@Column(name="gift_wrap")
	public char gift_wrap;
	@Column(name="MFG_ID")
	public int mfgId;
	public String getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(String supplier_id) {
		this.supplier_id = supplier_id;
	}
	
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Double getMrp() {
		return mrp;
	}
	public void setMrp(Double mrp) {
		this.mrp = mrp;
	}
	public char getIn_stock() {
		return in_stock;
	}
	public void setIn_stock(char in_stock) {
		this.in_stock = in_stock;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getProduct_url() {
		return product_url;
	}
	public void setProduct_url(String product_url) {
		this.product_url = product_url;
	}
	public String getEmi_available() {
		return emi_available;
	}
	public void setEmi_available(String emi_available) {
		this.emi_available = emi_available;
	}
	public char getGift_wrap() {
		return gift_wrap;
	}
	public void setGift_wrap(char gift_wrap) {
		this.gift_wrap = gift_wrap;
	}
	
	public int getMfgId() {
		return mfgId;
	}
	public void setMfgId(int mfgId) {
		this.mfgId = mfgId;
	}
	@Override
	public String toString() {
		return "Product_Supplier [supplier_id=" + supplier_id + ", product_id="
				+ product_id + ", price=" + price + ", discount=" + discount
				+ ", mrp=" + mrp + ", in_stock=" + in_stock + ", currency="
				+ currency + ", product_url=" + product_url
				+ ", emi_available=" + emi_available + ", gift_wrap="
				+ gift_wrap + ", mfgId=" + mfgId + "]";
	}
	
	

}
