package top.minepay.api.events;

import top.minepay.bean.TradeInfo;

/**
 * δΊ€ζζε
 *
 * @author Peter1303
 */
public final class MinePaySuccessEvent extends MinePayTradeEvent {
    public MinePaySuccessEvent(TradeInfo info) {
        super(info);
    }
}
