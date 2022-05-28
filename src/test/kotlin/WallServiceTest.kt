import junit.framework.Assert.*
import org.junit.Test

class WallServiceTest {

    @Test
    fun add() {
        val service = WallService()
        val testAdd = Post()
        val result = service.add(testAdd)
        assertEquals(1, result.id)
    }

    @Test
    fun updateTrue() {
        val service = WallService()
        service.add(Post(ownerId = 2))
        service.add(Post(ownerId = 3))
        val update = Post(id = 2, ownerId = 777)
        val result = service.update(update)
        assertTrue(result)
    }

    @Test
    fun updateFalse() {
        val service = WallService()
        service.add(Post(ownerId = 2))
        service.add(Post(ownerId = 3))
        val update = Post(id = 0, ownerId = 777)
        val result = service.update(update)
        assertFalse(result)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val service = WallService()
        service.add(Post(ownerId = 2))
        service.add(Post(ownerId = 3))
        service.createComment(5, Comment())
    }

    @Test
    fun createCommentTest() {
        val service = WallService()
        service.add(Post(ownerId = 2))
        service.add(Post(ownerId = 3))
        val commentTest = Comment(id = 2)
        val result = service.createComment(2, commentTest)
        assertTrue(result == commentTest)
    }
    @Test
    fun crateReportTest(){
        val service = WallService()
        service.add(Post(ownerId = 2))
        service.add(Post(ownerId = 3))
        val commentTest = Comment(id = 2)
        service.createComment(2, commentTest)
        val reportTest = Report(2, 2, 4)
        val result = service.createReport(commentTest, reportTest)
        assertTrue(result == commentTest)
    }
    @Test(expected = CommentNotFoundException::class)
    fun crateReportTestCommentNotFoundException(){
        val service = WallService()
        service.add(Post(ownerId = 2))
        service.add(Post(ownerId = 3))
        val commentTest = Comment(id = 2)
        service.createComment(2, commentTest)
        val reportTest = Report(3, 3, 4)
        service.createReport(commentTest, reportTest)
    }
    @Test(expected = ReportNotFoundException::class)
    fun crateReportTestReportNotFoundException(){
        val service = WallService()
        service.add(Post(ownerId = 2))
        service.add(Post(ownerId = 3))
        val commentTest = Comment(id = 2)
        service.createComment(2, commentTest)
        val reportTest = Report(3, 2, 10)
        service.createReport(commentTest, reportTest)
    }

}