package com.TPAssignment2;

/**
 * Created by Riyaad on 3/20/2017.
 */
import junit.framework.TestCase;

/**
 * Created by student on 2017/03/19.
 */
public class AdditionTest extends TestCase
{
    public void testAddNums() throws Exception
    {

        assertEquals("Incorrect",AddingNumbers.AddNums(25,75),100);

    }
}
