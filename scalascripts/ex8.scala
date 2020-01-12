// Copyright 2016 Syed Awase Khirni TPRI/SYCLIQ awasekhirni@gmail.com sak@territorialprescience.com 
println("functional for loops demo: for comprehensions")
val score=List(12,36,82,91,72)
val myresult = for (a<-score) yield(a+1)
println(myresult)