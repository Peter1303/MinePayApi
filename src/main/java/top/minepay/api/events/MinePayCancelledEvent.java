package top.minepay.api.events;

import top.minepay.bean.TradeInfo;

/**
 * 取消订单
 *
 * @author Peter1303
 */
public final class MinePayCancelledEvent extends MinePayTradeEvent {
    private boolean cancelled = false;

    public MinePayCancelledEvent(TradeInfo info) {
        super(info);
    }

    /**
     * 取消订单
     *
     * @param cancelled 取消
     */
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    /**
     * @return 取消
     */
    public boolean isCancelled() {
        return cancelled;
    }
}
