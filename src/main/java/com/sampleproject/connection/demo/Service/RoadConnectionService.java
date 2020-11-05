package com.sampleproject.connection.demo.Service;

import com.sampleproject.connection.demo.Dao.RoadConnectionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoadConnectionService {

    @Autowired
    RoadConnectionDao roadConnectionDao;


    public String validatePath(String origin, String destination){

        return roadConnectionDao.validateConnection(origin,destination);

    }
}
