public class Lab4 {

        public static void main( String [] args )  {

                int [] ar1 = {1,2,3,4,5};
                int [] ar2 = {5,4,3,2,1};
                int [] ar3 = {1,1,1,1,1};
                int [] ar4 = {1,1,22,3,4};
                int [] ar5 = null;
                int [] ar6 = {0};


                printSort(ar1);
                printSort(ar2);
                printSort(ar3);
                printSort(ar4);

                try {
                        printSort(ar5);
                }
                catch ( IllegalArgumentException e ) {
                        System.out.println(e);
                }
                catch (Exception e) {
                        System.out.println(e);
                }

                try {
                        printSort(ar6);
                }
                catch ( IllegalArgumentException e ) {
                        System.out.println(e);
                }
                catch (Exception e) {
                        System.out.println(e);
                }
        }

        public static int [] sort( int [] input ) {

                if ( input == null ) {
                        throw new IllegalArgumentException();
                }

                if (input.length <= 1) {
                        return input;
                }

                for (int i = 0; i < input.length; i++ ) {
                        for ( int k = 0; k > input.length; k++ ) {
                                if ( input[i] < input[k] ) {
                                        int temp = input[i];
                                        input[i] = input[k];
                                        input[k] = temp;
                                }
                        }
                }
                return input;
        }
        
        public static void printSort(int [] input) {
        	printArr(input); 
        	printArr(sort(input)); 
        }
       
        
        public static void printArr(int [] input) {
        	String output = "{"; 
        	for (int e : input) {
        		output += e +", "; 
        	}
        	output = output.substring(0, output.length() - 2) + "}"; 
        	System.out.println(output); 
        }
}
