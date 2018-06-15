package io.andakawa.bot.commands.utils

import io.andakawa.bot.Settings
import io.andakawa.bot.commands.Command
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent

class Ping : Command("${Settings.PREFIX}ping") {
    override fun run(event: GuildMessageReceivedEvent) {
        event.channel.sendMessage("Pong :ping_pong:").queue()
    }
}