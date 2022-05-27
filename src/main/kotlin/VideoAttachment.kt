class VideoAttachmentAttachment(
    val video: Video
) : Attachment {
    override val type: String = "video"
}

class Video(val id: String = "1", val ownerId: String = "1", val albumId: String = "1")

