import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TrafficSignaling
{
    static class info
{
    int strt;
    int end;
    String nm;
    int durtn;
}
static class path
{
    int path_lth;
    ArrayList<String> p=new ArrayList<>();
}
	public static void main (String[] args) throws java.lang.Exception
	{
		File file = new File("");
	Scanner sc=new Scanner(file);
	int sim_time=sc.nextInt();
	int no_intsct=sc.nextInt();
	int no_streets=sc.nextInt();
	int no_cars=sc.nextInt();
	int score=sc.nextInt();
	ArrayList<info> list1=new ArrayList<>();
	for(int i=0;i<no_streets;i++)
	{
	   info x=new info();
	   x.strt=sc.nextInt();
	   x.end=sc.nextInt();
	   x.nm=sc.next();
	   x.durtn=sc.nextInt();
	   list1.add(x);
	}
	ArrayList<path> list2=new ArrayList<>();
for(int i=0;i<no_cars;i++)
{
    path x=new path();
    x.path_lth=sc.nextInt();
    for(int j=0;j<x.path_lth;j++)
    {
        x.p.add(sc.next());
}
list2.add(x);
}
sc.close();
}
}

