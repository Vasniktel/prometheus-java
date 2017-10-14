public class SquareRoot {

    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;
        
        if (a == 0 && b != 0)
        {
        	System.out.println("x1=" + (0.0 - c / b));
        	System.out.println("x2=" + (0.0 - c / b));
        }
        
        else if (a == 0 && b == 0)
        {
        	System.out.println("x1=");
        	System.out.println("x2=");
        }
		
		else
		{

	        double d = b * b - 4d * a * c;
	        
	        
	        if (d > 0)
	        {
	        	double x1 = (-b + Math.sqrt(d)) / (2d * a);
	        	double x2 = (-b - Math.sqrt(d)) / (2d * a);
	        	
	        	System.out.println("x1=" + x1);
	        	System.out.println("x2=" + x2);
	        }
	        else if (d == 0)
	        {
	        	double x = -b / (2d * a);
	        	
	        	System.out.println("x1=" + x);
	        	System.out.println("x2=" + x);
	        }
	        else
	        {
	        	System.out.println("x1=");
	        	System.out.println("x2=");
	        }
	    }
    }
}
