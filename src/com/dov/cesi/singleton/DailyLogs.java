package com.dov.cesi.singleton;

import java.util.Date;

public class DailyLogs {
    private String log;
    private static final DailyLogs instance = new DailyLogs();

    private DailyLogs(){}
    public static DailyLogs getInstance(){
        return instance;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }


    public void addLog(String log){
        setLog(getLog()== null?  log : getLog()+ "\n" +log);
    }
}
