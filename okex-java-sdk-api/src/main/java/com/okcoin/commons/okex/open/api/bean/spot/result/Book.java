package com.okcoin.commons.okex.open.api.bean.spot.result;

import java.util.List;

public class Book {

    //卖方深度
    private List<String[]> asks;

    //买方深度
    private List<String[]> bids;

    public List<String[]> getAsks() {
        return asks;
    }

    public void setAsks(List<String[]> asks) {
        this.asks = asks;
    }

    public List<String[]> getBids() {
        return bids;
    }

    public void setBids(List<String[]> bids) {
        this.bids = bids;
    }
}
