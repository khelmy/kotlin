// !DIAGNOSTICS: -UNUSED_EXPRESSION

import Obj.ext
import A.Companion.ext2

object Obj {
    val String.ext: String get() = this
}

class A {
    companion object {
        val String.ext2: String get() = this
    }
}

fun test() {
    String::<!EXTENSION_IN_CLASS_REFERENCE_NOT_ALLOWED!>ext<!>

    String::<!EXTENSION_IN_CLASS_REFERENCE_NOT_ALLOWED!>ext2<!>

    A::<!UNRESOLVED_REFERENCE!>foo<!>
    A::<!UNRESOLVED_REFERENCE!>bar<!>
}
