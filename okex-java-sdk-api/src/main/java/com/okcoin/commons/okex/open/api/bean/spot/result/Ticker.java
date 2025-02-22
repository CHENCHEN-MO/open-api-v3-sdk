package com.okcoin.commons.okex.open.api.bean.spot.result;

public class Ticker {

    //币对名称
    private String product_id;
    //最新成交价
    private String last;
    //卖一价
    private String best_ask;
    //买一价
    private String best_bid;
    //24小时开盘价
    private String open_24h;
    //24小时最高价
    private String high_24h;
    //24小时最低价
    private String low_24h;
    //24小时成交量，按交易货币统计
    private String base_volume_24h;
    //24小时成交量，按计价货币统计
    private String quote_volume_24h;
    //系统时间戳
    private String timestamp;
    private String bid;
    private String ask;
    private String instrument_id;

    public String getInstrument_id() {
        return this.instrument_id;
    }

    public void setInstrument_id(final String instrument_id) {
        this.instrument_id = instrument_id;
    }

    public String getProduct_id() {
        return this.product_id;
    }

    public void setProduct_id(final String product_id) {
        this.product_id = product_id;
    }

    public String getLast() {
        return this.last;
    }

    public void setLast(final String last) {
        this.last = last;
    }

    public String getBid() {
        return this.bid;
    }

    public void setBid(final String bid) {
        this.bid = bid;
    }

    public String getAsk() {
        return this.ask;
    }

    public void setAsk(final String ask) {
        this.ask = ask;
    }

    public String getOpen_24h() {
        return this.open_24h;
    }

    public void setOpen_24h(final String open_24h) {
        this.open_24h = open_24h;
    }

    public String getHigh_24h() {
        return this.high_24h;
    }

    public void setHigh_24h(final String high_24h) {
        this.high_24h = high_24h;
    }

    public String getLow_24h() {
        return this.low_24h;
    }

    public void setLow_24h(final String low_24h) {
        this.low_24h = low_24h;
    }

    public String getBase_volume_24h() {
        return this.base_volume_24h;
    }

    public void setBase_volume_24h(final String base_volume_24h) {
        this.base_volume_24h = base_volume_24h;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(final String timestamp) {
        this.timestamp = timestamp;
    }

    public String getQuote_volume_24h() {
        return this.quote_volume_24h;
    }

    public void setQuote_volume_24h(final String quote_volume_24h) {
        this.quote_volume_24h = quote_volume_24h;
    }

    public String getBest_ask() {
        return this.best_ask;
    }

    public void setBest_ask(final String best_ask) {
        this.best_ask = best_ask;
    }

    public String getBest_bid() {
        return this.best_bid;
    }

    public void setBest_bid(final String best_bid) {
        this.best_bid = best_bid;
    }
}
