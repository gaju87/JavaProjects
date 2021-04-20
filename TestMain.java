package com.braindata.bankmanage.serviceimpl;

import java.util.Scanner;

import com.braindata.bankmanage.client.Account;
import com.braindata.bankmanage.service.SBI;

public class Test extends SBI
{
	public static void main(String [] args)
	{
		Account a1 = new Account();
		SBI s = new SBI();
		Scanner sc = new Scanner(System.in);
		System.out.println("*=================================== *");
		System.out.println("*  Welcome To Bank ManageMent System *");
		System.out.println("*=================================== *");
		System.out.println("You want to continue press 1");
		System.out.println("For exit press 0");

		int x=sc.nextInt();
		
		
			while(true)
			{
				
				
				if(x==1)
				{
					System.out.println("Select Choice");
					System.out.println("1: Select Create Account");
					System.out.println("2: Select DisplayAccDetails");
					System.out.println("3: Select Deposit Money ");
					System.out.println("4: Select Withdrwal Money");
					System.out.println("5: Select View Balance");
					System.out.println("0: exit");
				}
			
				
			int a= sc.nextInt();
		
			switch(a)
			{
			case 1:
				s.createAcc();
				break;
			case 2:
				s.displayAllaccDetails();
				break;
			case 3:
				s.depositMoney();
				break;
			case 4:
				s.withdrawal();
				break;
			case 5:
				s.accountBalance();
				break;
			case 0:
				System.out.println("* Thank You ! Visit Again Our Bank *");
				System.exit(x);
				break;
				
			default :
				System.out.println("Select Valid Type");
				break;
				
		
			}
		}
	}
}
