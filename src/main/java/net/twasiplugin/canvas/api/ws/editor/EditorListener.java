package net.twasiplugin.canvas.api.ws.editor;

import net.twasi.core.api.ws.api.TwasiWebsocketListenerEndpoint;

public class EditorListener extends TwasiWebsocketListenerEndpoint<EditorListenerConfig> {

    public String getTopic() {
        return "editor";
    }

}
