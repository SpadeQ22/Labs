import org.junit.Assert;
import org.junit.jupiter.api.*;


public class solutionTest {

    solution ass1;

    @BeforeEach
    public void init(){
        ass1 = new solution();
    }

    @Nested
    class testeven{
        @BeforeEach
        public void init(){
            ass1.odd = false; //if n is even the function will return true
        }
        @Test
        public void tc1even(){
            int n = 0;
            Assert.assertEquals(true, ass1.even_odd(n));
        }
        @Test
        public void tc2even(){
            int n = 20;
            Assert.assertEquals(true, ass1.even_odd(n));
        }
        @Test
        public void tc3even(){
            int n = -20;
            Assert.assertEquals(true, ass1.even_odd(n));
        }
        @Test
        public void tc4even(){
            int n = 45;
            Assert.assertEquals(false, ass1.even_odd(n));
        }
    }

    @Nested
    class testodd{

        @BeforeEach
        public void init(){
            ass1.odd = true; //if n is odd the function will return true
        }
        @Test
        public void tc1odd(){
            int n = 1;
            Assert.assertEquals(true, ass1.even_odd(n));
        }
        @Test
        public void tc2odd(){
            int n = 21;
            Assert.assertEquals(true, ass1.even_odd(n));
        }
        @Test
        public void tc3odd(){
            int n = -1;
            Assert.assertEquals(true, ass1.even_odd(n));
        }
        @Test
        public void tc4odd(){
            int n = -21;
            Assert.assertEquals(true, ass1.even_odd(n));
        }
        @Test
        public void tc5odd(){
            int n = 22;
            Assert.assertEquals(false, ass1.even_odd(n));
        }
    }

    @Nested
    class max_minTests{
        @Test
        public void tc1max_min(){
            int [] arr = {-2, 0, -1, -100, 2, 100, 1000000};
            int size = 7;
            int [] exp = {1000000, -100};
            Assert.assertArrayEquals(exp, ass1.max_min(arr, size));
        }
        @Test
        public void tc2max_min(){
            int [] arr = {1, 2, 3, 4, 6, 7};
            int size = 6;
            int [] exp = {7, 1};
            Assert.assertArrayEquals(exp, ass1.max_min(arr, size));
        }
        @Test
        public void tc3max_min(){
            int [] arr = {100, 3, 2, 1, 0, -110, -1, -2};
            int size = 8;
            int [] exp = {100, -110};
            Assert.assertArrayEquals(exp, ass1.max_min(arr, size));
        }

        @Test
        public void tc4max_min(){
            int [] arr = {1};
            int size = 1;
            int [] exp = {1, 1};
            Assert.assertArrayEquals(exp, ass1.max_min(arr, size));
        }
        @Test
        public void tc5max_min(){
            int [] arr = {1, 1};
            int size = 2;
            int [] exp = {1, 1};
            Assert.assertArrayEquals(exp, ass1.max_min(arr, size));
        }

    }

    @AfterEach
    public void clean(){
        ass1 = null;
    }


}
