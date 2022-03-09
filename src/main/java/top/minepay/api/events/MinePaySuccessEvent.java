package top.minepay.api.events;

import top.minepay.bean.TradeInfo;

/**
 * 交易成功
 *
 * @author Peter1303
 */
public interface MinePaySuccessEvent {
    /**
     * 交易成功
     *
     * @param tradeInfo 交易信息
     */
    void success(TradeInfo tradeInfo);
}
