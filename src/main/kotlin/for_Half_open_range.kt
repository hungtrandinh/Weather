fun main(args:Array<String>){
    var i :Int
    var s: String?
    s= readLine()
    if (s!=null){
        i=s.toInt()
        for(k in 1 until i){
            println(k)
        }
        for(x in 1 until (i+29)){
            println(x)
        }
    }
}