package top.minepay.bean;

import lombok.Getter;

/**
 * 排行榜
 *
 * @author Peter1303
 * @date Created in 2021/9/10 16:46
 */
public class RankItem {
    @Getter
    private final String playerName;
    @Getter
    private final float value;

    public RankItem(String playerName, float value) {
        this.playerName = playerName;
        this.value = value;
    }
}
