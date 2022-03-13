package top.minepay.bean;

import lombok.Getter;
import lombok.Setter;
import top.minepay.enums.PaymentType;
import top.minepay.enums.TradeType;

/**
 * 交易信息
 *
 * @author Peter1303
 */
public class TradeInfo {
    /**
     * 订单号
     */
    @Setter
    @Getter
    private String order;
    /**
     * 玩家 id
     */
    @Setter
    @Getter
    private String playerName;
    /**
     * 价格
     */
    @Setter
    @Getter
    private int price;
    /**
     * 点券数量
     */
    @Setter
    @Getter
    private int count;
    /**
     * 支付类型
     * @see PaymentType
     */
    @Setter
    @Getter
    private PaymentType type;
    /**
     * 订单类型
     * <p>点券</p>
     * <p>礼包</p>
     * @see TradeType
     */
    @Setter
    @Getter
    private TradeType tradeType;
    /**
     * 订单名称
     */
    @Setter
    @Getter
    private String name;

    /**
     * 创建订单信息
     *
     * @param order 订单号
     * @param name 订单名称
     * @param playerName 玩家
     * @param price 价格
     * @param tradeType 订单类型
     * @param paymentType 支付方式
     * @return 信息
     */
    public static TradeInfo create(String order,
                                   String name,
                                   String playerName,
                                   int price,
                                   TradeType tradeType,
                                   PaymentType paymentType) {
        throw new RuntimeException();
    }
}
