package com.jspiders.dao;

import com.jspiders.entity.MovieEntity;
import com.jspiders.enums.CertificateType;
import com.jspiders.enums.MovieStatus;

public class MovieDaoTests {
    public static void main(String[] args) {
        testAddMovie();
    }

    public static void testAddMovie()
    {
        System.out.println("Testing ADD Movie");
        try {
            MovieDaoImp movieDao = new MovieDaoImp();
            MovieEntity movieEntity = new MovieEntity();
            movieEntity.setTitle("movie-1");
            movieEntity.setCertification(CertificateType.U);
            movieEntity.setLanguage("ENG");
            movieEntity.setDuration(120);
            movieEntity.setStatus(MovieStatus.AVAILABLE);

            movieDao.addMovie(movieEntity);
            System.out.println("ADD MOVIE Test PASSED");
        }
        catch (Exception ex) {
            System.err.println("ADD MOVIE Test FAILED");
        }
    }


}
