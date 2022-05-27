class DocAttachment(
    val docAttachment: DocAttachment
) : Attachment {
    override val type: String = "document"
}

class Doc(val id: String = "1", val ownerId: String = "1", val albumId: String = "1")

