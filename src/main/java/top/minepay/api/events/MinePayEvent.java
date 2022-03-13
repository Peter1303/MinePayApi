package top.minepay.api.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * MinePay 事件
 *
 * @author Peter1303
 */
public abstract class MinePayEvent extends Event {
    protected static final HandlerList handlers = new HandlerList();

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
