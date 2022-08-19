package ru.seversknet.myseverskcompose.data.singletons

import ru.seversknet.myseverskcompose.data.models.Comments
import ru.seversknet.myseverskcompose.data.models.News

object MainLists {
    val listNews = mutableListOf<News>(News(date = "", title = "First news", preview = "", description = "Welcome to IT World", photo = null, comments_count = 1, id = 1, comments = ArrayList())
    )
}