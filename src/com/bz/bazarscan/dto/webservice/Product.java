package com.bz.bazarscan.dto.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.bz.bazarscan.dto.Product_Header;
import com.bz.bazarscan.dto.Product_Supplier;

@XmlRootElement(name="Product")
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {

	public String id;        
	public String sub_category;  
	public String mfg_model_id; 
	public String product_color; 
	public String mfg_id;
	public String product_name;
	public String height;
	public String width;
	public String weight;
	public String sub_title;
	public String url;
	public Double price;
	public String image_url;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSub_category() {
		return sub_category;
	}
	public void setSub_category(String sub_category) {
		this.sub_category = sub_category;
	}
	public String getMfg_model_id() {
		return mfg_model_id;
	}
	public void setMfg_model_id(String mfg_model_id) {
		this.mfg_model_id = mfg_model_id;
	}
	public String getProduct_color() {
		return product_color;
	}
	public void setProduct_color(String product_color) {
		this.product_color = product_color;
	}
	public String getMfg_id() {
		return mfg_id;
	}
	public void setMfg_id(String mfg_id) {
		this.mfg_id = mfg_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getSub_title() {
		return sub_title;
	}
	public void setSub_title(String sub_title) {
		this.sub_title = sub_title;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", sub_category=" + sub_category
				+ ", mfg_model_id=" + mfg_model_id + ", product_color="
				+ product_color + ", mfg_id=" + mfg_id + ", product_name="
				+ product_name + ", height=" + height + ", width=" + width
				+ ", weight=" + weight + ", sub_title=" + sub_title + ", url="
				+ url + ", price=" + price + ", image_url=" + image_url + "]";
	}
		
	public void setproduct_header(Product_Header product_Header) {
		this.id=product_Header.getId();
		this.sub_category=product_Header.getSub_category();
		this.mfg_id=product_Header.getMfg_id();
		this.mfg_model_id=product_Header.getMfg_model_id();
		this.height=product_Header.getHeight();
		this.weight=product_Header.getWeight();
		this.height=product_Header.getHeight();
		this.sub_title=product_Header.getSub_title();
		this.product_name=product_Header.getSub_title();
	}
	public void setproduct_Supplier(Product_Supplier supplier) {
		
		this.url=supplier.getProduct_url();
		this.price=supplier.getPrice();
	}

	
}
