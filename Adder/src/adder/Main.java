package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide as many integers needed to add");
        }
    }

    private static int addArguments(String[] args) 
    {
	int sum = 0, i = 0;
	
	boolean b = false; 
	
	

	if(args[0].equals("-"))
	
	{
	    
		b = true;
	    
		i = 1; 
	
	}
	
	else
	
	{
	    										b = false;
	    								i = 0;
	
	}
	    
	
	for(int j = i; j < args.length; j++)
	{
       
		if(b == true)
	        
			sum -= Integer.valueOf(args[j]);
	   
		else
	        
			sum += Integer.valueOf(args[j]);
	

	}
	
	return sum;
    }
}
