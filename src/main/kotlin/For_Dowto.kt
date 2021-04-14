fun main(agrs:Array<String>){
    var i :Int
    for(k in 9 downTo 1 step 3){// vòng lạp kiểu downto
        println(k)
    }
    print("____________")
    for(k in 1..10 step 3){// vòng lặp kiểu steep
        print(k)
    }
    print("_____________")
    for (k in 2 until 11){ // vòng lặp kiểu Harf_open_range
        print(k)
    }
    var Ds= arrayOf("a","b","c","d")
    for(k in Ds){// duyêt mảng bình thường
        print("$k \t")
    }
    for(k in Ds.indices){ // duyêt mảng theo vị trí phàn tử
        println("Phần tử thứ $k là ${Ds[k]}")
    }
    for((index,value) in Ds.withIndex()){ // duyệt mãng theo đối tượng
        println("$index=$value")
    }
}