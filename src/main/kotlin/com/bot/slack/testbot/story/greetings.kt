package com.bot.slack.testbot.story

import fr.vsct.tock.bot.definition.story


val greetings = story("hello") { bus ->
    with(bus) {
        resetDialogState()
        send("Hello !")
    }
}