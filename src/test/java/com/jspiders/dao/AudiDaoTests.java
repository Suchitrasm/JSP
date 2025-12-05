package com.jspiders.dao;

import com.jspiders.entity.AuditoriumEntity;
public class AudiDaoTests {
    public static void main(String[] args) {
        addAuditoriumTest();
    }
    public static void addAuditoriumTest()
    {
        System.out.println("Testing ADD Auditorium");
        try {

            AuditoriumDaoImp auditoriumDao = new AuditoriumDaoImp();

            AuditoriumEntity auditoriumEntity = new AuditoriumEntity();

            auditoriumEntity.setName("AUDI-1");
            auditoriumEntity.setSeatColumns(20);
            auditoriumEntity.setSeatRows(40);
            auditoriumDao.addAuditorium(auditoriumEntity);

            System.out.println("✅ADD Auditorium Test PASSED");
        }
        catch (Exception ex) {
            System.err.println("❌ADD Auditorium Test FAILED");
            ex.printStackTrace();
        }
    }
}
