/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class StaticVariablesAreShared
{
	
	static int num;
	String str;
	
	StaticVariablesAreShared(int a, String b){
		num = a;
		str = b;
	}
	
	public static void main (String[] args) 
	{
		StaticVariablesAreShared obj1 = new StaticVariablesAreShared(123, "Begin");
		StaticVariablesAreShared obj2 = new StaticVariablesAreShared(321, "End");
		
		System.out.println("obj1.num : "+obj1.num+", obj1.str : "+obj1.str); // obj1.num : 321, obj1.str : Begin
		System.out.println("obj2.num : "+obj2.num+", obj2.str : "+obj2.str); // obj2.num : 321, obj2.str : End
	}
}
