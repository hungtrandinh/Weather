fun main(args:Array<String>){
    var a:Int
    var c:String?
    c= readLine()
    if(c!=null){
        a=c.toInt()
        when(a)
        {
            1,2,3-> print("quý 1")
            4,5,6->print("quý 2")
            7,8,9->print("quý 3")
            10,11,12->print("quý 4")
            else->print("méo có tháng này đâu")
        }
    }
}