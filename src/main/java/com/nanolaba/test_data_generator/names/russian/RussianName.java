package com.nanolaba.test_data_generator.names.russian;

import com.nanolaba.test_data_generator.names.Name;

import java.io.Serializable;

public class RussianName implements Serializable, Name {

    private static final long serialVersionUID = -3159270940787309965L;

    private String f;
    private String i;
    private String o;

    public RussianName() {
    }

    public RussianName(String f, String i, String o) {
        this.f = f;
        this.i = i;
        this.o = o;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getO() {
        return o;
    }

    public void setO(String o) {
        this.o = o;
    }

    public String getFIO() {
        return t(f, " ") + t(i, " ") + t(o, "");
    }

    public String getIOF() {
        return t(i, " ") + t(o, " ") + t(f, "");
    }

    public String getIF() {
        return t(i, " ") + t(f, "");
    }

    public String getIO() {
        return t(i, " ") + t(o, "");
    }

    public String getName() {
        return getIOF();
    }

    private static String t(String data, String postfix) {
        return data != null ? data.trim() + postfix : "";
    }
}
