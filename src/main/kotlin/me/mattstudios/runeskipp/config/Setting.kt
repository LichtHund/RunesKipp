package me.mattstudios.runeskipp.config

import me.mattstudios.config.SettingsHolder
import me.mattstudios.config.SettingsManager
import me.mattstudios.config.annotations.Path
import me.mattstudios.config.properties.Property

object Setting : SettingsHolder {

    @Path("token")
    val TOKEN = Property.create("")

}