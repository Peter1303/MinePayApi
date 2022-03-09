package top.minepay.bean;

import lombok.Getter;

/**
 * 交易信息
 *
 * @author Peter1303
 * @date Created in 2022/3/8 20:57
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
