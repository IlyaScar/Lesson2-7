//import DbConfig.printt
import com.sun.nio.sctp.MessageInfo
import java.util.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Отвыкай писать лишние строки пустые, там где они не нужны, это важно для читабельности
    //task1
    //Это не enum, как написано в задании
    //task2
    //По заданию не только преобразование в lowercase
    fun String.toSlug(): String {
        return this.lowercase()
        .replace(' ','-')
    }
    val testText = "Test String"
    println(testText.toSlug())

    //task3
    Dbconfig.successfulConnect()
    Dbconfig.connectionIsClosed()

    //task4
    val API_Get_Books = newApiClient()
    println(API_Get_Books.post("books.api"))
    println(API_Get_Books.get(UUID.randomUUID()))
}
//task1
enum class HttpStatus (
    val code: Int
) {
    OK(200),
    BAD_REQUEST(400),
    NOT_FOUND(404),
    INTERNAL_ERROR(500);
    //Что за пустая функция?
    fun isSuccess() : Boolean = code in 200..299
}

//task4
//Если тела класса нет, не нужны фигуные скобки
abstract class AbstractApiClient : ApiClient {
}
//Почему 2 класса ниже абстрактные?
class newApiClient : AbstractApiClient () {
    override val baseEndpoint: String = "https://api.removeitem"
}
class newApiClient2 : AbstractApiClient () {
    override val baseEndpoint: String = "https://api.additem"
    override fun post(body: Any) {
        println("new post")
    }
}

//task4
interface ApiClient {
    val baseEndpoint: String
    fun get(id: UUID) {
        println("Message is sent to endpoint $baseEndpoint/$id") // распечатай по какому энпоинту
    }
    fun post(body:Any) {
        println("Message is sent to endpoint $baseEndpoint/$body") // распечатай по какому энпоинту
    }
}

//task3
object Dbconfig {
    const val login = "Ilya"
    const val password = "12345"
    const val dbLink = "www.mail.ru"
    fun successfulConnect() {
        println("Connection is successfull")
    }
    fun connectionIsClosed() {
        println("Connection is closed")
    }
}




