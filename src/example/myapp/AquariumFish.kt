package example.myapp

//Using abstract classes
//abstract class AquariumFish {
//    abstract val color:String
//}
//class Shark:AquariumFish(),FishAction{
//    override val color="gray"
//    override fun eat(){
//        println("shar is humgry")
//    }
//}
//class ple:AquariumFish(),FishAction{
//    override val color="golg"
//    override fun eat() {
//        println("ple ko khana do")
//    }
//}

//using interfaces instead of abstract classes
interface FishAction{
    fun eat()
}

interface FishColor{
    val color:String
}
//class ple:FishColor by GoldColr,FishAction{
//    override fun eat() {
//        println("Need food")
//    }
//}
class ple(fishColor: FishColor=GoldColr):FishAction by PrintingFishAction("eat algay"),FishColor by fishColor{
//    override fun eat(){
//        println("Eat foody")
//    }
}
class Shark :FishColor,FishAction{
    override val color="gray"
    override fun eat() {
        println("hunt and kha")
    }
}

class PrintingFishAction(val food:String):FishAction{
    override fun eat(){
        println(food)
    }
}

object GoldColr:FishColor{
    override val color="gold"
}