fun oddNumbers(){
    for(x in 1..100 step 2) {
        println(x)
    }
}
fun name(names:Array<String>):Int{
    var count=0;
   for(y in names){
        if(y.length>5){
           count++;
        }
    }
    return count
}
fun servePeople(age:Int){
   if (age<=6){
        println("Milk")
    }else if (age<=15){
        println("Fanta orange")
    }else{
        println("Coca cola")}
}
fun combine(){
    for (number in 1..100){ //prints numbers from 1..100
   if (number %3==0 ){
      println("Fizz")
    }
  else if (number%5==0) {
       println("Buzz")}
        else if (number %3==0 && number %5==0)
        {
            println("FizzBuzz")}
  else {
      println(number)
   }
   }
}
fun main() {
    oddNumbers()                 //calling question 1
    name(arrayOf("sara","Vero","Papai","Brenda"))  //calling question 2
    servePeople(3)
    servePeople(16)
    servePeople(14)

    combine()
}