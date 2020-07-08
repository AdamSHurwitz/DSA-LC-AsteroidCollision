fun asteroidCollision(asteroids: IntArray): IntArray {
    val stack = ArrayList<Int>()
    for (a in asteroids) stack.add(a)
    var curIndex = stack.size - 1
    while (curIndex >= 1) {
        val cur = stack.get(curIndex)
        val prev = stack.get(curIndex - 1)
        if (prev.isRight() && cur.isLeft()) {
            if (Math.abs(cur) == Math.abs(prev)) {
                stack.removeAt(curIndex)
                stack.removeAt(curIndex - 1)
                if (curIndex - 2 == stack.size - 1)
                    curIndex -= 2
                else curIndex--
            } else if (Math.abs(prev) > Math.abs(cur)) {
                stack.removeAt(curIndex)
                if (curIndex - 1 == stack.size - 1)
                    curIndex--
            } else {
                stack.removeAt(curIndex - 1)
                curIndex--
            }
        } else curIndex--
    }
    return stack.toIntArray()
}

fun Int.isLeft() = this < 0
fun Int.isRight() = this > 0