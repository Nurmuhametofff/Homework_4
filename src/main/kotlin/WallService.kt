

class WallService {
    private var posts = emptyArray<Post>()
    private var uniqueId = 0

    fun add(post: Post): Post{
        uniqueId++
        val newPost = post.copy(id = uniqueId)
        posts += newPost
        return posts.last()
    }


    fun update(post: Post): Boolean {
        for ((index, posters) in posts.withIndex()){
            if (posters.id == post.id){
                val newPost = post.copy(ownerId = posters.ownerId, date = posters.date)
                posts += newPost
                return true
            }
        }
        return false
    }
}
