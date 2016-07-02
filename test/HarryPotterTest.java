import static org.junit.Assert.*;

import org.junit.Test;

public class HarryPotterTest {
	
	HarryPotter Books = new HarryPotter();
	private void buyBooks(int number, int volume){
		Books.addBooks(number, volume);
	}
	
	//int[] list1 = {1, 0, 0, 0, 0};
	//int[] list2 = {1, 1, 1, 1, 1};
	
	@Test
	public void testOneBook() {
		buyBooks(1, 1);
		buyBooks(0, 2);
		buyBooks(0, 3);
		buyBooks(0, 4);
		buyBooks(0, 5);
		assertEquals(8.0, Books.getPrice(), 0.01);
		
	}
	
	@Test
	public void testFiveBook() {
		buyBooks(1, 1);
		buyBooks(1, 2);
		buyBooks(1, 3);
		buyBooks(1, 4);
		buyBooks(1, 5);
		assertEquals(30.0, Books.getPrice(), 0.01);
	}
	
	@Test
	public void test4DifferentBooks(){
		buyBooks(1, 1);
		buyBooks(1, 2);
		buyBooks(1, 3);
		buyBooks(1, 4);
		buyBooks(0, 5);
		assertEquals(25.6, Books.getPrice(), 0.01);
	}
	
	@Test
	public void test3DifferentBooks(){
		buyBooks(1, 1);
		buyBooks(1, 2);
		buyBooks(1, 3);
		buyBooks(0, 4);
		buyBooks(0, 5);
		assertEquals(21.6, Books.getPrice(), 0.01);
	}
	
	@Test
	public void test2DifferentBooks(){
		buyBooks(1, 1);
		buyBooks(1, 2);
		buyBooks(0, 3);
		buyBooks(0, 4);
		buyBooks(0, 5);
		assertEquals(15.2, Books.getPrice(), 0.01);
	}
	
	@Test
	public void testAnyListOfBooks(){
		buyBooks(2, 1);
		buyBooks(2, 2);
		buyBooks(2, 3);
		buyBooks(1, 4);
		buyBooks(1, 5);
		assertEquals(51.6, Books.getPrice(), 0.01);
	}

}
