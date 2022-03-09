package top.minepay.api.events;

import top.minepay.bean.TradeInfo;

/**
 * 订单过期
 *
 * @author Peter1303
 * @date Created in 2022/3/9 14:52
 */
public interface MinePayTradeOutDatedEvent {
    void outdated(TradeInfo tradeInfo);
}
