/**
 * Created by stefa on 24.01.2018.
 */

fun main(args: Array<String>) {
    println("Hello, world!")
}

fun sort(list: List<Int>): List<Int> {

    if (list.size <= 1) {
        return list
    }

    val pivotIdx = list.size / 2
    val pivot = list[pivotIdx];

    val less = list.filterIndexed { idx, e ->
        if (idx != pivotIdx) e <= pivot else false;
    }
    val greater = list.filterIndexed { idx, e ->
        if (idx != pivotIdx) e > pivot else false;
    }

    return sort(less) + pivot + sort(greater)
}