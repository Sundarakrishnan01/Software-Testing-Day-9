package test.day9;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Ex1 {
  @Test(dataProvider = "dp",priority=3)
  public void add(Integer n1, Integer n2) {
	  System.out.println("Addition "+ (n1+n2));
  }
  @Test(dataProvider = "dp",priority=2)
  public void sub(Integer n1, Integer n2) {
	  System.out.println("Difference "+ (n1-n2));
  }
  @Test(dataProvider = "dp",priority=4)
  public void product(Integer n1, Integer n2) {
	  System.out.println("Product " +n1*n2);
  }
  @Test(dataProvider = "dp",priority=1)
  public void div(Integer n1, Integer n2) {
	  System.out.println("Division "+n1/n2);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 10, 5},
      new Object[] { -2, -10 },
    };
  }
}
