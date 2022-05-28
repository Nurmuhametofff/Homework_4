import java.lang.RuntimeException

class PostNotFoundException(massage: String) : RuntimeException(massage)
class CommentNotFoundException(massage: String) : RuntimeException(massage)
class ReportNotFoundException(massage: String) : RuntimeException(massage)

class WallService {
    private var posts = emptyArray<Post>()
    private var uniqueId = 0
    private var comments = emptyArray<Comment>()
    private var reports = emptyArray<Report>()

    fun createReport(comment: Comment, report: Report): Comment {
        for ((index, comment) in comments.withIndex()) {
            if (report.commentId == comment.id) {
                if (report.reason < 0 || report.reason > 8) {
                    throw ReportNotFoundException("reason not found")
                }
                reports += report
                return comment
            }
        }
        throw CommentNotFoundException("not found comment")
    }


    fun createComment(postId: Int, comment: Comment): Comment {
        if (foundId(postId)) {
            if (postId == comment.id) {
                comments += comment
                return comments.last()
            }
        }
        throw PostNotFoundException("not found")
    }

    fun foundId(id: Int): Boolean {
        for ((index, posters) in posts.withIndex()) {
            if (posters.id == id) {
                return true
            }
        }
        return false
    }

    fun add(post: Post): Post {
        uniqueId++
        val newPost = post.copy(id = uniqueId)
        posts += newPost
        return posts.last()
    }


    fun update(post: Post): Boolean {
        for ((index, posters) in posts.withIndex()) {
            if (posters.id == post.id) {
                val newPost = post.copy(ownerId = posters.ownerId, date = posters.date)
                posts += newPost
                return true
            }
        }
        return false
    }
}
