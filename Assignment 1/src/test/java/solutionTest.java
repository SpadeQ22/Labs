import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;


public class solutionTest {

//
//    @Test
//    public void solve4A(){
//        solution sol = new solution();
//
//    }
    @Test
    public void solve69A(){
        solution sol = new solution();
        int case1Size = 3;
        int [][] case1Arr = {{-1, 0, 3}, {2, 5, -2}, {-1, -5, -1}};
        int case2Size = 4;
        int [][] case2Arr = {{2, 0, 4}, {3, -1, 5}, {1, 0, 0}, {1, 4, 0}};
        int case3Size = 1;
        int [][] case3Arr = {{1, 0, 3}};
        Assert.assertEquals("YES", sol.solve69A(case1Size, case1Arr));
        Assert.assertEquals("NO", sol.solve69A(case2Size, case2Arr));
        Assert.assertEquals("NO", sol.solve69A(case3Size, case3Arr));

    }

}
