package com.TPAssignment2;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2017/03/19.
 */
public class TestDivision extends TestCase {
    @Test
    public void testDivideNUms() throws Exception {

        assertEquals("Incorrect",Division.DivideNums(8, 2), 4);


    }
}
