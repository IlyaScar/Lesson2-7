//import DbConfig.printt
import com.sun.nio.sctp.MessageInfo
import java.util.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Отвыкай писать лишние строки пустые, там где они не нужны, это важно для читабельности
    //task1
    //Это не enum, как написано в задании
    class HttpStatus (
        val code: Int
        ) {
    }
    val code1 = HttpStatus(
        200
    )
    val code2 = HttpStatus(
        400
    )
    val code3 = HttpStatus(
        500
    )
    val code4 = HttpStatus(
        600
    )

    //Что за пустая функция?
    fun isSuccess() {
    }

    //task2
    //По заданию не только преобразование в lowercase
    fun String.toSlug(): String {
        return this.lowercase()
    }
    val testText = "Test String"
    println(testText.toSlug())

    //task3

    Dbconfig.successfulConnect()
    Dbconfig.connectionIsClosed()


}

//task4
//Если тела класса нет, не нужны фигуные скобки
abstract class AbstractApiClient : ApiClient {
}

//Почему 2 класса ниже абстрактные?
abstract class newApiClient : ApiClient {
    override val baseEndpoint: String = "New value"

}
abstract class newApiClient2 : ApiClient {
    override fun post(body: Any) {

        println("New Post method")
    }
}



//task4
interface ApiClient {
    val baseEndpoint: String
    val test: Int //Что за переменная??
    fun get(id: UUID) {
        println("Message is sent to endpoint") // распечатай по какому энпоинту
    }
    fun post(body:Any) {
        println("Message is sent to endpoint") // распечатай по какому энпоинту
    }


}

//task3
object Dbconfig {

    const val login = "12345"
    const val password = "12345"
    const val dbLink = "www.mail.ru"

    fun successfulConnect() {

        println("Connection is successfull")
    }

    fun connectionIsClosed() {

        println("Connection is closed")

    }

}




