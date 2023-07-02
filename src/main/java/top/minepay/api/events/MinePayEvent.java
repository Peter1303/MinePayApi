package top.minepay.api.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * MinePay 事件
 *
 * @author Peter1303
 */
public abstract class MinePayEvent extends Event {
    protected static final HandlerList HANDLERS = new HandlerList();

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
