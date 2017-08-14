/**
 * VariableStack.java
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
public class VariableStack implements Stack {
	
//Member variable declaration	
	
	private int stackSize ;
	
	private int vi ;
	
//Parameterized Constructor declaration
	
	public VariableStack(int sizeOfStack){
		
		vi = 0 ;
		
		stackSize = sizeOfStack ;
	}
	
//Method definition of Stack Interface Methods		
    public void push(int i) {
    	
		if(i>0)
		{
			vi = vi + i ;
			
			System.out.println("Variable Stack size increased  " );
		
		}
		
		
		System.out.println("Variable Stack Total Elements Present  :" + vi );
		
	}
//Method definition of Stack Interface Methods	
	public int pop(){
		
		int exceed = stackSize - vi ;
		
		return exceed ;
		
	}
	

}
