package io.andakawa.bot.listeners

import io.andakawa.bot.Bot
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent
import net.dv8tion.jda.core.hooks.ListenerAdapter

class eventListener(val bot: Bot) : ListenerAdapter(){
    override fun onGuildMessageReceived(event: GuildMessageReceivedEvent) {
        // Prevents message recognition if author is a bot
        if (event.author.isBot) return

        // Console output
        println("${event.message.guild.name} : [${event.message.channel.name}] ${event.author.name}: ${event.message.contentRaw}")

        for (command in bot.commands) {
            if (command.handle(event)) {
                return
            }

        }

    }
}