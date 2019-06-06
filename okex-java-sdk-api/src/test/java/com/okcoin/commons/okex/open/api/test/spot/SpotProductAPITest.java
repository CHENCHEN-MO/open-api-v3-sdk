package com.okcoin.commons.okex.open.api.test.spot;

import com.okcoin.commons.okex.open.api.bean.spot.result.*;
import com.okcoin.commons.okex.open.api.service.spot.SpotProductAPIService;
import com.okcoin.commons.okex.open.api.service.spot.impl.SpotProductAPIServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.List;

public class SpotProductAPITest extends SpotAPIBaseTests {

    private static final Logger LOG = LoggerFactory.getLogger(SpotProductAPITest.class);

    private SpotProductAPIService spotProductAPIService;

    @Before
    public void before() {
        this.config = this.config();
        this.spotProductAPIService = new SpotProductAPIServiceImpl(this.config);
    }

    /**
     * 获取交易币对的列表，查询各币对的交易限制和价格步长等信息。
     */
    @Test
    public void getProducts() {
        final List<Product> products = this.spotProductAPIService.getProducts();
        this.toResultString(SpotProductAPITest.LOG, "products", products);
    }

    /**
     * 获取币对的深度列表。这个请求不支持分页，一个请求返回整个深度列表。
     */
    @Test
    public void bookProductsByProductId() {
        for (int i = 0; i < 1; i++) {
            final Book book = this.spotProductAPIService.bookProductsByProductId("BTC-usdt", "100", new BigDecimal(0.01));
            this.toResultString(SpotProductAPITest.LOG, "book", book);
            System.out.println("==========i=" + i);
            try {
                Thread.sleep(400);
            } catch (final InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 全部ticker数据
     */
    @Test
    public void getTickers() {
        final List<Ticker> tickers = this.spotProductAPIService.getTickers();
        this.toResultString(SpotProductAPITest.LOG, "tickers", tickers);

    }

    /**
     * 单个币对ticker数据
     */
    @Test
    public void getTickerByProductId() {
        final Ticker ticker = this.spotProductAPIService.getTickerByProductId("btc-USDt");
        this.toResultString(SpotProductAPITest.LOG, "ticker", ticker);
    }

    /**
     * 成交数据
     */
    @Test
    public void getTrades() {
        final List<Trade> trades = this.spotProductAPIService.getTrades("eos-USDt", null, null, "2");
        this.toResultString(SpotProductAPITest.LOG, "trades", trades);
    }

    /**
     * Kline数据
     */
    @Test
    public void getCandles() {
        final List<KlineDto> klines = this.spotProductAPIService.getCandles("BTC-usdt", "86400", "2019-05-12T02:07:30.523", "2019-05-13T02:07:30.523");
        this.toResultString(SpotProductAPITest.LOG, "klines", klines);
    }

}
