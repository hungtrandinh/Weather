fun main(){
    var a: Int
    var mang = arrayOf("2","3","4","5","6")
    var s: String?
    s= readLine()
    if (s!=null){
        for (i in 1..10){
            var x= i*i
            println(x)
        }
        println("____________________")
        for(x in 1 until 20) {
            println(x)
        }
        println("__________-__________")
        for (x in mang){
            println(x)
        }
        println("____________________")
        for ((x,y) in mang.withIndex()){
            println("$x=$y")
        }
        println("____________________")
        for(x in mang.indices){
            println("$x")
        }
    }
}