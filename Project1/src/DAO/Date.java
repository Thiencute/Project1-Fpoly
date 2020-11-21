/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.Date.*;
import java.sql.Date.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
/**
 *
 * @author Home
 */
public class Date {
     static final SimpleDateFormat Format_Time = new SimpleDateFormat("YYYY-MM-DD");
     
   public static java.util.Date Now(){
       try {
            return new java.util.Date(System.currentTimeMillis());
       } catch (Exception e) {
            throw new RuntimeException(e);
       }
   }
  
   public static java.sql.Date DateSql(java.util.Date date) throws ParseException{
        try {
           if(date == null){
            return new java.sql.Date(Now().getTime());
        }else{
            return new java.sql.Date(date.getTime());
        }
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
   }
   
   public static java.util.Date DateForm(java.sql.Date date){
       return new java.util.Date(date.getTime());
   }
   public static String String_DateForm(java.sql.Date date){
       DateForm(date);
       return DateForm(date).toString();
   }
   public static java.util.Date StringtoDate (String date){
       return new java.util.Date(date);
   }
   public static String DateFrom_To_String(java.util.Date date){
       return String.valueOf(date);
   }
}
