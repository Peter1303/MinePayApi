package top.minepay.api.events;

import top.minepay.bean.TradeInfo;

/**
 * 订单过期
 *
 * @author Peter1303
 */
public interface MinePayTradeOutDatedEvent {
    /**
     * 订单过期
     *
     * @param tradeInfo 交易信息
     */
    void outdated(TradeInfo tradeInfo);
}
