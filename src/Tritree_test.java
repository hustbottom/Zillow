import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class Tritree_test {

	@Test
	public void test() {
		Tree root = new Tree();
		int[] A = {5, 4, 9, 5, 7, 2, 2};
		for(int temp: A){
			root.insert(new Tritree(temp));
		}
		root.delete(4);
		Assert.assertEquals(2, root.root.left.value);
//		root.delete(4);
//		Assert.assertEquals(2, root.root.left.value);
//		root.delete(5);
//		Assert.assertEquals(2, root.root.value);
//		root.delete(7);
//		Assert.assertEquals(9, root.root.right.value);
//		System.out.println(root.delete(10));
	}

}
