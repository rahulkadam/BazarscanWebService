package com.bz.bazarscan.dao;

import java.util.List;

import com.bz.bazarscan.dto.Product_Header;
import com.bz.bazarscan.dto.Product_Line;
import com.bz.bazarscan.dto.Product_Supplier;
import com.bz.bazarscan.dto.Sub_Category;
import com.bz.bazarscan.dto.webservice.Product;

public interface BluestoneManager {
	
	public List<Product_Header> fetchProductHeader() throws Exception;

	public List<Product_Supplier> fetchProductSupplierList() throws Exception;

	List<Product_Line> fetchProductLineList() throws Exception;

	List<Sub_Category> fetchCategory() throws Exception;

	List<Product> fetchProduct() throws Exception;

}
