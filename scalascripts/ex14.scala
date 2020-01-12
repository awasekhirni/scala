// Copyright 2016 Syed Awase Khirni TPRI/SYCLIQ awasekhirni@gmail.com sak@territorialprescience.com 
//classes and methods in scala 

class Employee(@BeanProperty val firstName:String,
                @BeanProperty val lastName:String,
                val title:String="technologist"){

                    //typicalform 
                    def fullName=s"$firstName $lastName"

                    def changeLastName(ln:String) = new Employee(firstName,ln,lastName)

                }


//constructor 
// we use val here
//immutable object create copy to create constructor
class Position(@BeanProperty val gmlx:double,@BeanProperty gmly:double, @BeanProperty locationInfo:String){
    //precondition in the primary construct
    require(gmlx.nonEmpty,"gmlx cannot be empty")
    require(gmly.nonEmpty,"gmly cannot be empty")
    require(locationInfo.nonEmpty,"locationinfo cannot be empty")
    
    
    def copy(gmlx:Double,gmly:Double, locationInfo:String)={
        new Position(gmlx,gmly,locationInfo)
    }
}