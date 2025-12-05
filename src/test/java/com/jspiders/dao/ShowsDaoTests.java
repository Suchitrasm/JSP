package com.jspiders.dao;

import com.jspiders.entity.AuditoriumEntity;
import com.jspiders.entity.MovieEntity;
import com.jspiders.entity.ShowEntity;
import com.jspiders.enums.ShowStatus;

import java.time.LocalDate;

public class ShowsDaoTests {
    public static void main(String[] args) {

        addShowTest();
    }

    public static void addShowTest()
    {
        System.out.println("Testing ADD Show");
        try {

            ShowsDaoImp showsDaoImp = new ShowsDaoImp();
            AuditoriumDaoImp auditoriumDao = new AuditoriumDaoImp();
            MovieDaoImp movieDao = new MovieDaoImp();

            ShowEntity showEntity = new ShowEntity();
            showEntity.setShowTime(LocalDate.now());
            showEntity.setEndTime(LocalDate.now());
            showEntity.setStatus(ShowStatus.OPEN);

            AuditoriumEntity auditoriumEntity = auditoriumDao.getAuditorium(1l);
            showEntity.setAuditorium(auditoriumEntity);//link audi to show

            MovieEntity movieEntity = movieDao.getMovie(1l);
            showEntity.setMovie(movieEntity);//link movie to show

            showsDaoImp.addShow(showEntity);//add show to table

            System.out.println("✅ADD Show Test PASSED");
        }
        catch (Exception ex) {
            System.err.println("❌ADD Show Test FAILED");
            ex.printStackTrace();
        }
    }
}
