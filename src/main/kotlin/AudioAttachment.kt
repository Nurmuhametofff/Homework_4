class AudioAttachment(
    val audioAttachment: AudioAttachment
) : Attachment {
    override val type: String = "audio"
}

class Audio(val id: String = "1", val ownerId: String = "1", val albumId: String = "1")

