fun main( args: Array<String>){
    var a: Double?
    var b: Double?
    var Dau :Char?
    print("Nhập vao số a")
    a= readLine()?.toDouble()
    print("Nhâp vào số b")
    b= readLine()?.toDouble()
    println("Nhập vào 1 dấu bất kì + - * /")
    Dau= readLine()?.get(0)
    if(a==null || b== null ) return
    when(Dau){
          '+' ->print("$a + $b = ${a+b}")
          '-'-> print("$a-$b = ${a-b}")
          '*' ->print("$a * $b = ${a*b}")
          '/'->if(b==0.0){
              println("khopng chia đc cho số bằng 0")
             }else {
              print("$a/$b = ${a / b}")
               }
          else-> print("phép tính sai rồi")
    }

}