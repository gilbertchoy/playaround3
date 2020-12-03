package com.bort.playaround3;


import android.util.Log;

public class Date {
    public long milliseconds;
    public int month;

    public Date (long m){
        milliseconds = m;
        //convert date to month
        long days = m/(24*60*60*1000);

        int months[] = new int[12];
        months[0] = 31;
        months[1] = 28;
        months[2] = 31;
        months[3] = 30;
        months[4] = 31;
        months[5] = 30;
        months[6] = 31;
        months[7] = 31;
        months[8] = 30;
        months[9] = 31;
        months[10] = 30;
        months[11] = 31;

        int mc = 0;
        Log.d("test", "days:" + days);

        while(days > 28){
            if(mc > 11){
                mc = 0;
            }

            Log.d("testt", "mc:" + mc);

            if(days > months[mc]){
                days = days - months[mc];
            }
            else{
                break;
            }
            mc++;
        }
        month = mc;
    }


    public int getMonth(){
        return month;
    }



}
