package com.jspiders.dao;

import com.jspiders.config.DbConfig;
import com.jspiders.entity.MovieEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MovieDaoImp  implements MovieDao {
    @Override
    public void addMovie(MovieEntity movieEntity)
    {
        System.out.println("Adding movie");
        Session session = DbConfig.getSession();
        Transaction transaction = session.beginTransaction();

        session.close();

    }
    public void getMovie(Long movieId)
    {
        System.out.println("Getting movie");
        Session session = DbConfig.getSession();
        //logics
        session.close();
    }
    public void updateMovie(Long movieId)
    {
        System.out.println("Updating movie");
        Session session = DbConfig.getSession();
        //logics
        session.close();
    }
    public void deleteMovie(Long movieId)
    {
        System.out.println("Deleting movie");
        Session session = DbConfig.getSession();
        //logics
        session.close();
    }
}
