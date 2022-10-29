

/*fun main(args: Array<String>) {
    val n = readln().toInt()
    var sum = 0
    var arr = readln().split(" ").map(String::toInt)
    for(i in arr) {
        sum += i
        sum *= 113
        sum %= 10000007
    }
    println(sum)
}
fun main() {
    val students = mutableListOf(41 to "Ivan", 20 to "Petr", 10 to "Oleg")
    val ageComparator = compareBy<Pair<Int,String>>{ it.first}
    println(students.sortedWith(ageComparator))
    val listOfPerson = listOf(Person(10), Person(6), Person(40))
    val sorted = listOfPerson.sortedBy {
        it.age
    }
    println(sorted)

    val listOfStudent = listOf(Student(20, "Ivan"),
                                Student(12,"Max"),
                                Student(16,"Anna"))
    listOfStudent.sorted().forEach{println(it)}
}
*/
class Car(var name: String)
//class ECar(name: String) : Car(name) {

//}


data class Person(var age: Int)
data class Student(var age: Int, var name: String) : Comparable<Student> {
    override fun compareTo(other: Student): Int {
        // проверки сделать
        // по строке
        // return other.name.compareTo(this.name)
        return other.age-this.age
    }

}

fun volume(height: Int, width: Int, length: Int): Int {
    fun area(a: Int, b: Int) = a * b
    return height * area(width, length)
}

fun binom(n: Int, k: Int): Int {
    if (n == k || k == 0) return 1
    if (k == 1 ) return n
    return binom(n-1, k-1) + binom(n-1, k)
}
/*
internal abstract class Shape : Comparable<Shape> {
    internal abstract fun area(): Double
    override fun compareTo(s: Shape) = this.area().compareTo(s.area())
}

internal class Square(val a: Int) : Shape() {
    override fun area() = (a * a).toDouble()
}

internal class Rect(val a: Int, val b: Int) : Shape() {
    override fun area() = (a * b).toDouble()
}

fun main() {
    val s = Square(7)
    val r = Rect(2,1)
    println(s.area() + r.area())
}*/

/*fun main() {
    val p = Point(1,1)
    val cloud = CloudOfPoints(arrayListOf(Point(1,1)))
    p.move(1,1);
    cloud.move(2,2)
    val p2 = cloud.points[0]
    println("${p.x} ${p.y}")
    println("${p2.x} ${p2.y}")
}
*/

interface Movable {
    fun move( dx: Int, dy: Int)
}
internal class Point(var x:Int, var y:Int) : Movable {
    override fun move(dx: Int, dy: Int) {
        x += dx
        y += dy
    }
}
internal class CloudOfPoints(val points: ArrayList<Point>) : Movable {
    override fun move(dx: Int, dy: Int) {
        for(p in points) {
            p.x += dx
            p.y += dy
        }
    }
}



class MyClass(val a: Int = 0, val b: Int = 0) {
    fun action() {
        println(a-b)
    }
}
// обобщенная функция
fun MyClass.toDooo() {
    println((a+b)*100)
}
/*
fun main() {
    val obj = MyClass(12,3)
    obj.action()
    obj.toDooo()
}
*/
fun String.countVowels() : Int {
    val str = this
    val check = "auoie"
    var total = 0
    for(s in str) {
        if(s in check) total++
    }
    return total
}

abstract class Shape : Comparable<Shape>{
    abstract fun area(): Double
    override fun compareTo(other: Shape) = this.area().compareTo(other.area())
}
class Rectangle(val a: Double, val b: Double) : Shape() {
    override fun area(): Double {
        return a*b
    }
}
class Circle(val r: Double) : Shape() {
    override fun area(): Double {
        return Math.PI*r*r
    }
}
class Square(val a: Double) : Shape() {
    override fun area(): Double {
        return a*a
    }
}
fun main() {
    val count = readln().toInt()
    var total = 0.0
    repeat(count) {
        val result = readln().split(" ")
        total += when(result[0]) {
            "C" -> Circle(result[1].toDouble()).area()
            "R" -> Rectangle(result[1].toDouble(), result[2].toDouble()).area()
            "S" -> Square(result[1].toDouble()).area()
            else -> 0.0
        }
    }
    println(String.format("%.2f",total))
}









