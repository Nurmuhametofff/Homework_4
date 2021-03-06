data class Post(
    val id: Int = 0,
    val ownerId: Int = 1,
    val fromId: Int = 1,
    val createdBy: Int = 1,
    val date: Int = 1,
    val text: String = "",
    val replyOwnerId: Int = 1,
    val replyPostId: Int = 1,
    val comments: CommentClass = CommentClass(),
    val copyRight: CopyRightClass = CopyRightClass(),
    val likes: LikesClass = LikesClass(),
    val reposts: RepostsClass = RepostsClass(),
    val views: ViewsClass = ViewsClass(),
    val postType: String = "",
    val postSource: PostSourceClass? = null,
    val geo: GeoClass? = null,
    val copyHistory: Array<RepostsClass>? = null,
    val signerId: Int = 1,
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = true,
    val marketAsAds: Boolean = true,
    val isFavorite: Boolean = true,
    val donut: DonutClass = DonutClass(),
    val postPonedID: Int = 1,
    val attachments:Array<Attachment> = emptyArray()
)
