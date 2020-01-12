// Copyright 2016 Syed Awase Khirni TPRI/SYCLIQ awasekhirni@gmail.com sak@territorialprescience.com 
println("without lazyval demo")
val fetchDatabyUserInput="http://google.com/api/id=" + userId
val userId=1677123
println(fetchDatabyUserInput)

println("with lazyval")
lazy val getDatabyUser="http://sycliq.com/api/id=" + sycliqId
val sycliqId=37123
println(getDatabyUser)
