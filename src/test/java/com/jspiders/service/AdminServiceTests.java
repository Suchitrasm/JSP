package com.jspiders.service;

import com.jspiders.dao.MovieDaoImp;
import com.jspiders.entity.MovieEntity;
import com.jspiders.enums.CertificateType;
import com.jspiders.enums.MovieStatus;
import com.jspiders.users.AdminServiceImp;

public class AdminServiceTests {
    public static void main(String[] args) {
        createMovieTest();
    }

    private static void createMovieTest() {
        System.out.println("Testing ADD Movie");
        try {

            AdminServiceImp adminService = new AdminServiceImp();
            adminService.createMovie();

            System.out.println("✅ADMIN - Create Movie Test PASSED");
        }
        catch (Exception ex) {
            System.err.println("❌ADMIN - Create Movie Test FAILED");
            ex.printStackTrace();
        }



    }
}
