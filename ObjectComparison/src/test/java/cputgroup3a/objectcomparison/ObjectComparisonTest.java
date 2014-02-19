/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.objectcomparison;

import cputgroup3a.objectcomparison.configuration.AppConfig;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import cputgroup3a.objectcomparison.service.ObjectComparison;
import cputgroup3a.objectcomparison.service.Impl.ObjectComparisonImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;

/**
 *
 * @author kurvin
 */
public class ObjectComparisonTest {
    
    public ObjectComparisonTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    public static ObjectComparison obj;
    
    @Test
    public static void testCheckObject(){
       Assert.assertEquals(obj.checkObject(obj), obj);
    }
    
    @Test
    public static void testAssertSame(){
        Assert.assertSame(obj.checkObject(obj), obj);
    }
    
    @Test
    public static void testAssertNotSame(){
        Assert.assertSame(obj.checkObject(obj), obj);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        obj = (ObjectComparison) ctx.getBean("Obj");
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
