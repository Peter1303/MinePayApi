package top.minepay.api.events;

import top.minepay.bean.TradeInfo;

/**
 * 交易成功
 *
 * @author Peter1303
 */
public final class MinePaySuccessEvent extends MinePayTradeEvent {
    public MinePaySuccessEvent(TradeInfo info) {
        super(info);
    }
}
