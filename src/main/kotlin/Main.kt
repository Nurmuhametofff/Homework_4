fun main() {
    val fp = Post(1,1,1,1,1,"",1,1,CommentClass(1,true,
        true,true,true),CopyRightClass(1,"","",""), LikesClass(1,true,true,
        true), RepostsClass(1,true), ViewsClass(1), "",1,true,
        true,true,true,true,true,DonutClass(true,1, true,""),1)

   val service = WallService()
    service.add(fp)
    service.update(fp)
    service.add(Post(ownerId = 5))
    println(fp)

}