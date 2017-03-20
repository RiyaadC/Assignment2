package com.TPAssignment2;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2017/03/19.
 */
public class TestMultiplication extends TestCase
{
    @Test
    public void testMultiply() throws Exception
    {
        assertEquals("Incorrect",MultiplyNums.MultiNums(5,20),100);
    }
}
