public class Lab4 { 

	public static void main( String [] args )  {
	try {

	}
	catch ( IllegalArgumentException e ) {
		System.out.println(e); 
	}
	catch (Exception e) {
		System.out.println(e);
	}
	int [] ar1 = {1,2,3,4,5};
	int [] ar2 = {5,4,3,2,1}; 
	int [] ar3 = {1,1,1,1,1}; 
	int [] ar4 = {1,1,22,3,4}; 
	int [] ar5 = null; 
	int ar6 = 0;


	System.out.println( sort(ar1) );  
	System.out.println( sort(ar2) );
	System.out.println( sort(ar3) );
	System.out.println( sort(ar4) );
	System.out.println( sort(ar5) );
	System.out.println( sort(ar6) );
	   
	}
        
	public static int [] sort( int [] input ) {
		
	 	if ( input = null; ) {
			throw new IllegalArgumentException(); 
		}

		if ( ! input.size < 1 ) {
			return input;
		}

		for (int i = 0; i < input.length; i++ ) {
			for ( int k = 0; k < input.length; k++ ) {
				if ( input[i] > input[k] ) {
					temp = input[i]; 
					input[i] = input[k];
					input[k] = temp; 
				}
			}
		}
		return intput; 
	} 
}
