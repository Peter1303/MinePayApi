package top.minepay.bean;

import lombok.Getter;

/**
 * 交易信息
 *
 * @author Peter1303
 */
public class TradeInfo {
    @Getter
    private String order;
    @Getter
    private String playerName;
    @Getter
    private int price;
    @Getter
    private String type;
    @Getter
    private String name;
}
