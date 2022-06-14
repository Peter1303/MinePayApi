package top.minepay.bean;

import lombok.Getter;
import lombok.Setter;
import top.minepay.enums.PaymentType;
import top.minepay.enums.TradeType;

/**
 * 交易信息
 *
 * @author Peter1303
 * Created in 2022/3/8 20:57
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
     *
     * @see PaymentType
     */
    @Setter
    @Getter
    private PaymentType type;
    /**
     * 订单类型
     * <p>点券</p>
     * <p>礼包</p>
     *
     * @see TradeType
     */
    @Setter
    @Getter
    private TradeType tradeType;

    /**
     * 仅限创建订单
     */
    public TradeInfo() {
    }

    /**
     * 创建礼包订单
     *
     * @param order       订单号
     * @param kitName     礼包名字
     * @param playerName  玩家
     * @param paymentType 支付方式
     * @return 信息
     */
    public static TradeInfo createKit(String order,
                                      String kitName,
                                      String playerName,
                                      PaymentType paymentType) {
        throw new RuntimeException();
    }

    @Deprecated
    public static TradeInfo createKit(String order,
                                      String kitName,
                                      String playerName,
                                      int price,
                                      PaymentType paymentType) {
        throw new RuntimeException();
    }

    /**
     * 创建点券订单
     *
     * @param order       订单号
     * @param playerName  玩家
     * @param count       数量
     * @param paymentType 支付方式
     * @return 信息
     */
    public static TradeInfo createPoint(String order,
                                        String playerName,
                                        int count,
                                        PaymentType paymentType) {
        throw new RuntimeException();
    }

    @Deprecated
    public static TradeInfo createPoint(String order,
                                        String name,
                                        String playerName,
                                        int count,
                                        PaymentType paymentType) {
        throw new RuntimeException();
    }
}
