// "Change visibility modifier" "true"
abstract class C : ClassLoader() {
    <caret>private override fun findClass(var1: String): Class<*> {
        throw ClassNotFoundException(var1)
    }
}
