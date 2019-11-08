package org.testyantra.example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HashMap with Country as key and capital as value
		   HashMap<Integer,String> countryCapitalMap=new HashMap<Integer,String>();
		  countryCapitalMap.put(101,"Delhi");
		  countryCapitalMap.put(103,"Tokyo");
		  countryCapitalMap.put(109,"Paris");
		  countryCapitalMap.put(105,"Moscow");
		  
		  for(Map.Entry hm:countryCapitalMap.entrySet())
		  {
			  System.out.println(hm.getKey()+"   "+hm.getValue());
			  
		  }
		 
		 
		  System.out.println("-----------------------------");
		 
		  // Creating  ArrayList from Keys
		  
		  ArrayList<Integer> keysArrayList=new ArrayList<Integer>(countryCapitalMap.keySet());
		  System.out.println("Keys are: ");
		  
		for (Integer country:keysArrayList)
		  {
		 System.out.println(country);
		}
		 
		  System.out.println("-----------------------------");
		 
		  //Creating  ArrayList from Values
		  ArrayList<String> valuesArrayList=new ArrayList<String>(countryCapitalMap.values());
		  System.out.println("Values are: ");
		  for (String capital:valuesArrayList) {
		 System.out.println(capital);
		}
		  System.out.println("-----------------------------");
		 
		  
		
		



	}

}
