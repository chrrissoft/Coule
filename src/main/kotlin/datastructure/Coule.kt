package coule

interface Coule<T> {

    /**
     * returns the first element that was added of the coule,
     * and remove that element from the coule
     * @throws IllegalStateException if the coule is empty
     * */
    fun enter(): T

    /**
     * returns the first element that was added of the coule,
     * and remove that element from the coule.
     * if the coule is empty then unUnderflow is called
     * @throws IllegalStateException if the coule is empty
     * */
    fun enterOrUnderflow(unUnderflow: () -> Unit): T?

    /**
     * remove the first element that was added of
     * the coule if it is not empty
     * @return true if the element was removed
     * */
    fun down(): Boolean

    /**
     * remove the first element that was added of
     * the coule if it is not empty and the unUnderflow is called
     * @return true if the element was removed
     * */
    fun downOrUnderflow(unUnderflow: () -> Unit): Boolean

    /**
     * add a new element to the coule
     * @return true if the element was added
     * */
    fun push(element: T): Boolean

    /**
     * add a new list elements to the coule
     * @return true if the elements was added
     * */
    fun push(elements: List<T>): Boolean

    /**
     * @return the complete coule as list it
     * begins from the first element
     * */
    fun get(): List<T>

    /**
     * clean up the coule
     **/
    fun clear()

    /**
     * @return true if the coule is empty
     * */
    fun isEmpty(): Boolean

    /**
     * @return true if the coule is not empty
     * */
    fun isNotEmpty(): Boolean

    /**
     * @return the size of the coule
     **/
    fun getSize(): Int

}


