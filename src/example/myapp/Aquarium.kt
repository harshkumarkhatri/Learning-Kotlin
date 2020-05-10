package example.myapp

import sun.security.util.Length
import kotlin.math.PI

//This is the example of making the class
//class Aquarium(length:Int=22,width:Int=33,height:Int=44) {
//
//    var width:Int=width
//    var height: Int=height
//    var length:Int=length
//    fun printSize(){
//        println("Width $width"+
//        "Length $length"+
//        "heigh $height")
//        println("Volume is $voulume")
//    }
//    init {
//        println("Volume: ${width * length * height / 1000} l")
//    }
//    constructor(numberOfFish:Int):this(){
//        val tank=numberOfFish*2000*1.1
//        height=(tank/(length*width)).toInt()
//    }
////  This is a getter method with the help of which we can get the value and assign to to some other variable.
//    var voulume:Int
//    get() = width*height*length/1000
////    if we set the setter to private then it can only be readable outside the class/
//    set(value){
//        height=(value*1000)/(width*length)
//    }

//making a class and its subclass with open keyword
open class Aquarium (open var length: Int=100,open var height:Int =40,open var width:Int=20){
    open var volume:Int
    get()=width*height*length/1000
    set(value){
        height=(value*1000)/(width*length)
    }
    open var shape="rect"
    open var water:Double =0.0
    get()=volume*0.9
    fun printSize(){
        println(shape)
        println("width $width"+"lwngth $length"+"heigh $height")
        println("Volume $volume and watr $water")
    }
}
class TowerTank(override var height: Int,var diameter:Int):Aquarium(height=height,width = diameter,length = diameter){
    override var volume:Int
        get()=(width/2*length/2*height/1000* PI).toInt()
    set(value) {
        height=((value*1000/PI)/(width/2*length/2)).toInt()
    }
    override var water=volume*0.8
    override var shape="cylinder"
}