package net.twasiplugin.canvas;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import net.twasi.core.api.ws.api.TwasiWebsocketEndpoint;
import net.twasi.core.plugin.TwasiPlugin;
import net.twasi.core.plugin.api.TwasiUserPlugin;
import net.twasiplugin.canvas.api.graphql.CanvasGraphQLResolver;
import net.twasiplugin.canvas.api.ws.editor.EditorListener;
import net.twasiplugin.canvas.api.ws.events.EventListener;

import java.util.Arrays;
import java.util.List;

public class CanvasPlugin extends TwasiPlugin<PluginConfig> {

    public Class<? extends TwasiUserPlugin> getUserPluginClass() {
        return CanvasUserPlugin.class;
    }

    @Override
    public GraphQLQueryResolver getGraphQLResolver() {
        return new CanvasGraphQLResolver();
    }

    @Override
    public List<TwasiWebsocketEndpoint<?>> getWebsocketEndpoints() {
        return Arrays.asList(
                new EditorListener(),
                new EventListener()
        );
    }

}
