package coule

import LinkedList
import linkedList

class CouleImpl<T>() : Coule<T> {

    private lateinit var linkedList: LinkedList<T>

    constructor(list: List<T>) : this() {
        linkedList = linkedList(list)
    }

    constructor(element: T?) : this() {
        linkedList = linkedList(element)
    }

    override fun enter(): T {
        return if (linkedList.getTheLast() == null) throw IllegalAccessException()
        else {
            val element = linkedList.getTheLast()!!
            linkedList.removeLast()
            element
        }
    }

    override fun enterOrUnderflow(unUnderflow: () -> Unit) : T? {
        return if(linkedList.getTheHead() == null) {
            unUnderflow()
            return null
        }
        else enter()
    }

    override fun down(): Boolean {
        return if (linkedList.getTheHead() == null) false
        else linkedList.removeLast()
    }

    override fun downOrUnderflow(unUnderflow: () -> Unit): Boolean {
        return if(linkedList.getTheHead() == null) {
            unUnderflow()
            return false
        }
        else down()
    }

    override fun push(element: T): Boolean {
        return try {
            linkedList.add(element)
            true
        } catch (e: IllegalStateException) {
            false
        }
    }

    override fun push(elements: List<T>): Boolean {
        return try {
            linkedList.addAll(elements)
            true
        } catch (e: IllegalStateException) {
            false
        }
    }

    override fun get(): List<T> {
        return linkedList.getAll()
    }

    override fun clear() {
        linkedList.removeAll()
    }

    override fun isEmpty() = linkedList.isEmpty()

    override fun isNotEmpty() = linkedList.isNotEmpty()

    override fun getSize() = linkedList.size()


}