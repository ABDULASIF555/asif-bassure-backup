/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.in.rr.app.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author VaishnaviR
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class AppConfig {
    
   private String Success;
   private String  FieldValidate;
   private String ServerSendError;
   private String GeoFencing;
   private String UserNotFound;
   private String TokenUpdate;
   private String TimeOut;
   private String NoData;
   private String Authorize;
   private String WrongEndPoint;
   private String Duplication;
   private String ServerError;
   private String NoNetConn;

   

   
}
