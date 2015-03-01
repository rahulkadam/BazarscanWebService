package com.bz.bazarscan.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.mapping.Array;

import com.bz.bazarscan.dao.BluestoneManager;
import com.bz.bazarscan.dto.Product_Header;
import com.bz.bazarscan.dto.Product_Line;
import com.bz.bazarscan.dto.Product_Supplier;
import com.bz.bazarscan.dto.Sub_Category;
import com.bz.bazarscan.dto.webservice.Product;
import com.bz.bazarscan.service.BluestoneService;
import com.bz.bazarscan.util.Utility;

public class BluestoneManagerImpl implements BluestoneManager{

	private static Session session=null;
	public static BluestoneManagerImpl bluestoneManagerImpl=null;
	public static Logger log=Logger.getLogger(BluestoneManagerImpl.class.getName());
	
	public static BluestoneManagerImpl getInstance()
	{
		if(bluestoneManagerImpl==null){
		bluestoneManagerImpl=new BluestoneManagerImpl();
		}
		return bluestoneManagerImpl;
	}
	public Session getSession()
	{
		if(session==null)
		{
			session=Utility.getSession();
		}
		return session;
	}

	@Override
	public List<Product_Header> fetchProductHeader() throws Exception{
		log.info("bluestoneManagerImpl :   fetchProductHeader");
		List<Product_Header> productList=null;
		try{
			String queryString="from Product_Header";
			log.info("queryString : "+queryString);
			Transaction t=bluestoneManagerImpl.getSession().beginTransaction();
			productList=(List<Product_Header>) session.createQuery(queryString).list();
			log.info(productList.size());
			//log.info(productList);
			t.commit();
		}catch(Exception e){
			e.printStackTrace();
			throw new Exception(e);
		}
		return productList;
	}
	@Override
	public List<Product_Supplier> fetchProductSupplierList() throws Exception{
		log.info("bluestoneManagerImpl :   fetchProductSupplierList");
		List<Product_Supplier> supplierList=null;
		try{
			String queryString="from Product_Supplier";
			log.info("queryString : "+queryString);
			Transaction t=bluestoneManagerImpl.getSession().beginTransaction();
			supplierList=(List<Product_Supplier>) session.createQuery(queryString).list();
			log.info(supplierList.size());
			//log.info(supplierList);
			t.commit();
		}catch(Exception e){
			e.printStackTrace();
			throw new Exception(e);
		}
		return supplierList;	
	}
	@Override
	public List<Product_Line> fetchProductLineList() throws Exception{
		log.info("bluestoneManagerImpl :   fetchProductLineList");
		List<Product_Line> productLineList=null;
		try{
			String queryString="from Product_Line";
			log.info("queryString : "+queryString);
			Transaction t=bluestoneManagerImpl.getSession().beginTransaction();
			productLineList=(List<Product_Line>) session.createQuery(queryString).list();
			log.info(productLineList.size());
			//log.info(supplierList);
			t.commit();
		}catch(Exception e){
			e.printStackTrace();
			throw new Exception(e);
		}
		return productLineList;	
	}
	@Override
	public List<Sub_Category> fetchCategory() throws Exception{
		log.info("bluestoneManagerImpl :   fetchProductLineList");
		List<Sub_Category> Sub_CategoryList=null;
		try{
			String queryString="from Sub_Category";
			log.info("queryString : "+queryString);
			Transaction t=bluestoneManagerImpl.getSession().beginTransaction();
			Sub_CategoryList=(List<Sub_Category>) session.createQuery(queryString).list();
			log.info(Sub_CategoryList.size());
			t.commit();
		}catch(Exception e){
			e.printStackTrace();
			throw new Exception(e);
		}
		return Sub_CategoryList;	

	}
	@Override
	public List<Product> fetchProduct() throws Exception{
		log.info("bluestoneManagerImpl :   fetchProductLineList");
		List<Product> product=new ArrayList<Product>();
		List<Product_Header> Sub_ProductList=null;
		try{
			String queryString="from Product_Header";
			log.info("queryString : "+queryString);
			Transaction t=bluestoneManagerImpl.getSession().beginTransaction();
			Sub_ProductList=(List<Product_Header>) session.createQuery(queryString).list();
			log.info(Sub_ProductList.size());
			Iterator<Product_Header> itr=Sub_ProductList.listIterator();
			while(itr.hasNext())
			{
				Product_Header productheader=itr.next();
				String product_id=productheader.getId();
				String query="from Product_Supplier where product_id='"+product_id+"'";
				List<Product_Supplier> product_supplier=(List<Product_Supplier>) session.createQuery(query).list();
				if(product_supplier.size()>0)
				{
					Product_Supplier supplier=product_supplier.get(0);
					Product newproduct=new Product();
					newproduct.setproduct_header(productheader);
					newproduct.setproduct_Supplier(supplier);
					System.out.println(newproduct);
					product.add(newproduct);
				}
			}
			t.commit();
		}catch(Exception e){
			e.printStackTrace();
			throw new Exception(e);
		}
		return product;
	}

}
