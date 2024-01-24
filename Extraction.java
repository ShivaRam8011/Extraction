package com.whileloop;

public class Extraction 
{
	public static void main(String args[])
	{
		int num=7851,sum=0;
		while(num!=0)  //7851!=0true ,785!=0true, 78!=0t, 7!=0t, 0!=0false
		{
			sum=sum+num%10; //sum=0+1, sum=1+5,sum=1+5+8, sum=1+5+8+7=21
			num=num/10;    //num=7851/10=785, 785/10=78,  78/10=7, 7/10=0
		}
		System.out.println(sum); //sum=21
	}
}
    
