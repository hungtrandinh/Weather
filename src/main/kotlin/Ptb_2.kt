import kotlin.math.sqrt

fun Ptb2(a:Double, b:Double, c:Double): String {
    if (a == 0.0) {
        if (b == 0.0 && c == 0.0) {
            return ("Phương trình vô số nghiệm")
        }
        if (b == 0.0 && c != 0.0) {
            return ("phương trình vô nghiệm")
        }
        var x = -c / b
        return "No=$x"

    } else {
        var denta = (b * b) - (4 * a * c)


        if (denta > 0.0) {
            var x1 = (-b - sqrt(denta)) / (2 * a)
            var x2 = (-b + sqrt(denta)) / (2 * a)
            return "phương trình có 2 nghiệm x1 = $x1 và x2 = $x2"
        }
        if (denta < 0.0) {
            return "phuong trinh vô nghiệm"
        }

        var x3 = -b / (2 * a)
        return "phương trình có nghiệm kép x = $x3"

    }
    }

    fun main(args: Array<String>) {
        var a: Double?
        var b: Double?
        var c: Double?
        println("nhập hệ só a")
        a = readLine()?.toDouble()
        println("nhập hệ số b")
        b = readLine()?.toDouble()
        println("nhập hệ số c")
        c = readLine()?.toDouble()
        if (a == null || b === null || c == null) return
        var kq = Ptb2(a, b, c)
        print(kq)

    }


