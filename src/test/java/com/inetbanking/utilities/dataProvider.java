package com.inetbanking.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class dataProvider {
	
	@DataProvider(name="loginData")
	public String[][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"//src//test//java//com//inetbanking//testData//LoginData.xlsx";
		XLUtility xls=new XLUtility(path);
		int rownum=xls.getRowCount("Sheet1");
		int colnum=xls.getCellCount("Sheet1", 1);
		
		String logindata[][]=new String[rownum][colnum];
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colnum;j++)
			{
				logindata[i-1][j]=xls.getCellData("Sheet1", i, j);
			}
		}
		return logindata;
	}
}
