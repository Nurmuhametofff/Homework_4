class PhotoAttachment(
    val photo: Photo,
) : Attachment {
    override val type: String = "photo"
}

class Photo(val id: String = "1", val ownerId: String = "1", val albumId: String = "1")

