package com.TPAssignment2;
import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;



/**
 * Created by student on 2017/03/16.
 */
public class TestQuestion1 extends TestCase
{
    @Test
    public void testFloat() throws Exception
    {
        assertEquals("Incorrect value",Question1.tstfloat(3.0f, 2.0f), 5.0f);
    }



    @Test
    public void testInt() throws Exception
    {
        assertEquals("Incorrect value",Question1.tstInt(4,4), 8);
    }

    @Test
    public void testEquality() throws Exception
    {
        String t = new String("Equal");

        assertEquals("Objects are not equal", Question1.tstEqualty(), t);
    }
    @Test
    public void testIdentity() throws Exception
    {
        String a = new String("a");
        String b = a;

        assertSame(a, b);
    }

    @Test
    public void testTrue() throws Exception
    {
        assertTrue("Suppose to be True", Question1.tstTrue());
    }

    @Test
    public void testFalse() throws Exception
    {

        assertFalse("Suppose to be false", Question1.tstFalse());
    }

    @Test
    public void testNull() throws Exception
    {
        assertNull("The methode returns not null",Question1.tstNull());
    }

    @Test
    public void testNonNull() throws Exception
    {
        assertNotNull("The method is returning null",Question1.tstNonNull());
    }


    @Test
    public void testArrays() throws Exception
    {
        int[] arrayNum= new int[2];
        arrayNum[1] = 45;
        assertEquals(arrayNum[1], 45);

    }

    @Test
    public void testFail() throws Exception
    {
        Question1.fail();

    }

    @Test
    @Ignore
    public void ignoretst() throws Exception
    {
        Question1.tstIgnore();
    }
    @Test(timeout = 1000)
    public void testTimeout() throws Exception {

        {
            Question1.timeOutTest();
        }
    }
}
