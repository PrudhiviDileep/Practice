/*    */ package com.org.telugucineandtvoutdoorunittechniciansunion.controller;
/*    */ 
/*    */ import com.org.telugucineandtvoutdoorunittechniciansunion.init.ApplicationUtilities;
/*    */ import com.org.telugucineandtvoutdoorunittechniciansunion.service.MiscellaneousService;
/*    */ import com.org.telugucineandtvoutdoorunittechniciansunion.service.SearchService;
/*    */ import com.org.telugucineandtvoutdoorunittechniciansunion.utils.Utils;
/*    */ import java.util.Map;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import org.json.simple.JSONObject;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Controller;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.RequestMethod;
/*    */ import org.springframework.web.bind.annotation.ResponseBody;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Controller
/*    */ public class SearchController
/*    */ {
/*    */   @Autowired
/*    */   public SearchService searchService;
/*    */   @Autowired
/*    */   public MiscellaneousService miscellaneousService;
/* 26 */   Utils utils = new Utils();
/*    */ 
/*    */ 
/*    */   
/*    */   @RequestMapping(value = {"/search"}, method = {RequestMethod.GET})
/*    */   public String search(HttpServletRequest request, Map<String, Object> model) {
/* 32 */     model.put("DEPARTMENTS", this.utils.getDepartmentsAsHTMLSelect(this.miscellaneousService.getDepartments()));
/*    */     
/* 34 */     return this.searchService.search(request, model);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RequestMapping(value = {"/getCommonSearchResults"}, method = {RequestMethod.POST})
/*    */   @ResponseBody
/*    */   public String getCommonSearchResults(HttpServletRequest request, Map<String, Object> model) {
/* 43 */     JSONObject resultObj = null;
/* 44 */     int cardNumber = 0;
/*    */ 
/*    */     
/*    */     try {
/* 48 */       String cardNo = request.getParameter("cardNo");
/* 49 */       String deptId = request.getParameter("deptId");
/*    */ 
/*    */       
/* 52 */       if (cardNo == null || "".equals(cardNo)) {
/*    */         
/* 54 */         resultObj = new JSONObject();
/* 55 */         resultObj.put("FINAL_RESULT_CODE", "200");
/* 56 */         resultObj.put("FINAL_RESULT", "Card Number should not be empty! ");
/*    */       }
/* 58 */       else if (deptId == null || "".equals(deptId)) {
/*    */         
/* 60 */         resultObj = new JSONObject();
/* 61 */         resultObj.put("FINAL_RESULT_CODE", "200");
/* 62 */         resultObj.put("FINAL_RESULT", "Card Number should not be empty! ");
/*    */       } else {
/*    */ 
/*    */         
/*    */         try {
/* 67 */           cardNumber = Integer.parseInt(cardNo);
/* 68 */           resultObj = new JSONObject();
/* 69 */           resultObj.put("FINAL_RESULT_CODE", "400");
/* 70 */           resultObj.put("FINAL_RESULT", this.searchService.getCommonSearchResults(request));
/*    */         
/*    */         }
/* 73 */         catch (NumberFormatException nfe) {
/*    */           
/* 75 */           resultObj = new JSONObject();
/* 76 */           resultObj.put("FINAL_RESULT_CODE", "300");
/* 77 */           resultObj.put("FINAL_RESULT", "Card Number should Numeric! ");
/* 78 */           ApplicationUtilities.error(getClass(), nfe, "getCommonSearchResults");
/* 79 */         } catch (Exception e) {
/*    */ 
/*    */           
/* 82 */           resultObj = new JSONObject();
/* 83 */           resultObj.put("FINAL_RESULT_CODE", "300");
/* 84 */           resultObj.put("FINAL_RESULT", e.getMessage());
/* 85 */           ApplicationUtilities.error(getClass(), e, "getCommonSearchResults");
/*    */         }
/*    */       
/*    */       }
/*    */     
/* 90 */     } catch (Exception e) {
/*    */       
/* 92 */       ApplicationUtilities.error(getClass(), e, "getCommonSearchResults");
/* 93 */       resultObj = new JSONObject();
/* 94 */       resultObj.put("FINAL_RESULT_CODE", "300");
/* 95 */       resultObj.put("FINAL_RESULT", e.getMessage());
/*    */     } 
/*    */     
/* 98 */     return resultObj.toJSONString();
/*    */   }
/*    */ }


/* Location:              D:\Dileep\TechniciansUnion\classes\!\com\org\telugucineandtvoutdoorunittechniciansunion\controller\SearchController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */