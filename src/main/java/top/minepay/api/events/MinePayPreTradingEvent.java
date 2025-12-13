package top.minepay.api.events;

import top.minepay.bean.TradeInfo;

/**
 * 交易事件
 *
 * @author Ranica
 * Created in 2025/12/13 01:13
 */
public final class MinePayPreTradingEvent extends MinePayTradeEvent {
    private boolean cancelled = false;

    public MinePayPreTradingEvent(TradeInfo info) {
        super(info);
    }

    /**
     * 是否取消下单
     *
     * @param cancelled 是否
     */
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    /**
     * @return 是否取消
     */
    public boolean isCancelled() {
        return cancelled;
    }
}
