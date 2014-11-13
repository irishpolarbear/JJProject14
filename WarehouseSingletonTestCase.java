/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playon;

import org.apache.log4j.Logger;
import junit.framework.Assert;
import junit.framework.TestCase;


/**
 *
 * @author ian
 */
public class WarehouseSingletonTestCase extends TestCase {
    
    private WarehouseSingleton WS1 = null, WS2 = null;
    private static Logger logger = Logger.getRootLogger();
    
    public WarehouseSingletonTestCase(String name){
        super(name);
    }
    
    public void setUp(){
        logger.info("getting singleton...");
        WS1 = WarehouseSingleton.initialize();
        logger.info("...got singleton: " + WS1);
        logger.info("getting singleton...");
        WS2 = WarehouseSingleton.initialize();
        logger.info("...got singleton:" + WS2);        
    }
    
    public void testUnique() {
        logger.info("checking singletons for equality");
        Assert.assertEquals(true, WS1 == WS2);
    }
}
