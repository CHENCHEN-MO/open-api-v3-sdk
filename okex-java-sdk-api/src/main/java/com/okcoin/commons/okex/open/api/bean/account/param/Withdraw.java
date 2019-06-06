package com.okcoin.commons.okex.open.api.bean.account.param;

import java.math.BigDecimal;

//提币
public class Withdraw {

    //数量
    private BigDecimal amount;

    //币种
    private String currency;

    //提币到(2:OKCoin国际 3:OKEx 4:数字货币地址)
    private Integer destination;

    //认证过的数字货币地址、邮箱或手机号。某些数字货币地址格式为:地址+标签，
    //例："ARDOR-7JF3-8F2E-QUWZ-CAN7F：123456"
    private String to_address;

    //交易密码
    private String trade_pwd;

    //网络手续费≥0.提币到OKCoin国际或OKEx免手续费，请设置为0.
    //提币到数字货币地址所需网络手续费可通过提币手续费接口查询
    private BigDecimal fee;

    private String tag;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getTrade_pwd() {
        return trade_pwd;
    }

    public void setTrade_pwd(String trade_pwd) {
        this.trade_pwd = trade_pwd;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Integer getDestination() {
        return destination;
    }

    public void setDestination(Integer destination) {
        this.destination = destination;
    }

    public String getTo_address() {
        return to_address;
    }

    public void setTo_address(String to_address) {
        this.to_address = to_address;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
