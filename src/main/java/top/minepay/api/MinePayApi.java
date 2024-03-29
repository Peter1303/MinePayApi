package top.minepay.api;

import org.bukkit.entity.Player;
import top.minepay.bean.RankItem;
import top.minepay.bean.TradeInfo;

import java.util.List;

/**
 * MinePay 接口
 *
 * @author Peter1303
 */
public class MinePayApi {
    /**
     * 交易控制
     */
    public static class TradeController {
        /**
         * 开始交易
         *
         * @param tradeInfo 交易信息
         */
        public static void start(TradeInfo tradeInfo) {
        }

        /**
         * 取消交易
         *
         * @param player 玩家
         */
        public static void close(Player player) {
        }

        /**
         * 取消交易
         *
         * @param playerName 交易信息
         */
        public static void close(String playerName) {
        }
    }

    /**
     * 信息获取
     */
    public static class Info {
        /**
         * 获取充值排名
         *
         * @return 列表
         */
        public static List<RankItem> getRankingList() {
            throw new RuntimeException();
        }
    }
}
