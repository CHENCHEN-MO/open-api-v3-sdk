package com.okcoin.commons.okex.open.api.bean.futures.result;

/**
 * futures contract products <br/>
 *
 * @author Tony Tian
 * @version 1.0.0
 * @date 2018/2/26 10:49
 */
public class Instruments {
    /**
     * 币对名称
     */
    private String instrument_id;
    /**
     * 交易货币币种
     */
    private String underlying_index;
    /**
     * 计价货币币种
     */
    private String quote_currency;
    /**
     * 最小交易数量
     */
    private String tick_size;
    /**
     * 交易货币数量精度t
     */
    private String contract_val;
    /**
     * 开始时间
     */
    private String listing;
    /**
     * 结束时间
     */
    private String delivery;
    /**
     * Minimum amount: cont
     */
    private String trade_increment;

    public String getInstrument_id() { return instrument_id; }

    public void setInstrument_id(String instrument_id) { this.instrument_id = instrument_id; }


    public String getQuote_currency() {
        return quote_currency;
    }

    public void setQuote_currency(String quote_currency) {
        this.quote_currency = quote_currency;
    }

    public String getTick_size() { return tick_size; }

    public void setTick_size(String tick_size) { this.tick_size = tick_size; }

    public String getContract_val() {
        return contract_val;
    }

    public void setContract_val(String contract_val) {
        this.contract_val = contract_val;
    }

    public String getListing() {
        return listing;
    }

    public void setListing(String listing) {
        this.listing = listing;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getTrade_increment() {
        return trade_increment;
    }

    public void setTrade_increment(String trade_increment) {
        this.trade_increment = trade_increment;
    }

    public String getUnderlying_index() { return underlying_index; }

    public void setUnderlying_index(String underlying_index) { this.underlying_index = underlying_index; }
}
