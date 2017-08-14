/**
 * FixedStack.java
 * 
 * Compiled on 14th Aug 2017
 * 
 */
//Package Declaration
package myPack;
/**
 * this class will implement the Stack interface and define all the methods of Stack Interface
 * 
 * @author chhaya yadav
 *
 */
//Class Declaration
public class FixedStack implements Stack  {
	
//member variable declaration	
	
	private int fi ;
	
	private int sizeOfStack ;
	
	public  int  j ;
	
//Parameterized Constructor declaration	
	
	public FixedStack(int j){
		
		fi = 10 ;
		
		this.j = j ;
		
		sizeOfStack = 0 ;
		
	}
	
//Method definition of Stack Interface Methods	
	public void push(int i) {
		
		if(i>0)
		{
			sizeOfStack = sizeOfStack + j ;
			System.out.println("Stack size increased  " );
		
		}
		
		else {
			
			System.out.println("Stack overflow  "  );
		}
		
		
		System.out.println("STACK SIZE :" + sizeOfStack );
		
	}
//Method definition of Stack Interface Methods		
	
	public int pop(){
		
        int exceed = fi - j ;
		
		return exceed ;
		
	}
	
	
		
     
	

}
