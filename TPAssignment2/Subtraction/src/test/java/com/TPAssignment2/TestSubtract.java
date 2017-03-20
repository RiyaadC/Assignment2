package com.TPAssignment2;

import junit.framework.TestCase;
import org.junit.Test;



/**
 * Created by student on 2017/03/19.
 */
public class TestSubtract extends TestCase
{
    @Test
    public void testSubtract() throws Exception
    {
        assertEquals("Incorrect",SubtractNUms.SubtractNums(5,4),1);
    }
}