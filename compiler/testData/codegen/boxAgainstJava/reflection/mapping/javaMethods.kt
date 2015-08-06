import kotlin.reflect.*
import kotlin.reflect.jvm.*
import javaMethods as J

fun box(): String {
    val f = J::f
    val fm = f.javaMethod ?: return "Fail: no Method for f"
    if (fm.invoke(J(), "abc") != "abc") return "Fail fm"
    val ff = fm.kotlinFunction ?: return "Fail: no KFunction for fm"
    if (f != ff) return "Fail f != ff"

    val g = J::g
    val gm = g.javaMethod ?: return "Fail: no Method for g"
    if (gm.invoke(null, "ghi") != "ghi") return "Fail gm"
    val gg = gm.kotlinFunction ?: return "Fail: no KFunction for gm"
    if (g != gg) return "Fail g != gg"

    return "OK"
}
