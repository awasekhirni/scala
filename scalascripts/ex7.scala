// Copyright 2016 Syed Awase Khirni TPRI/SYCLIQ awasekhirni@gmail.com sak@territorialprescience.com 
println("while loop demo")
var result ="";
var j=121
while (j>33){
    result =result+j
    if(j>55) result = result +","
    j= j-11
}

println(result)

println("scala demo--------")
val myresult = (1 to 111).reverse.mkString(",")
println(myresult)
val otherapproach =(999 to 1 by -99).mkString(",")
println(otherapproach)
