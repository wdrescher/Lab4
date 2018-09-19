public class Lab4 { 

	public static void main( String [] args )  {
	
	
	}

	public static Object [] sort ( Object[] input) {
	 	if ( input = null; ) {
			throw new IllegalArgumentException(); 
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

	} 
}
