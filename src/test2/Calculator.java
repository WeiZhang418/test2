package test2;



	public class Calculator {
	    private static int result;    
	    public void add(int n)
	    {
	        result=result+n;
	    }
	    
	    public void substract(int n)
	    {
	        result=result-1;        //Bug
	    }
	    
	    public void multiply(int n)
	    {
	        //not implemented.
	    }
	    
	    public void divide(int n)
	    {
	        result=result/n;
	    }
	    
	    public void square(int n)
	    {
	        result=n*n;
	    }
	    
	    public void squareRoot(int n)
	    {
	        for(;;);    //Bug:dead lock
	    }
	    
	    public void clear()
	    {
	        result=0;  
	    }
	    
	    public int getResult()
	    {
	        return result;
	    }
	}

