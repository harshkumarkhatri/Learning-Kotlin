package example.myapp

fun buildAquarium(){
//    These are for the basic class which we have created
//    val myAquarium=Aquarium()
//    myAquarium.printSize()
//    myAquarium.height=99
//    myAquarium.printSize()
////    setting custom height to the constructor
//    val aquarium2=Aquarium(height = 244)
//    aquarium2.printSize()
//    val aquarium3=Aquarium(numberOfFish = 25)
//    aquarium3.printSize()
//    println("Volume: ${aquarium3.width * aquarium3.length * aquarium3.height / 1000} l")
//    aquarium3.voulume=0
//    aquarium3.printSize()

//    Creating a subclass with open keyword.
    val aquarium=Aquarium(length = 1,width = 1,height = 1)
    aquarium.printSize()
    val myTower=TowerTank(diameter = 25,height = 40)
    myTower.printSize()
}
fun main(){
    buildAquarium()
}