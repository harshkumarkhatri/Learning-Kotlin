package example.myapp

data class Fish(var name:String)
fun fishExamples(){
    val fish=Fish("splashy")
    myWith(fish.name){
        println(this.capitalize())
    }
    fish.run { name }
    myWith(fish.name, object : Function1<String, Unit> {
        override fun invoke(name: String) {
            name.capitalize()
        }
    })
    fish.name.capitalize()
}

fun myWith(name:String,block :String.()->Unit){
    name.block()
}
//inline myWith(fish.name){
//    capitalize()
//}
fun main(){
    fishExamples()

}