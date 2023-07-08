package me.ddquin;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.entity.Player;

public class StopwatchPlaceholder extends PlaceholderExpansion {
    private final StopwatchMain plugin;

    public StopwatchPlaceholder(StopwatchMain plugin) {
        this.plugin = plugin;
    }

    @Override
    public String getAuthor() {
        return "DDQuin";
    }

    @Override
    public String getIdentifier() {
        return "stopwatch";
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public boolean persist() {
        return true; // This is required or else PlaceholderAPI will unregister the Expansion on reload
    }

    @Override
    public String onPlaceholderRequest(Player player, String identifier) {
        if(identifier.equalsIgnoreCase("seconds")) {
            return plugin.getSecondsOut();
        }
        if(identifier.equalsIgnoreCase("time")) {
            return plugin.getTimerMessage();
        }

        return null; // Placeholder is unknown by the Expansion
    }
}
