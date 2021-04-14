fun main(){
    var a :Int
    var s:String?
    s=readLine()
    if(s!=null){
        a=s.toInt()
        if((a.rem(4)==0).and(a.rem(100)!=0).or(a.rem(400)==0  )){
            println("năm $a là năm nhuận  ")
        }else{
            print("năm $a không phải là năm ")
        }
    }
}




