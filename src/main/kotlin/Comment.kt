data class Comment (
    val id: Int = 2,
    val fromId: Int = 0,
    val date: Int = 0,
    val text: String = "",
    val doNot: DoNot? = null,
    val replayToUser: Int = 0,
    val replayToComment: Int = 0,
    val attachment: Attachment? = null,
    val parantsStack: Array<Int>? = null,
    val thread: Thread? = null
    )