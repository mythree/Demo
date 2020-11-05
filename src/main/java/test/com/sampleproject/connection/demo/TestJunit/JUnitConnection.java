package test.com.sampleproject.connection.demo.TestJunit;

import com.sampleproject.connection.demo.Dao.RoadConnectionDao;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class JUnitConnection {


    @Test
    public void test_validConnection() {
        System.out.println("This is the testcase to test connection method");
        RoadConnectionDao roadConnectionDao = new RoadConnectionDao();
        assertEquals("<html><body><h1>yes</h1></body></html>", roadConnectionDao.validateConnection("Boston","Newark"));
    }
}
