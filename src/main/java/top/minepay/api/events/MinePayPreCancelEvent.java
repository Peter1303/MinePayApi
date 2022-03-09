package top.minepay.api.events;

import top.minepay.bean.TradeInfo;

/**
 * 延迟关闭
 *
 * @author Peter1303
 */
public interface MinePayPreCancelEvent {
    /**
     * 即将取消订单
     *
     * @param tradeInfo 交易信息
     */
    void preCancel(TradeInfo tradeInfo);
}
