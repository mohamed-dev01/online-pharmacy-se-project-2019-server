
package testing;

import model.database.database;
import com.mongodb.DB;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import model.PharmacyManager;


public class JUnitTesting {
    
    database j = new database();
    //PharmacyManager manager = new PharmacyManager();
    
    @BeforeClass
    public void testDatabaseConection(){
        j.close();
    }

    
//    @AfterClass
//    public void testDatabaseCloseConection(){
//
//        assertNull(j.);
//    }
    

}
