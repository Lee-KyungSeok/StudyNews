package co.kr.studynews.util


object Preconditions {
//
//    fun <T> checkNotNull(reference: T?): T {
//        if (reference == null) {
//            val exception = NullPointerException()
//
//            exception.stackTrace = getStackTrace(exception)
//
//            throw exception
//        }
//        return reference
//    }
//
//    /**
//     * Ensures that an object reference passed as a parameter to the calling method is not null.
//     *
//     * @param reference an object reference
//     * @param name the variable name
//     * @return the non-null reference that was validated
//     * @throws NullPointerException if `reference` is null
//     */
//    fun <T> checkNotNull(reference: T?, name: String): T {
//        if (reference == null) {
//            val exception = NullPointerException("$name must not be null.")
//
//            exception.stackTrace = getStackTrace(exception)
//
//            throw exception
//        }
//        return reference
//    }
//
//    /**
//     * Ensures the truth of an expression involving one or more parameters to the calling method.
//     *
//     * @param expression a boolean expression
//     * @throws IllegalArgumentException if `expression` is false
//     */
//    fun checkArgument(expression: Boolean) {
//        if (!expression) {
//            val exception = IllegalArgumentException()
//
//            exception.stackTrace = getStackTrace(exception)
//
//            throw exception
//        }
//    }
//
//    /**
//     * Ensures the truth of an expression involving one or more parameters to the calling method.
//     *
//     * @param expression a boolean expression
//     * @param name the variable name
//     * @throws IllegalArgumentException if `expression` is false
//     */
//    fun checkArgument(expression: Boolean, name: String?) {
//        if (!expression) {
//            val exception = IllegalArgumentException("$name must not be false.")
//
//            exception.stackTrace = getStackTrace(exception)
//
//            throw exception
//        }
//    }
//
//    /**
//     * Ensures not blank in parameters.
//     *
//     * @param value the value to check
//     * @param name the name you want to display in the logs
//     * @param <T> the type of the value
//     * @return the value you want to check
//    </T> */
//    @NonNull
//    fun <T : CharSequence> nonBlank(@Nullable value: T?, name: String): T {
//        if (StringUtils.isBlank(value)) {
//            val exception = IllegalArgumentException("$name must not be blank.")
//
//            exception.stackTrace = getStackTrace(exception)
//
//            throw exception
//        }
//        return value
//    }
//
//    @NonNull
//    private fun getStackTrace(@NonNull exception: Exception): Array<StackTraceElement> {
//        val sourceStack = exception.stackTrace
//
//        val updatedStack = arrayOfNulls<StackTraceElement>(sourceStack.size - 1)
//        System.arraycopy(sourceStack, 1, updatedStack, 0, updatedStack.size)
//
//        return updatedStack
//    }
}// no-op