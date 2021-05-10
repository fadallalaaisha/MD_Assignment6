//Create a function called isEven( ) that returns true when the number
// passed to it is even or returns false when the number passed to it is odd
fun isEven(number:Int ):Boolean{
    if (number%2==0)
        return true

        return false
}
//question2
data class Goods(var name:String,var weight:Int,var price:Int, var category:String)

fun product(){
    var category="fruits"
    when (category){
        "items"-> println("groceries are pens,books,laptops,computers")
        "fruits"-> println("groceries are mangoes,apple,tomatoes")
        "service"-> println("grocery is airtime")
        else-> println("It is not there.")
    }
}
//question3
fun evenIndices(even:String):String{
    var name=""
    for (word in even) {
        if (even.indexOf(word)%2==0) {
            name+=word
        }
    }
    return name
}
//question4
fun countries(place:Array<String>):String{
    var listOfCountry= mutableListOf<String>()
    for (area in place){
        if (area.length%2==0){
            listOfCountry.add(area)
        }
    }
    return listOfCountry
}
fun main() {
    println(isEven(4))
    println(isEven(7))
    println(isEven(88))

var goods=Goods("pens",22,100,"fruit")
    goods.category
    product()

    evenIndices("bananaz")
    println(evenIndices("banana"))
    println(evenIndices("school"))
    println(evenIndices("sandra"))

    //println(countries("sudan","juba"))
}