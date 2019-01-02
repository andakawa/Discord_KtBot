package io.andakawa.bot

import io.andakawa.bot.commands.utils.Ping
import io.andakawa.bot.listeners.eventListener
import net.dv8tion.jda.core.AccountType
import net.dv8tion.jda.core.JDABuilder

class Bot(val token: String) {
    val commands = listOf (
            Ping()
    )

    fun start() {
        println("Commands available: ${commands.size}\n")

        val builder = JDABuilder(AccountType.BOT)
                .setToken(token)
                .setAutoReconnect(true)
                .addEventListener(eventListener(this))

        val jda = builder.buildBlocking()
    }
}
