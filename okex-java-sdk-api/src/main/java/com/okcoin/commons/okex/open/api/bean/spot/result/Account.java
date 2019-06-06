package com.okcoin.commons.okex.open.api.bean.spot.result;

public class Account {

    //账户ID
    private String id;
    //币种
    private String currency;
    //余额
    private String balance;
    //可用于交易的数量
    private String available;
    //冻结(不可用)
    private String hold;

    public String getHold() {
        return this.hold;
    }

    public void setHold(final String hold) {
        this.hold = hold;
    }

    public String getId() {
        return this.id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(final String currency) {
        this.currency = currency;
    }

    public String getBalance() {
        return this.balance;
    }

    public void setBalance(final String balance) {
        this.balance = balance;
    }

    public String getAvailable() {
        return this.available;
    }

    public void setAvailable(final String available) {
        this.available = available;
    }

}
