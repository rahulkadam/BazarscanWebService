package com.bz.bazarscan.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.bz.bazarscan.dao.impl.BluestoneManagerImpl;
import com.bz.bazarscan.dto.Product_Header;
import com.bz.bazarscan.dto.Product_Line;
import com.bz.bazarscan.dto.Product_Supplier;
import com.bz.bazarscan.dto.Sub_Category;
import com.bz.bazarscan.dto.webservice.Product;
import com.bz.bazarscan.helper.BluestoneHelper;

public class BluestoneService {
	
	BluestoneManagerImpl bluestoneManagerImpl=BluestoneManagerImpl.getInstance();
	public static Logger log=Logger.getLogger(BluestoneService.class.getName());
	
	public List<Product_Header> fetchProductHeader() throws Exception
	{
		log.info("BluestoneService :fetchProductHeader");
		return bluestoneManagerImpl.fetchProductHeader();
	}

	public List<Product_Supplier> fetchProductSupplierList() throws Exception{
		log.info("BluestoneService :fetchProductSupplierList");
		return bluestoneManagerImpl.fetchProductSupplierList();
	}

	public List<Product_Line> fetchProductLineList() throws Exception {
		log.info("BluestoneService :fetchProductLineList");
		return bluestoneManagerImpl.fetchProductLineList();
	}

	public List<Sub_Category> fetchCategory() throws Exception{
		log.info("BluestoneService :fetchCategory");
		return bluestoneManagerImpl.fetchCategory();

	}

	public List<Product> fetchProduct() throws Exception{
		log.info("BluestoneService :fetchProduct");
		return bluestoneManagerImpl.fetchProduct();
	}


}
