/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.invoicemanagement.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author bas200190
 */
@Getter
@Setter
@Builder
public class StatusCode {
    private final static int SUCCESS = 600;
    private final static int FIELD_VALIDATE = 601;
    private final static int SERVER_SEND_ERROR = 602;
    private final static int GEOFENCING = 603;
    private final static int USER_NOT_FOUND = 604;
    private final static int TOKEN_UPDATE = 605;
    private final static int TIME_OUT = 606;
    private final static int NO_DATA = 607;
    private final static int AUTHORIZE = 608;
    private final static int WRONG_END_POINT = 609;
    private final static int DUPLICATION = 610;
    private final static int SERVER_ERROR = 650;
    private final static int NO_NETWORK_CONNECTION = 651;
    
    private final static String SUCCESS_MESSAGE = "successfully";
    private final static String SERVER_ERROR_MESSAGE = "something went wrong";
    private final static String FIELD_VALIDATE_MESSAGE = "please check your input";
    private final static String NO_DATA_MESSAGE = "No data found";

    public static int getSUCCESS() {
        return SUCCESS;
    }

    public static int getFIELD_VALIDATE() {
        return FIELD_VALIDATE;
    }

    public static int getSERVER_SEND_ERROR() {
        return SERVER_SEND_ERROR;
    }

    public static int getGEOFENCING() {
        return GEOFENCING;
    }

    public static int getUSER_NOT_FOUND() {
        return USER_NOT_FOUND;
    }

    public static int getTOKEN_UPDATE() {
        return TOKEN_UPDATE;
    }

    public static int getTIME_OUT() {
        return TIME_OUT;
    }

    public static int getNO_DATA() {
        return NO_DATA;
    }

    public static int getAUTHORIZE() {
        return AUTHORIZE;
    }

    public static int getWRONG_END_POINT() {
        return WRONG_END_POINT;
    }

    public static int getDUPLICATION() {
        return DUPLICATION;
    }

    public static int getSERVER_ERROR() {
        return SERVER_ERROR;
    }

    public static int getNO_NETWORK_CONNECTION() {
        return NO_NETWORK_CONNECTION;
    }

    public static String getSUCCESS_MESSAGE() {
        return SUCCESS_MESSAGE;
    }

    public static String getSERVER_ERROR_MESSAGE() {
        return SERVER_ERROR_MESSAGE;
    }

    public static String getFIELD_VALIDATE_MESSAGE() {
        return FIELD_VALIDATE_MESSAGE;
    }

    public static String getNO_DATA_MESSAGE() {
        return NO_DATA_MESSAGE;
    }
    
    
}
