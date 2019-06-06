package com.okcoin.commons.okex.open.api.bean.spot.result;

//币对信息
public class Product {

    //币对名称
    private String instrument_id;

    //计价货币币种
    private String base_increment;

    //最小交易数量
    private String min_size;

    //计价货币币种
    private String quote_currency;

    //交易货币数量精度
    private String size_increment;

    //交易价格精度
    private String tick_size;

    private String product_id;
    private String base_currency;

    private String base_min_size;

    private String quote_increment;

    public String getInstrument_id() {
        return this.instrument_id;
    }

    public void setInstrument_id(final String instrument_id) {
        this.instrument_id = instrument_id;
    }

    public String getMin_size() {
        return this.min_size;
    }

    public void setMin_size(final String min_size) {
        this.min_size = min_size;
    }

    public String getSize_increment() {
        return this.size_increment;
    }

    public void setSize_increment(final String size_increment) {
        this.size_increment = size_increment;
    }

    public String getTick_size() {
        return this.tick_size;
    }

    public void setTick_size(final String tick_size) {
        this.tick_size = tick_size;
    }

    public String getBase_increment() {
        return this.base_increment;
    }

    public void setBase_increment(final String base_increment) {
        this.base_increment = base_increment;
    }

    public String getProduct_id() {
        return this.product_id;
    }

    public void setProduct_id(final String product_id) {
        this.product_id = product_id;
    }

    public String getBase_currency() {
        return this.base_currency;
    }

    public void setBase_currency(final String base_currency) {
        this.base_currency = base_currency;
    }

    public String getQuote_currency() {
        return this.quote_currency;
    }

    public void setQuote_currency(final String quote_currency) {
        this.quote_currency = quote_currency;
    }

    public String getBase_min_size() {
        return this.base_min_size;
    }

    public void setBase_min_size(final String base_min_size) {
        this.base_min_size = base_min_size;
    }



    public String getQuote_increment() {
        return this.quote_increment;
    }

    public void setQuote_increment(final String quote_increment) {
        this.quote_increment = quote_increment;
    }
}
