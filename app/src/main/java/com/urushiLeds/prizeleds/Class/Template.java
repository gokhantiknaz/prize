package com.urushiLeds.prizeleds.Class;

import java.io.Serializable;

public class Template  implements Cloneable, Serializable {
    public String Channel;
    public String sabahBrightness;
    public String ogleBrightness;
    public String aksamBrightness;
    public String geceBrightness;
    public float sabahHour;
    public float ogleHour;
    public float aksamHour;
    public float geceHour;
    public float sabahMin;
    public float ogleMin;
    public float aksamMin;
    public float geceMin;
    public Template() {
    }
}
