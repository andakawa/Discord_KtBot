package io.andakawa.bot

object Launcher {
    @JvmStatic
    fun main(args: Array<String>) {
        val bot = Bot(Settings.BOT_TOKEN)

        bot.start()
    }
}