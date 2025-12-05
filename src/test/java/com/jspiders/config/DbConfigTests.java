package com.jspiders.config;

public class DbConfigTests {
    public static void main(String[] args)
    {
        testDbConnection();
    }
    public static void testDbConnection()
    {
        System.out.println("Testing DB Connection");
        try {
            DbConfig.getSession();
            DbConfig.shutdown();
            System.out.println("Test DB PASSED");
        }
        catch (Exception ex) {
            System.out.println(" Test DB FAILED");
        }

    }
}
