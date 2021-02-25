

import java.util.*;
import java.io.*;
import java.lang.*;
class pizza {
	static class inf
	{
		static int no_ing;
		static ArrayList<String> ing_ctn=new ArrayList<>();	
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
int n_pizza=sc.nextInt();
int n_2=sc.nextInt();
int n_3=sc.nextInt();
int n_4=sc.nextInt();
ArrayList<inf> list=new ArrayList<>();
for(int i=0;i<n_pizza;i++)
{
	inf x=new inf();
	x.no_ing=sc.nextInt();
	for(int j=0;j<x.no_ing;j++)
	{
		x.ing_ctn.add(sc.next());
	}
list.add(x);
}
System.out.println(n_pizza);
System.out.println(n_2);
System.out.println(n_3);
System.out.println(n_4);
for(inf x:list)
	for(int j=0;j<x.ing_ctn.size();j++)
	{
	System.out.print(x.ing_ctn.get(j)+" ");	
}
System.out.println();
}
}
