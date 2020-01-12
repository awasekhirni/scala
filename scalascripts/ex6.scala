// Copyright 2016 Syed Awase Khirni TPRI/SYCLIQ awasekhirni@gmail.com sak@territorialprescience.com 
println("old approach if else statment")

val d=218787
var myoldresult=""
if(d<2000){
    myoldresult="d is less than 2000"
} else if( d>2000){
    myoldresult="d is greater than 2000"
} else{
    myoldresult ="the value is 218787"
}
println(myoldresult)
println("________________________________________")
println("scala approach") 

val k=2198
val result = if(k<2000) "less than 2000"
else if (k>2000) "greater than 2000 "
else "it is 2198"
println(result)