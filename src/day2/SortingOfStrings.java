package day2;
import java.util.Arrays;

public class SortingOfStrings {
	public static void main(String[] args) {
		String[] a= {"raghu","bablooo","mahesh","sankar","samba"};
		int b = a.length;  
	 
		for(int i = 0; i<b-1; i++)   
		{  
		for (int j = i+1; j<a.length; j++)   
		{    
		if(a[i].compareTo(a[j])>0)   
		{   
		String temp = a[i];  
		a[i] = a[j];  
		a[j] = temp;  
	}  
}  
	}    
		System.out.println(Arrays.toString(a));  
 }  
}