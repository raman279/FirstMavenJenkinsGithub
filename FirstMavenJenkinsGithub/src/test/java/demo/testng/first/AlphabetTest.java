package demo.testng.first;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlphabetTest {
  @Test
  public void f1() {
	  Assert.assertEquals("A", "A");
  }
  @Test
  public void f2() {
	  Assert.assertEquals("B", "b");
  }
  @Test
  public void f3() {
	  Assert.assertEquals("c", "c");
  }
  @Test
  public void f4() {
	  Assert.assertEquals("D", "DD");
  }
}
