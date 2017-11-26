package com.bot.slack.testbot.story

import fr.vsct.tock.bot.connector.slack.attachmentField
import fr.vsct.tock.bot.connector.slack.attachmentMessage
import fr.vsct.tock.bot.connector.slack.multiLineMessage
import fr.vsct.tock.bot.connector.slack.withSlack
import fr.vsct.tock.bot.definition.story

val thankyou = story("thankyou") { bus ->



    with(bus) {
        val attachments = arrayOf(attachmentField("title", "value"), attachmentField("title", "value"))
        withSlack {
            multiLineMessage(listOf("line 1", "line 2", "line 3"))
            attachmentMessage(
                    *attachments,
                    fallback = "fallback",
                    text = "text"
            )
        }
        end()
    }
}