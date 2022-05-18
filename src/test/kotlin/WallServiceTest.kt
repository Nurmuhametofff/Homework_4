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
    fun updateFalse(){
        val service = WallService()
        service.add(Post(ownerId = 2))
        service.add(Post(ownerId = 3))
        val update = Post(id = 0, ownerId = 777)
        val result = service.update(update)
        assertFalse(result)
    }
}