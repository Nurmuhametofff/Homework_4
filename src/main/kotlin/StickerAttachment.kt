class StickerAttachmentAttachment(
    val stickerAttachment: StickerAttachment
) : Attachment {
    override val type: String = "sticker"
}

class StickerAttachment(val id: String = "1", val ownerId: String = "1", val albumId: String = "1")

