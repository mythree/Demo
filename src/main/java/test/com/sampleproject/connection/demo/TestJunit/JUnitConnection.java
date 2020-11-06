package test.com.sampleproject.connection.demo.TestJunit;

import com.sampleproject.connection.demo.Dao.RoadConnectionDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.Scanner;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class JUnitConnection {

    public static final String CITY = "city.txt";
    public static final String DELIMITER = "\r\n";

    /**
     * To Test the ValidateConnection Method
     *  by passing valid parameters
     *  Origin = Boston and Destination = Newark
     */

    @Test
    public void test_validConnection() {
        System.out.println("This is the testcase to test connection method");
        RoadConnectionDao roadConnectionDao = new RoadConnectionDao();
        assertEquals("<html><body><h1>yes</h1></body></html>", roadConnectionDao.validateConnection("Boston","Newark"));
    }

    /**
     * To Test the Failed condtion by passing the different cities
     *  which are not there in list of city.txt
     *  by passing valid parameters
     *  Origin = Boston and Destination = Newark
     */
    @Test
    public void test_FailConnection() {
        System.out.println("This is for Connection method Fail condition");
        RoadConnectionDao roadConnectionDao = new RoadConnectionDao();
        assertEquals("<html><body><h1>yes</h1></body></html>", roadConnectionDao.validateConnection("Bos1ton","Newark"));
    }

    /**
     * To Test the the file relative file path "static/city.txt"
     *  and  checked the IOExcepton
     */

    @Test(expected = IOException.class)
    public void test_ValidateConnectionFileThrowException() throws IOException{
        String CITY = "static/city.txt";
        Resource resource = new ClassPathResource(CITY);
            try(Scanner scan = new Scanner (resource.getInputStream())){
            assertEquals(null, scan);
            }
        }
    }

