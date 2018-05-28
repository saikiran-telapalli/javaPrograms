package StringPrograms;

public class PerformanceTestForBufferAndBuilder {

	/**
	 * No.	StringBuffer	StringBuilder
1)	StringBuffer is synchronized i.e. thread safe. 
	It means two threads can't call the methods of StringBuffer simultaneously.	
1)  StringBuilder is non-synchronized i.e. not thread safe. 
	It means two threads can call the methods of StringBuilder simultaneously.
2)	StringBuffer is less efficient than StringBuilder.	
2)  StringBuilder is more efficient than StringBuffer.
	 * @param args
	 */
	 public static void main(String[] args){  
	        long startTime = System.currentTimeMillis();  
	        StringBuffer sb = new StringBuffer("Java");  
	        for (int i=0; i<10000; i++){  
	            sb.append("Tpoint");  
	        }  
	        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
	        startTime = System.currentTimeMillis();  
	        StringBuilder sb2 = new StringBuilder("Java");  
	        for (int i=0; i<10000; i++){  
	            sb2.append("Tpoint");  
	        }  
	        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
	    }  
}
