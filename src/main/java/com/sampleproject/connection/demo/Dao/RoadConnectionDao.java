package com.sampleproject.connection.demo.Dao;

import com.sampleproject.connection.demo.model.Travel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class RoadConnectionDao {
    private static List<Travel> travles = new ArrayList();
    private static List<String> arrayList = new ArrayList<>();
    static Logger LOGGER = LoggerFactory.getLogger("RoadConnectionDao");
    public static final String CITY = "city.txt";
    public static final String DELIMITER = "\r\n";

   //Before I used static arraylist object

    /*static {
        travles.add(new Travel("Boston","NewYork"));
        travles.add(new Travel("Boston","New york"));
        travles.add(new Travel("Philadelphia","newark"));
        travles.add(new Travel("Newark","Boston"));
        travles.add(new Travel("Trenton","Albany"));
    }*/


    /*
    *   Load from flat file from classpath and convert to arraylist
    *   from Arraylist create a travel model*/
    static {
        try {
            Resource resource = new ClassPathResource(CITY);
            Scanner scan = new Scanner(resource.getInputStream());
            scan = scan.useDelimiter(DELIMITER);
            String str;

            while (scan.hasNext()) {

                str = scan.next();
                LOGGER.info("Location : "+str);
                arrayList = Stream.of(str.split(",", -1))
                        .collect(Collectors.toList());

               travles.add(new Travel(arrayList.get(0),arrayList.get(1)));
            }

        } catch (IOException e) {
            LOGGER.error("IOException", e);
        }


    }

    public RoadConnectionDao() {
    }

    public String validateConnection(String origin, String destination)
     {
          for(Travel travel : travles){
              if(travel.getOrigin().equalsIgnoreCase(origin) &&
                      travel.getDesination().equalsIgnoreCase(destination)) {
                  return "<html><body><h1>yes</h1></body></html>";
              }

              }
         return "<html><body><h1>No</h1></body></html>";
     }
}

