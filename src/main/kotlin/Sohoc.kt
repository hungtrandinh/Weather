fun Tinhtong(a:Double,b:Int) :Double{
    var Kq : Double= 0.0
    var Mau : Int = 0
    var Tu :Double =1.0


    for(i in 1..b){
         Tu *= a
         Mau += i
         Kq +=Tu/Mau



    }
    return Kq
}
fun main(){
    var a:Double?
    var b:Int?
    println("Nhâp vào giá trị của a")
    a = readLine()?.toDouble()
    println("Nhập vào giá trị của b")
    b= readLine()?.toInt()
    if (a==null || b ==null) return
    var kq =Tinhtong(a ,b)
    print(kq)


}
