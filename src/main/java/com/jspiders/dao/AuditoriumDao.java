package com.jspiders.dao;

import com.jspiders.entity.AuditoriumEntity;

public interface AuditoriumDao {
    void addAuditorium(AuditoriumEntity auditoriumEntity);
    void getAuditorium(Long audiId);
    void updateAuditorium(Long audiId);
    void deleteAuditorium(Long audiId);
}
