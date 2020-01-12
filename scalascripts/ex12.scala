// Copyright 2016 Syed Awase Khirni TPRI/SYCLIQ awasekhirni@gmail.com sak@territorialprescience.com 
//isInstanceOf and asInstanceOf  demo

println(10.isInstanceOf[Int])
println(1991.isInstanceOf[Boolean])
println("1281".isInstanceOf[Boolean])
println("1231".isInstanceOf[String])
println("joyRide".isInstanceOf[CharSequence])
//casting 
val lionKing:Any="hakuna matata what a wonderful world!"
//converting "ANY" type to string (casting) any is super set of string 
val mystring:String= lionKing.asInstanceOf[String]
println(mystring)

def myevaluation(x:Any)=if(x.isInstanceOf[Int]) x.asInstanceOf[Int]+1 else -1
println(myevaluation(253))
println(myevaluation("test"))

//parametrizedtypesonmethod 

def mytest(b:Boolean, i:Any,j:Any):Any=if(b) i else j 
println(mytest(true,"Awase","Ameese"))
println(mytest(false,1261267,1271278))
println(mytest(true,'A','B'))
