package conditional;
class Sample{
	int x,y,z;
	void setData()
	{
		x=10;
		y=20;
		z=x+y;
		System.out.println("I am set data");
	}
	void printData()
	{
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println("z:"+z);
		
	}
}
class SubSample extends Sample
{
	void changeData()
	{
		x=100;
		y=200;
		z=x+y;
		System.out.println("i am change data");
	}
}
public class Inherit {
	public static void main(String[] args) {
		SubSample ss =new SubSample();
		ss.setData();
		ss.printData();
		ss.changeData();
		ss.printData();   
	}
}
