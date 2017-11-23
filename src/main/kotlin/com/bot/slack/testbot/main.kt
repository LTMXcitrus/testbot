package com.bot.slack.testbot

import com.bot.slack.testbot.story.greetings
import fr.vsct.tock.bot.definition.bot


val testBot = bot(
        "test-bot-slack",
        stories = emptyList(),
        hello = greetings
)