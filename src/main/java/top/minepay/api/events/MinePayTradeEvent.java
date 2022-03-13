package top.minepay.api.events;

import lombok.Getter;
import top.minepay.bean.TradeInfo;

/**
 * 交易相关事件
 *
 * @author Peter1303
 */
public class MinePayTradeEvent extends MinePayEvent {
    @Getter
    private final TradeInfo tradeInfo;

    public MinePayTradeEvent(TradeInfo tradeInfo) {
        this.tradeInfo = tradeInfo;
    }
}
