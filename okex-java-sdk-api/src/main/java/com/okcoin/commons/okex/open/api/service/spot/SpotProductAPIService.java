package com.okcoin.commons.okex.open.api.service.spot;

import com.okcoin.commons.okex.open.api.bean.spot.result.*;

import java.math.BigDecimal;
import java.util.List;


//公共服务接口
public interface SpotProductAPIService {

    /**
     * 获取平台全部币对的最新成交价、买一价、卖一价和24小时交易量的快照信息
     *
     * @param product
     * @return
     */
    Ticker getTickerByProductId(String product);

    /**
     * 获取平台全部币对的最新成交价、买一价、卖一价和24小时交易量的快照信息。
     *
     * @return
     */
    List<Ticker> getTickers();

    /** 获取币对的深度列表。这个请求不支持分页，一个请求返回整个深度列表。
     * @param product 币种对
     * @param size 返回深度档位数量，最多返回200
     * @param depth 按价格合并深度，例如：0.1,0.001
     * @return
     */
    Book bookProductsByProductId(String product, String size, BigDecimal depth);

    /**
     * 获取交易币对的列表，查询各币对的交易限制和价格步长等信息。
     *
     * @return
     */
    List<Product> getProducts();

    /**
     * 获取成交数据
       本接口能查询最近60条数据。这个请求支持分页，并且按时间倒序排序和存储，最新的排在最前面
     *
     * @param product 币对名称
     * @param from 请求此id之前(更旧的数据)的分页内容，传的值为对应接口的order_id、ledger_id或trade_id等；
     * @param to 请求此id之后(更新的数据)的分页内容，传的值为对应接口的order_id、ledger_id或trade_id等；
     * @param limit 分页返回的结果集数量，最大为100，不填默认返回100条
     * @return
     */
    List<Trade> getTrades(String product, String from, String to, String limit);

    /**
     * 获取币对的K线数据。K线数据按请求的粒度分组返回，k线数据最多可获取最近2000条。
     * @param product 币对
     * @param granularity 以秒来计量的时间粒度,必须是
     * [60 180 300 900 1800 3600 7200 14400 21600 43200 86400 604800]中的任一值。这些值分别对应的是
     * [1min 3min 5min 15min 30min 1hour 2hour 4hour 6hour 12hour 1day 1week]的时间段。
     * @param start 起始时间(ISO 8601标准)
     * @param end 截止时间(ISO 8601标准)
     * @return
     */
    List<KlineDto> getCandles(String product, String granularity, String start, String end);

    List<String[]> getCandles_1(String product, String granularity, String start, String end);

}
