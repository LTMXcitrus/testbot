package com.bot.slack.testbot.story

import fr.vsct.tock.bot.definition.story

val thankyou = story("thankyou") { bus ->
    with(bus) {
        send("De rien")
    }
}