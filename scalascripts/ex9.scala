// Copyright 2016 Syed Awase Khirni TPRI/SYCLIQ awasekhirni@gmail.com sak@territorialprescience.com 
println("smart strings scala demo")
val mylyrics="Hello!, You fool,\n"+
            "I love you, \n"+
            "Come on enjoy the joy ride,\n"

println(mylyrics)

val smartlyrics="""Dont worry
                    be happy!""".stripMargin


println(smartlyrics)


val stmt="My duty starts from 9:00AM to 9.00PM everyday"
val searchTime=""""(\s|[0-9])?[0-9]:[0-5][0-9]\s*(AM|PM) """.r

println(searchTime.findAllIn(stmt).toList)

