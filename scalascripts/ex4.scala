println("demo of val and var in scala")
val a=12891;
println("val is similar to final keyword in java")
println(a)
println("var is variable, which can reassigned, while var cannot be reassigned")
var b=1327123
println(b)
b=7812
println(b)
println("but you cannot reassign type of string, this would have been ok in javascript,but not here ")
//b="Syedawase" // this would give error
// Copyright 2016 Syed Awase Khirni TPRI/SYCLIQ awasekhirni@gmail.com sak@territorialprescience.com 
val c:Double=3.145
val d=172621:Double //coercion
println(c,d)

//type inferencing and coercion
val id=1991

val name="syed"

val mycall=id+"."+name 
println(mycall)
