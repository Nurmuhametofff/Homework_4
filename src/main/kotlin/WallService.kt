

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
        for (posters in posts){
            if (posters.id == post.id){
                val index = posts.indexOf(posters)
                posts[index] = post.copy(id = post.id, date = post.date)
                return true
            }
        }
        return false
    }
}
