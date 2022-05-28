fun main() {
    val fp = Post(1,1,1,1,1,"",1,1,CommentClass(1,true,
        true,true,true),CopyRightClass(1,"","",""),
        LikesClass(1,true,true,
        true), RepostsClass(1,true), ViewsClass(1), "",null,null,null,
        1,true, true,true,true,true,true,
        DonutClass(true, 1, true,""),1)

   val service = WallService()
    service.add(fp)
    service.update(fp)
    service.add(Post(ownerId = 5))
    service.add(Post(ownerId = 6))
    service.add(Post(ownerId = 7))
    service.add(Post(ownerId = 8))
    println(fp)
    val com = Comment()
    service.createComment(10, com)
}