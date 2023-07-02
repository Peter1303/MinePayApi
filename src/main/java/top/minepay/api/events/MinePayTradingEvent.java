package top.minepay.api.events;

import top.minepay.bean.TradeInfo;

/**
 * 交易事件
 *
 * @author Peter1303
 */
public final class MinePayTradingEvent extends MinePayTradeEvent {
    private boolean handled = true;

    public MinePayTradingEvent(TradeInfo info) {
        super(info);
    }

    /**
     * 是否由 MinePay 接管充值处理
     *
     * @param handled 是否
     */
    public void setHandled(boolean handled) {
        this.handled = handled;
    }

    /**
     * @return 是否接管
     */
    public boolean isHandled() {
        return handled;
    }
}
