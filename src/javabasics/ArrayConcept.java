package javabasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		// lowest bound/index = 0
		// upper bound/index = n-1 (n is size of the array)
		
		//disadvantages of array
		// size is fixed-- static array
		//stores only similar datatypes
int i[]=new int[4];
 i[0]=10;
 i[1]=20;
 i[2]=30;
 i[3]=40;
 
 System.out.println(i[2]);
 
 System.out.println(i.length);//size of array
 //print all the values of array : use for loop
 for (int j=0;j<i.length;j++) {
	 System.out.println(i[j]);
 }
 
 
 double d[] = new double[3] ;
 d[0]= 10.33;
 d[1]=15.67;
 d[2]=22.34;
 System.out.println(d[2]);
 
 boolean b[]=new boolean[2];
 b[0]=true;
 b[1]=false; 
 
// object array is used to store different datatypes values
 Object ob[]=new Object[5];
 ob[0]="sagar";
 ob[1]=26;
 ob[2]=7/6/1994;
 ob[3]='M';
 ob[4]="hyderabad";
 
	}

}