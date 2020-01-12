// Copyright 2016 Syed Awase Khirni TPRI/SYCLIQ awasekhirni@gmail.com sak@territorialprescience.com 
//classes in scala 

import scala.beans.BeanProperty 

class Product(@BeanProperty val productName:String, @BeanProperty var productPrice:Double,var productIsOnSale:Boolean){

    //atypical form 
    def this(productName:String, productPrice:Double)={this(productName, productPrice,true)}
    //auxilary constructor Typical form 
    def this(productName:String, productPrice:Double)=this(productName,productPrice,true)
}

class Company(@BeanProperty var companyName:String ,@BeanProperty var companyAddress:String, var isCompanyActive=true)