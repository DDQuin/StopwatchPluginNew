package me.ddquin.actionbar;

import me.ddquin.Util;
import net.minecraft.server.v1_8_R3.ChatComponentText;
import net.minecraft.server.v1_8_R3.Packet;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class Actionbar_1_8_R3 implements Actionbar {
    @Override
    public void sendActionbar(Player p, String message) {

        final PacketPlayOutChat packet = new PacketPlayOutChat(new ChatComponentText(Util.colour(message)), (byte)2);
        ((CraftPlayer)p).getHandle().playerConnection.sendPacket((Packet)packet);
    }
}
