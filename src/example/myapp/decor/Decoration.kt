package example.myapp.decor

data class Decoration(val rocks:String) {

}
data class decoration2(val rocks:String,val wood:String,val driver:String){

}

fun makeDecorations(){
//    Make decorations for part1
//    val decoration1=Decoration("granote")
//    println(decoration1)
//    val decoration2=Decoration("slate")
//    println(decoration2)
//    val decoration3=Decoration("slate")
//    println(decoration3)
//    println(decoration1.equals(decoration2))
//    println(decoration2.equals(decoration3))

//    make decoration for part2

    val d5=decoration2("grysat","wood","driever")
    println(d5)
    val (rock,wood,driver)=d5
    println(rock)
    println(wood)
    println(driver)

}
enum class Color(val rgb:Int){
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
}

fun main(){
    makeDecorations()
    println(Color.RED)
}