package top.minepay.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * 交易信息
 *
 * @author Peter1303
 */
public class TradeInfo {
    @Setter
    @Getter
    private String order;
    @Setter
    @Getter
    private String playerName;
    @Setter
    @Getter
    private int price;
    @Setter
    @Getter
    private String type;
    @Setter
    @Getter
    private String name;
}
