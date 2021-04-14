fun main(args: Array<String>) {
        var a: Double=0.0
        var b: Double=0.0
        var c: String?
        print("Nhập vao số a :")
        c = readLine()
        if (c != null) {
            a = c.toDouble()
            print("Phâp vào số b :")
            c=readLine()
        }
        if (c != null) {
                b = c.toDouble()
            }

        if (a== 0.0 && b== 0.0) {
                println("Phươn trinh vô sô nghiệm")

            }
        else if(a==0.0 && b!=0.0 ){
            println("Phương trình vô ngiệm")

        }else {
            var x :Double =-b/a;
            print(x)
        }
        }

