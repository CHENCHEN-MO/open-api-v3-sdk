package com.okcoin.commons.okex.open.api.service.account;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.okcoin.commons.okex.open.api.bean.account.param.Transfer;
import com.okcoin.commons.okex.open.api.bean.account.param.Withdraw;
import com.okcoin.commons.okex.open.api.bean.account.result.Currency;
import com.okcoin.commons.okex.open.api.bean.account.result.Ledger;
import com.okcoin.commons.okex.open.api.bean.account.result.Wallet;
import com.okcoin.commons.okex.open.api.bean.account.result.WithdrawFee;

import java.math.BigDecimal;
import java.util.List;


public interface AccountAPIService {

    JSONObject transfer(Transfer transfer);

    //提币
    JSONObject withdraw(Withdraw withdraw);

    //获取平台所有币种列表。并非所有币种都可被用于交易。
    //在ISO 4217标准中未被定义的币种代码可能使用的是自定义代码。
    List<Currency> getCurrencies();

    /**
     * @Author: chenchen
     * @Description: 查询资金账户账单流水，可查询最近三个月的数据。
     * @param type 填写相应数字：1:充值2:提现 13:撤销提现18:转入合约账户19:合约账户转出20:转入子账户
     *             21:子账户转出28:领取29:转入指数交易区30:指数交易区转出 31:转入点对点账户32:点对点账户转出
     *             33:转入币币杠杆账户 34:币币杠杆账户转出 37:转入币币账户 38:币币账户转出
     * @param currency 币种，如btc ，不填时返回所有的账单流水
     * @param before 请求此id之前(更旧的数据)的分页内容，传的值为对应接口的order_id、ledger_id或trade_id等；
     * @param after 请求此id之后(更新的数据)的分页内容，传的值为对应接口的order_id、ledger_id或trade_id等；
     * @param limit 分页返回的结果集数量，最大为100，不填默认返回100条
     * @return: java.util.List<com.okcoin.commons.okex.open.api.bean.account.result.Ledger>
     * @exception:
     * @Date: 下午11:31 19/6/6
     */
    List<Ledger> getLedger(Integer type, String currency, Integer before, Integer after, int limit);

    List<Wallet> getWallet();

    List<Wallet> getWallet(String currency);

    //获取各个币种的充值地址，包括曾使用过的老地址。
    JSONArray getDepositAddress(String currency);

    //查询提现到数字货币地址时，建议网络手续费信息。手续费越高，网络确认越快。
    List<WithdrawFee> getWithdrawFee(String currency);

    JSONArray getOnHold(String currency);

    JSONObject lock(String currency, BigDecimal amount);

    JSONObject unlock(String currency, BigDecimal amount);

    JSONArray getDepositHistory();

    JSONArray getDepositHistory(String currency);

}
