package me.mattstudios.runeskipp

import me.mattstudios.config.SettingsManager
import me.mattstudios.runeskipp.config.Setting
import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.requests.GatewayIntent
import net.dv8tion.jda.api.utils.cache.CacheFlag
import java.nio.file.Path

class RunesKipp {

    private val config = SettingsManager
        .from(Path.of("config", "config.yml"))
        .configurationData(Setting::class.java)
        .create()

    // Creates JDA object and starts the bot
    private val jda = JDABuilder
        .create(config[Setting.TOKEN],
                listOf(
                    GatewayIntent.GUILD_EMOJIS,
                    GatewayIntent.GUILD_MESSAGES,
                    GatewayIntent.GUILD_MESSAGE_REACTIONS,
                    GatewayIntent.GUILD_MESSAGE_TYPING,
                    GatewayIntent.GUILD_MEMBERS,
                    GatewayIntent.GUILD_PRESENCES,
                ))
        .disableCache(
            listOf(
                CacheFlag.ACTIVITY
            )
        )
        //.addEventListeners(cache, StatusListener())
        .build()


    init {
        println("Ready")
    }

}
