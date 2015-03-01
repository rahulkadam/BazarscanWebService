package com.bz.bazarscan.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="Category")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name="SUB_CATEGORY")
public class Sub_Category {
	
	@Id
	@Column(name="SUB_CATEGORY_ID")
	public String sub_category_id;
	@Column(name="NAME")
	public String name;
	@Column(name="CATEGORY_LOOKUP_ID")
	public String category_lookup_id;
	@Column(name="LOOKUP_ID")
	public String lookup_id;
	
	
	public String getSub_category_id() {
		return sub_category_id;
	}
	public void setSub_category_id(String sub_category_id) {
		this.sub_category_id = sub_category_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory_lookup_id() {
		return category_lookup_id;
	}
	public void setCategory_lookup_id(String category_lookup_id) {
		this.category_lookup_id = category_lookup_id;
	}
	
	
	public String getLookup_id() {
		return lookup_id;
	}
	public void setLookup_id(String lookup_id) {
		this.lookup_id = lookup_id;
	}
	@Override
	public String toString() {
		return "Sub_Category [sub_category_id=" + sub_category_id + ", name="
				+ name + ", category_lookup_id=" + category_lookup_id
				+ ", lookup_id=" + lookup_id + "]";
	}
			
}
