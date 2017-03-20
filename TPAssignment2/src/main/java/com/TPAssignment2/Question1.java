package com.TPAssignment2;

/**
 * Created by student on 2017/03/16.
 */
public class Question1
{

    public static float tstfloat(float a, float b)
    {
        float sum= a + b;
        return sum;
    }


    public static int tstInt(int a, int b)
    {
        int sum= a + b;
        return sum;
    }

    public static String tstEqualty()
    {
        String b;
        String a = new String("Equal");
        b=a;

        return b;
    }


    public static String tstIdentity()
    {
        String a = new String("c");

        return a;
    }

    public static boolean tstTrue()
    {
        boolean test = true;
        return test;
    }

    public static boolean tstFalse()
    {
        boolean test=false;
        return test;
    }

    public static String tstNull()
    {
        String a = null;
        return a;
    }

    public static String tstNonNull()
    {
        String a = "isnotnull";
        return a;
    }

    public static void timeOutTest()
    {
        int a=5;
        int b= 6;
        int c = b-a;
        int i = c;
        while (i < 3001)
        {
            System.out.println(i);
            i++;
        }
    }


    public static void fail() {
        fail();
        System.out.println("line after fail");
    }

    public static void tstIgnore()
    {
        System.out.println("Test was not ignored");
    }

}
