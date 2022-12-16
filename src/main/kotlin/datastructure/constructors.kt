package coule

fun <T> coule(elements: List<T> = emptyList()): Coule<T> = CouleImpl(elements)

fun <T> coule(element: T? = null): Coule<T> = CouleImpl(element)