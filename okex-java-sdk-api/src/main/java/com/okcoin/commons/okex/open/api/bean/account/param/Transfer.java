package com.okcoin.commons.okex.open.api.bean.account.param;

import java.math.BigDecimal;

public class Transfer {

    //币种
    private String currency;

    //划转数量
    private BigDecimal amount;

    //转出账户(0:子账户 1:币币 3:合约 4:C2C 5:币币杠杆 6:资金账户 8:余币宝 9 永续合约)
    private Integer from;

    //转入账户(0:子账户 1:币币 3:合约 4:C2C 5:币币杠杆 6:资金账户 8:余币宝 9 永续合约)
    private Integer to;

    //子账号登录名，from或to指定为0时，sub_account为必填项
    private String sub_account;

    //杠杆币对，如：eos-usdt，仅限已开通杠杆的币对
    private Integer instrument_id;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }


    public String getSub_account() {
        return sub_account;
    }

    public void setSub_account(String sub_account) {
        this.sub_account = sub_account;
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getTo() {
        return to;
    }

    public void setTo(Integer to) {
        this.to = to;
    }

    public Integer getInstrument_id() {
        return instrument_id;
    }

    public void setInstrument_id(Integer instrument_id) {
        this.instrument_id = instrument_id;
    }
}
