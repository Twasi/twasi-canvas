package net.twasiplugin.canvas.api.ws.events;

import net.twasi.core.api.ws.api.TwasiWebsocketListenerEndpoint;

public class EventListener extends TwasiWebsocketListenerEndpoint<EventListenerConfig> {

    public String getTopic() {
        return "events";
    }

}
