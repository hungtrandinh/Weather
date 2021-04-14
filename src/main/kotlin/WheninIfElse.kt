fun main(){
    var b:Int
    var s:String?
    s= readLine()
    if(s!=null){
        b=s.toInt()
        when{
            b % 2==0 && b%3 !=0 -> print("b chia hết cho 2 và không chia hết cho 3")
            b.rem(3)==0-> print("b chia hết cho 3")
            (b.rem(2)==0)and(b.rem(3)==0)-> print("b chia hheets cho cả 2 và 3")
            else-> print("không thoã mản cái nào hết má ơi")
        }

    }
}