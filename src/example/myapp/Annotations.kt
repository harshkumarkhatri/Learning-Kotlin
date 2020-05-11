package example.myapp

import com.sun.org.apache.xpath.internal.operations.Bool
import kotlin.reflect.full.declaredFunctions
import kotlin.reflect.full.findAnnotation

//@ImAPlant class Plant{
//    fun trim(){}
//    fun fertilize(){}
//}

fun testAnnotations(){
//    val classObj=Plant::class
//    for(m in classObj.declaredFunctions){
//        println(m.name)
//    }
    val plantObject=Plant::class
//    for(a in plantObject.annotations){
//        println(a.annotationClass.simpleName)
//    }
    val myAnnotationObject=plantObject.findAnnotation<ImAPlant>()
    println(myAnnotationObject)
}
annotation class ImAPlant
@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGET
@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet
@ImAPlant class Plant{
    @get:OnGET
    val isGrowing:Boolean=true
    @set:OnSet
    var needsFood:Boolean=false
}
fun labels(){
    outerloop@ for (i in 1..100){
        print("$i")
        for (j in 1..100){
            if(i>10) break@outerloop //breaks us out of the outer loop
        }
    }
}
fun main(){
//    testAnnotations()
    labels()
}
