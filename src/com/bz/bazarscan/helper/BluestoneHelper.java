package com.bz.bazarscan.helper;

import java.util.List;

import org.apache.log4j.Logger;

import com.bz.bazarscan.dto.Product_Header;
import com.bz.bazarscan.dto.Product_Line;
import com.bz.bazarscan.dto.Product_Supplier;
import com.bz.bazarscan.dto.Sub_Category;
import com.bz.bazarscan.dto.webservice.Product;
import com.bz.bazarscan.service.BluestoneService;
import com.bz.bazarscan.util.Utility;

public class BluestoneHelper {

	private BluestoneService bluestoneService =new BluestoneService();
	public static Logger log=Logger.getLogger(BluestoneHelper.class.getName());
	
	public List<Product_Header> fetchProductHeader() throws Exception
	{
		log.info("BluestoneHelper :fetchProductHeader");
		return bluestoneService.fetchProductHeader();
	}

	public List<Product_Supplier> fetchProductSupplierList() throws Exception{
		log.info("BluestoneHelper :fetchProductSupplierList");
		return bluestoneService.fetchProductSupplierList();
	}

	public List<Product_Line> fetchProductLineList() throws Exception{
		log.info("BluestoneHelper :fetchProductLineList");
		return bluestoneService.fetchProductLineList();
	}

	public List<Sub_Category> fetchCategory() throws Exception{
		log.info("BluestoneHelper :fetchCategory");
		return bluestoneService.fetchCategory();
	}

	public List<Product> fetchProduct() throws Exception{
		log.info("BluestoneHelper :fetchProduct");
		return bluestoneService.fetchProduct();
	}
}
