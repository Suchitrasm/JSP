package com.jspiders.users;

import com.jspiders.dto.MovieDto;
import com.jspiders.enums.CertificateType;
import com.jspiders.enums.MovieStatus;
import com.jspiders.service.MovieServiceImp;

import java.util.Scanner;

public class AdminServiceImp implements AdminService {
    @Override
    public void createMovie() {
        System.out.println("Admin ADD Movie");
        try {
            MovieServiceImp movieService = new MovieServiceImp();
            Scanner sc1 = new Scanner(System.in);

            MovieDto movieDto = new MovieDto();

            System.out.println("Enter Movie Title");
            String title = sc1.next();
            movieDto.setTitle(title);


            System.out.println("Enter Certificate Type ");
            String certification = sc1.next();
            movieDto.setCertification(CertificateType.valueOf(certification));

            System.out.println("Enter Language");
            String language = sc1.next();
            movieDto.setLanguage(language);

            System.out.println("Enter duration");
            Integer duration = sc1.nextInt();
            movieDto.setDuration(duration);

            //default AVAILABLE on first time adding movie
            movieDto.setStatus(MovieStatus.AVAILABLE);
            movieDto.setCreatedBy(301L);

            System.out.println();
            System.out.println("=========Verify movie details==========");
            System.out.println(movieDto);
            System.out.println("=========Verify movie details==========");
            System.out.println();

            //movieService.addMovie(movieDto);

            System.out.println("✅Movie Created Successfully");
        }
        catch (Exception ex) {
            System.err.println("❌ ERROR!! While Creating Movie");
            ex.printStackTrace();
        }
    }
}
