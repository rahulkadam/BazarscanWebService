package com.bz.bazarscan.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.bz.bazarscan.dto.Product_Header;
import com.bz.bazarscan.dto.Product_Line;
import com.bz.bazarscan.dto.Product_Supplier;
import com.bz.bazarscan.dto.Sub_Category;
import com.bz.bazarscan.dto.webservice.Product;
import com.bz.bazarscan.helper.BluestoneHelper;
import com.bz.bazarscan.util.Utility;

@Path("productdetails")
public class BluestoneController {
	
	private static BluestoneHelper bluestoneHelper=new BluestoneHelper();
	public static Logger log=Logger.getLogger(BluestoneController.class.getName());
		
	
	@GET
	@Path("/fetchProductList")
	@Produces("application/json")
	public List<Product_Header> fetchProductHeaderList()
	{
		try{
			log.info("Controller :fetchProductHeader");
		List<Product_Header> list=new ArrayList<Product_Header>();
		list=bluestoneHelper.fetchProductHeader();
		log.info(list);
		return list;
		}catch(Exception e)
		{
			log.info(e.getMessage());
			return null;
		}
	}
	
	@GET
	@Path("/fetchProductListxml")
	@Produces("application/xml")
	public List<Product_Header> fetchProductHeaderListxml()
	{
		try{
			log.info("xml Controller :fetchProductHeader");
		//bluestoneHelper
		List<Product_Header> list=new ArrayList<Product_Header>();
		list=bluestoneHelper.fetchProductHeader();
		log.info(list);
		return list;
		}catch(Exception e){
			log.info(e.getMessage());
			return null;
		}
	}
	
	@GET
	@Path("/fetchSupplierList")
	@Produces("application/json")
	public List<Product_Supplier> fetchProductSupplierList()
	{
		
		try{
			log.info("fetchProductSupplierList ENTERED :");
			List<Product_Supplier> product_SupplierList =new ArrayList<Product_Supplier>();
			product_SupplierList=bluestoneHelper.fetchProductSupplierList();
			log.info(product_SupplierList);
			return product_SupplierList;
		}catch(Exception e)
		{
			log.info("Exception occure:"+e.getMessage());
		}
		finally{
			log.info("fetchProductSupplierList EXITED");
		}
		return null;
	}
	
	@GET
	@Path("/fetchSupplierListxml")
	@Produces("application/xml")
	public List<Product_Supplier> fetchProductSupplierListxml()
	{
		try{
			log.info("fetchProductSupplierList ENTERED :");
			List<Product_Supplier> product_SupplierList =new ArrayList<Product_Supplier>();
			product_SupplierList=bluestoneHelper.fetchProductSupplierList();
			log.info(product_SupplierList);
			return product_SupplierList;
		}catch(Exception e)
		{
			log.info("Exception occure:"+e.getMessage());
		}
		finally{
			log.info("fetchProductSupplierList EXITED");
		}
		return null;
	}
	@GET
	@Path("/fetchProduct_lineList")
	@Produces("application/json")
	public List<Product_Line> fetchProductLineList()
	{
		
		try{
			log.info("fetchProductLineList ENTERED :");
			List<Product_Line> product_Line_List =new ArrayList<Product_Line>();
			product_Line_List=bluestoneHelper.fetchProductLineList();
			log.info(product_Line_List);
			return product_Line_List;
		}catch(Exception e)
		{
			log.info("Exception occure:"+e.getMessage());
		}
		finally{
			log.info("fetchProductLineList EXITED");
		}
		return null;
	}
	
	@GET
	@Path("/fetchCategory")
	@Produces("application/json")
	public List<Sub_Category> fetchCategory()
	{
		
		try{
			log.info("fetchProductLineList ENTERED :");
			List<Sub_Category> sub_Category_List =new ArrayList<Sub_Category>();
			sub_Category_List=bluestoneHelper.fetchCategory();
			log.info(sub_Category_List);
			return sub_Category_List;
		}catch(Exception e)
		{
			log.info("Exception occure:"+e.getMessage());
		}
		finally{
			log.info("fetchProductLineList EXITED");
		}
		return null;
	}
	
	@GET
	@Path("/fetchProduct")
	@Produces("application/json")
	public List<Product> fetchProduct()
	{
		
		List<Product> sub_Product_List =new ArrayList<Product>();
		try{
			log.info("fetchProduct ENTERED :");
			sub_Product_List=bluestoneHelper.fetchProduct();
			System.out.println(sub_Product_List);
			log.info(sub_Product_List);
			return sub_Product_List;
		}catch(Exception e)
		{
			e.printStackTrace();
			log.info("Exception occure:"+e.getMessage());
		}
		finally{
			log.info("fetchProduct EXITED");
		}
		return sub_Product_List;
	}

}
