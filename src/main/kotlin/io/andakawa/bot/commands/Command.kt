package io.andakawa.bot.commands

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent

abstract class Command(val label: String) {
    open fun handle(event: GuildMessageReceivedEvent) : Boolean {
        val message = event.message.contentRaw

        if (message.startsWith(label)) {
            run(event)
            return true
        } else {
            return false
        }
    }

    abstract fun run(event: GuildMessageReceivedEvent)

}