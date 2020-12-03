import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


class testSelectionSort {
 SelectionSort x = new SelectionSort();
	@Test
	void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}
	
	public testSelectionSort() {}
	
	public void testPositive() { 
	int[] arr = new int[5];        
	arr[0] = 8;       
	arr[1] = 9;        
	arr[2] = 7;       
	arr[3] = 10;        
	arr[4] = 2;
	
	int[] sortedArr = new int[5];
	sortedArr[0] = 2;
	sortedArr[1] = 7;
	sortedArr[2] = 8;
	sortedArr[3] = 9;
	sortedArr[4] = 10;
	
	
	}
	
	public void testNegative() {
		int[] arr = new int[5];        
		arr[0] = -8;       
		arr[1] = -9;        
		arr[2] = -7;       
		arr[3] = -10;        
		arr[4] = -2;
		
		int[] sortedArr = new int[5];
		sortedArr[4] = -2;
		sortedArr[3] = -7;
		sortedArr[2] = -8;
		sortedArr[1] = -9;
		sortedArr[0] = -10;
		
		
	}
	
	public void testMixed() {
		int[] arr = new int[5];        
		arr[0] = 2;       
		arr[1] = -7;        
		arr[2] = 8;       
		arr[3] = -9;        
		arr[4] = 10;
		
		int[] sortedArr = new int[5];
		sortedArr[0] = -9;
		sortedArr[1] = -7;
		sortedArr[2] = 2;
		sortedArr[3] = 8;
		sortedArr[4] = 10;
		
	}
	
	public void testDuplicates() {
		int[] arr = new int[5];        
		arr[0] = 2;       
		arr[1] = 2 ;      
		arr[2] = -9 ;     
		arr[3] =  7  ;    
		arr[4] = -9;
		
		int[] sortedArr = new int[5];
		sortedArr[0] = -9;
		sortedArr[1] = -9;
		sortedArr[2] = 2;
		sortedArr[3] = 2;
		sortedArr[4] = 7;
		
		
	}
	

}
