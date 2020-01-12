// Copyright 2016 Syed Awase Khirni TPRI/SYCLIQ awasekhirni@gmail.com sak@territorialprescience.com 
import scala.annotation.tailrec
println("recursion demo in scala")

def factorial(n:BigInt):BigInt={
    if(n==0 | n==1) 1
        else n * factorial(n-1)
}

println(factorial(66))
println(factorial(100))
//for larger numbers it would through an stackoverflow error

println("tail recursion demo in scala")
//annotation used at runtime.

//tail call optimization demo
@scala.annotation.tailrec
def tfactorial(n:BigInt,acc:BigInt):BigInt ={
    if(n==0| n==1) acc
        else tfactorial(n-1,acc*n)
}

println(tfactorial(1000,1))

//methods inside methods 

def mfactorial(n:Int)={
    @tailrec 
    def fact(n:BigInt, acc:BigInt):BigInt={
        if(n==0|| n==1) acc 
            else fact(n-1,acc*n)
    }
    fact(n,1)
}


println(mfactorial(256))


//method overloading 
def myaddition(x:Int) =x+123123
def myaddition(y:Double)=y+1238712.0
def myaddition(z:String)=z+19

println(myaddition(20))
println(myaddition(121328.0))
println(myaddition("addit damnit "))


//named arguments 
def computeSalary(isEmployee:Boolean=true, noWorkDays:Double,hourlyRate:Double,taxDed:Double=0.18 ):Double={
    var salary:Double=0.0
    if(isEmployee)  (noWorkDays*hourlyRate*8.0)-(noWorkDays*hourlyRate*8.0)*0.18
        else salary
        
}


println("salary is:"+computeSalary(noWorkDays=22, hourlyRate=60))
