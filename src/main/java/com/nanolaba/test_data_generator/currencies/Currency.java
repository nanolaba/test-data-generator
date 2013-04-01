package com.nanolaba.test_data_generator.currencies;

import java.io.Serializable;

public class Currency implements Serializable {

    private static final long serialVersionUID = 4635713753990768442L;

    private String name;
    private String sign;
    private String isoName;
    private String isoCode;
    private String isoNumber;

    public Currency() {/**/}

    public Currency(String name, String sign, String isoName, String isoCode, String isoNumber) {
        this.name = name;
        this.sign = sign;
        this.isoName = isoName;
        this.isoCode = isoCode;
        this.isoNumber = isoNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getIsoName() {
        return isoName;
    }

    public void setIsoName(String isoName) {
        this.isoName = isoName;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getIsoNumber() {
        return isoNumber;
    }

    public void setIsoNumber(String isoNumber) {
        this.isoNumber = isoNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Currency currency = (Currency) o;

        if (isoCode != null ? !isoCode.equals(currency.isoCode) : currency.isoCode != null) return false;
        if (isoName != null ? !isoName.equals(currency.isoName) : currency.isoName != null) return false;
        if (isoNumber != null ? !isoNumber.equals(currency.isoNumber) : currency.isoNumber != null) return false;
        if (name != null ? !name.equals(currency.name) : currency.name != null) return false;
        if (sign != null ? !sign.equals(currency.sign) : currency.sign != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (sign != null ? sign.hashCode() : 0);
        result = 31 * result + (isoName != null ? isoName.hashCode() : 0);
        result = 31 * result + (isoCode != null ? isoCode.hashCode() : 0);
        result = 31 * result + (isoNumber != null ? isoNumber.hashCode() : 0);
        return result;
    }
}
