package ru.seversknet.myseverskcompose.data.models

data class News(
    val date: String,
    val title: String,
    val preview: String,
    val description: String,
    val photo: String,
    val comments_count: Int,
    val id: Int,
    val comments: ArrayList<Comments>
)

