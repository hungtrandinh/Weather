fun main(args : Array<String>){
    var a :Int
    var s :String?
    println("Nhập vào tổng thòi gian")
    s =readLine()
    if(s!=null){
        a=s.toInt()
        var Gio =(a/60)/60
        var Phut =(a/60)%60
        var Giây =(a%60)%60
        println("$Gio : $Phut : $Giây")
    }
}