/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.tempaverage;
/**
 *
 * @author Noah
 */
import java.util.*;
public class avgClass {

public static void main(String[] args){
    int []  temps = {12,24,56,9,-4,-8,-55,101,22,-4,33,13,0,-40};
    System.out.println("Temperature average is "+calcAvg(temps));
}

public static int calcAvg (int [] temps){
        int avg = 0;
        int incorrectCount = 0;
        for (int i=0;i<temps.length;i++) {
        	if (temps[i] >50 || temps[i]<-50) {
        		incorrectCount++;
        		continue;
        	}
        	else
        		avg += temps[i];	
        }
        avg = avg/(temps.length - incorrectCount);
		return avg;    
}
}
