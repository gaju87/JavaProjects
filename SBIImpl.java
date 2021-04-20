package com.braindata.bankmanage.service;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.braindata.bankmanage.client.Account;
import com.braindata.bankmanage.model.RBI;

public class SBI implements RBI 
{
	Account a = new Account();
	Scanner sc = new Scanner(System.in);
	
	

	public void createAcc() 
	{
		
		boolean a1= true;
		while(a1)
		{
			try 
			{
				//Account a = new Account();
				System.out.println("Enter The Account Number");
				String accNo= sc.nextLine();
				if((accNo.matches("[0-9]*")))
				{
					
					a.setAccNo(accNo);
				}
				a1=false;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Enter the valid Account number");
				sc.nextLine();
			}
		}

			System.out.println("Enter The Account Holder Name");
			String name= sc.nextLine();
			if((name.matches("[a-zA-Z]*")))
			{
				
				a.setName(name);
			}
			
			System.out.println("Enter The Mobile Number");
			String mobNo= sc.nextLine();
			if((mobNo.matches("[0-9]{10}")))
			{
				a.setMobNo(mobNo);
			}
			
			
			System.out.println("Enter The Adhaar Number");
			String Adharno= sc.nextLine();
			if((Adharno.matches("[0-9]{12}")))
			{
				a.setAdharno(Adharno);
			}
			
			
			System.out.println("Enter The Gender of  Person");
			String gender= sc.nextLine();
			if((gender.matches("[a-zA-Z]*")))
			{
				a.setGender(gender);
			}
			
			System.out.println("Enter The Age of  Person");
			String age= sc.nextLine();
			if((age.matches("[0-9]*")))
			{
				a.setAge(age);
			}
			
			System.out.println("Enter Minimum Amount of  Person");
			String minBal= sc.nextLine();
			if((minBal.matches("[0-9]*")))
			{
				a.setMinBal(minBal);
			}
	}
	public void displayAllaccDetails() 
	{
		System.out.println("            *``````````````````````````````````` *               ");
		System.out.println("*************         Coustomer Profile          ****************");
		System.out.println("            *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ *               ");
		System.out.println("");
		System.out.println("//=============================================================//");
		System.out.println("");
		System.out.println("1."+" Account No of the Person         : "+a.getAccNo());
		System.out.println("2."+" Name of the Person               : "+a.getName());
		System.out.println("3."+" Mobile No of the Person:         : "+a.getMobNo());
		System.out.println("4."+" Adhaar No the Person             : "+a.getAdharno());
		System.out.println("5."+" Gender the of Person             : "+a.getGender());
		System.out.println("6."+" Age of Person                    : "+a.getAge());
		System.out.println("7."+" Show the Min Balance             : "+a.getMinBal());
		System.out.println("");
		System.out.println("//=============================================================//");
	}
	
		public void depositMoney() 
		{
			System.out.println("//=======================================================//");
			System.out.println("Enter How much Amount you Want to Deposit ?");
			Amt = sc.nextDouble();
			double d= Double.parseDouble(a.getMinBal());
			Amt= Amt+d;
			System.out.println("//======================================================//");
			System.out.println("New Balance : " +Amt);
			String s = Double.toString(Amt);
			a.setMinBal(s);
			System.out.println("//=======================================================//");
			System.out.println("Amount Deposited Successfully");
		}
		
		public void withdrawal() 
		{
			double d= Double.parseDouble(a.getMinBal());
			System.out.println("//======================================================//");
			System.out.println("Enter How much Amount you Want to Withdrawl ?");
			double Amt = sc.nextDouble();
			if(d>Amt)
			{
				Amt = d-Amt;
				System.out.println("//====================================================//");
				System.out.println("New Balance : " +Amt);
				String s = Double.toString(Amt);
				a.setMinBal(s);
				System.out.println("//====================================================//");
				System.out.println("Amount Withdrawl Successfully");
			}
			else
			{
				System.out.println("Enter Valid Amount ");
			}
			
	}
	
	public void accountBalance() 
	{
		double d= Double.parseDouble(a.getMinBal());
		System.out.println("//==================================//");
		System.out.println("Account Balance is " +d);
		System.out.println("//==================================//");
		
	}
	
	double Amt;
}
