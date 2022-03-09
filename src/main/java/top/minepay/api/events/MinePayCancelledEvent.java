package top.minepay.api.events;

import top.minepay.bean.TradeInfo;

/**
 * 取消订单
 *
 * @author Peter1303
 */
public interface MinePayCancelledEvent {
    /**
     * 取消订单
     *
     * @param tradeInfo 交易信息
     */
    void cancelled(TradeInfo tradeInfo);
}
