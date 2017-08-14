/**
 * Mainclass.java
 * 
 * Compiled on 14th Aug 2017
 * 
 */
//Package Declaration
package myPack;
/**
 * this class will implement the Mainclass for instantiation of FixedStack & VariableStack classes' objects
 * 
 * @author chhaya yadav
 *
 */
//Class Declaration
public class MainClass {
	
//Main method declaration	
	
	public static void main(String[] args){
		
//FixedStack Object Instantiation	
		
		System.out.println("____________________________________________");
		
		System.out.println("FIXED STACK 1");
		
		System.out.println("____________________________________________");
			
		FixedStack fs1 = new FixedStack(11);
			
		fs1.push(fs1.pop());
		
		System.out.println("____________________________________________");
		
		System.out.println("FIXED STACK 2");
		
		System.out.println("____________________________________________");
			
	    FixedStack fs2 = new FixedStack(10);
			
		fs2.push(fs2.pop());
		
		System.out.println("____________________________________________");
		
		System.out.println("FIXED STACK 3");
		
		System.out.println("____________________________________________");
			
	    FixedStack fs3 = new FixedStack(6);
			
		fs3.push(fs3.pop());
	
//VariableStack Object Instantiation
		
		System.out.println("____________________________________________");
		
		System.out.println("VARIABLE STACK 1");
		
		System.out.println("____________________________________________");
		
		VariableStack vs1 = new VariableStack(1);
		
		vs1.push(vs1.pop());
		
		vs1.push(5);
	
		vs1.push(6);
	}
		
}