open class Car(var make:String, var model:String, var color:String,var capacity:Int){ //open helps me to inherite something
    fun carry(people:Int){
        if(people<=capacity){
            println("You are carrying $people passengers") }
        else{
            var x=people-capacity   // if the passengers is more NOof capacity the car is carrying over capacity.
            println("over capacity")
        } }
    fun identity(){
        println("I am $color,$make,$model ")
    }
    open fun calculateParkingFees(hours: Int):Int{
        return hours*20
    }
}
class Bus(make: String,model: String,color: String,capacity: Int):Car(make,model,color,capacity){
    fun maxTripFare(fare: Double):Double{
        return fare*capacity
    }

    override fun calculateParkingFees(hours: Int): Int {
        return hours*20
    } }
fun main() {
   var car= Car("Kenya","Toyota","blue",25)
    println(car.capacity)
    car.carry(25)
    car.carry(55)
    car.identity()
    println(car.calculateParkingFees(11))

    //for Bus
    var bus=Bus("Sudan","Gagri","white",30)
    println(bus.maxTripFare(30.5))
    bus.carry(32)
    bus.carry(66)
    bus.identity()
    println(bus.calculateParkingFees(22))

}