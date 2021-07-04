package com.company.devices;

public class URL {

    String appName;
    String appVersion;
    String serverIP;

    public String toString(){
        return appName+" "+appVersion+" "+serverIP;
    }
}
