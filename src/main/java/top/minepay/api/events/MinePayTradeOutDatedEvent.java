package top.minepay.api.events;

import top.minepay.bean.TradeInfo;

/**
 * 订单过期
 *
 * @author Peter1303
 */
public final class MinePayTradeOutDatedEvent extends MinePayTradeEvent {
    public MinePayTradeOutDatedEvent(TradeInfo info) {
        super(info);
    }
}
