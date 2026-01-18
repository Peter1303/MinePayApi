package top.minepay.common.enums;

import lombok.Getter;

/**
 * 支付类型
 *
 * @author Peter1303
 */
public enum PaymentType {
    WECHAT("微信", "wechat"),
    ALIPAY("支付宝", "alipay");

    @Getter
    private final String name;
    @Getter
    private final String param;

    PaymentType(String name, String param) {
        this.name = name;
        this.param = param;
    }

    /**
     * 获取支付枚举
     *
     * @param type 支付类型
     * @return 支付枚举
     */
    public PaymentType getPaymentType(String type) {
        throw new RuntimeException();
    }
}
