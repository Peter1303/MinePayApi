package top.minepay.api.events;

import top.minepay.bean.TradeInfo;

/**
 * 取消订单
 *
 * @author Peter1303
 * @date Created in 2022/3/9 14:41
 */
public interface MinePayCancelledEvent {
    /**
     * 取消订单
     *
     * @param tradeInfo 交易信息
     */
    void cancelled(TradeInfo tradeInfo);
}
