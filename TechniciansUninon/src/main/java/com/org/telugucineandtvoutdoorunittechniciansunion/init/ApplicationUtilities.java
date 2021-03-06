/*    */ package com.org.telugucineandtvoutdoorunittechniciansunion.init;
/*    */ 
/*    */ import java.io.File;
/*    */ import org.apache.log4j.PropertyConfigurator;
/*    */ import org.slf4j.Logger;
/*    */ import org.slf4j.LoggerFactory;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ApplicationUtilities
/*    */ {
/*    */   static {
/* 16 */     PropertyConfigurator cnf = new PropertyConfigurator();
/* 17 */     System.out.println("Current Directory = " + System.getProperty("user.dir"));
/*    */     
/* 19 */     File log4jfile = new File("./ApplicationProperties/WEB-INF/AppLoggerConfigPropertes.lcf");
/* 20 */     PropertyConfigurator.configure(log4jfile.getAbsolutePath());
/*    */   }
/*    */   
/*    */   public static void error(Class className, Exception e, String methodName) {
/* 24 */     Logger logger = LoggerFactory.getLogger(className.getClass().getName());
/* 25 */     logger.error(String.valueOf(String.valueOf(className.getName())) + " << ::: " + methodName + " ::: >>" + e.getMessage());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static void debug(Class className, String debugMessabe) {
/* 31 */     Logger logger = LoggerFactory.getLogger(className.getClass().getName());
/* 32 */     logger.debug("!!" + debugMessabe + "!!");
/*    */   }
/*    */ }


/* Location:              D:\Dileep\TechniciansUnion\classes\!\com\org\telugucineandtvoutdoorunittechniciansunion\init\ApplicationUtilities.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */