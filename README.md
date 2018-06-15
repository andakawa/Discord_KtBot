# Discord Kotlin Bot

This Bot is written in Kotlin using [JDA](https://github.com/DV8FromTheWorld/JDA) and is here to provide a quick start for getting your first Discord Bot on your Server.

### Important

You need to [Create a new App on Discord](https://discordapp.com/developers/applications/me/create) and set it up as _Bot User_. Retrieve your token and paste it in the Settings.kt. The token is used to authenticate your Bot to the Discord Network otherwise it won't connect to any server.

# Functionalities

The Bot can recognize the typical Ping command.
This repo is designed to provide a simple template.
It's fairly easy to implement other command functionalities.

Take a look at the Ping Command and how it's called in the Bot.kt

```Kotlin
val commands = listOf (
            Ping(),
            YourCommand(),
            YourSecondCommand(),
            andSoOn()
    )
```

### Installation

Just create a fork and start coding :)
Please check the JDA Repo for further information on how to use the API

### Hosting

I suggest using DigitalOcean Droplets - you can get a Droplet for just 5$ a month
