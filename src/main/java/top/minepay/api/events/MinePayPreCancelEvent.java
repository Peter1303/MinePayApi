package top.minepay.api.events;

import top.minepay.bean.TradeInfo;

/**
 * 延迟关闭
 *
 * @author Peter1303
 */
public final class MinePayPreCancelEvent extends MinePayTradeEvent {
    public MinePayPreCancelEvent(TradeInfo info) {
        super(info);
    }
}
