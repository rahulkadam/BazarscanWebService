package com.bz.bazarscan.TestClient;

import com.bz.bazarscan.controller.BluestoneController;

public class TestClient {
	public static void main(String args[])
	{
		BluestoneController bluestoneController=new BluestoneController();
		System.out.println("fetch from test client");
		bluestoneController.fetchProduct();
		System.out.println("fetch complete");
	}
}
