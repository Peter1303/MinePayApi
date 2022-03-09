package top.minepay.api.events;

import top.minepay.bean.TradeInfo;

/**
 * 交易中
 *
 * @author Peter1303
 */
public interface MinePayTradingEvent {
    /**
     * 交易中呢
     *
     * @param tradeInfo 交易信息
     * @return 是否由 MinePay 接管充值处理
     */
    boolean trading(TradeInfo tradeInfo);
}
