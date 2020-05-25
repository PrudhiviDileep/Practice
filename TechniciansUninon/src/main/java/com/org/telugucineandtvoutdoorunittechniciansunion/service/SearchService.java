/*    */ package com.org.telugucineandtvoutdoorunittechniciansunion.service;
/*    */ 
/*    */ import com.org.telugucineandtvoutdoorunittechniciansunion.DAO.SearchDAO;
/*    */ import com.org.telugucineandtvoutdoorunittechniciansunion.pojo.Registration;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import org.json.simple.JSONObject;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class SearchService
/*    */ {
/*    */   @Autowired
/*    */   public SearchDAO searchDAO;
/*    */   
/*    */   public String search(HttpServletRequest request, Map<String, Object> model) {
/* 22 */     return this.searchDAO.search(request, model);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public JSONObject getCommonSearchResults(HttpServletRequest request) {
/* 35 */     return this.searchDAO.getCommonSearchResults(request);
/*    */   }
/*    */   
/*    */   public String searchDetails(String deptId) {
/* 39 */     String result = "";
/* 40 */     List<Registration> list = this.searchDAO.searchDetails(deptId);
/*    */     
/* 42 */     if (list != null && !list.isEmpty() && list.size() > 0) {
/*    */       
/* 44 */       for (int i = 1; i <= list.size(); i++) {
/* 45 */         Registration registration = list.get(i - 1);
/*    */         
/* 47 */         result = String.valueOf(String.valueOf(result)) + "<tr><td>" + i + "</td><td>" + registration.getRegistrationPK().getCardNo() + "</td><td>" + 
/* 48 */           registration.getFirstName() + "</td><td>" + registration.getPhoneNo() + "</td><td>" + 
/* 49 */           registration.getPerminentAddress() + "</td></tr>";
/*    */       }
/*    */     
/*    */     }
/*    */     else {
/*    */       
/* 55 */       result = String.valueOf(String.valueOf(result)) + "<tr><td colspan='5'>No Data Found</td></tr>";
/*    */     } 
/*    */     
/* 58 */     return result;
/*    */   }
/*    */ }


/* Location:              D:\Dileep\TechniciansUnion\classes\!\com\org\telugucineandtvoutdoorunittechniciansunion\service\SearchService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */