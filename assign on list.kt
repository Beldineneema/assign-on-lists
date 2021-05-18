fun main(){
println(names(listOf("Beldine", "Neema","Domnic","Juma","Jane","Rose","Caren","Pamela","Scovia","Beryl")))
println(height(listOf(2,3,4,1,3,3,1)))
    var person= mutableListOf<Person>(
        Person("Dorothy",21,49.5, 1.2),
        Person("Kay",20, 57.9, 1.8),
        Person("Cythia",24,52.0,1.8)
    )

    sorted(person)
    person1()
    var cars=(mutableListOf<Car>(
        Car("KCT-678",12000),
        Car("KDB-684",14000),
        Car("KPA-678",6000),

        ))
    println(carList(cars))


}
fun names(nameList:List<String>):List<String> {
    var name = listOf<String>()
    nameList.forEachIndexed { index, element ->
        if (index % 2 == 0) {
            name+=element

        }
    }
    return name
}
fun height(heights:List<Int>): Pair<Int,Double>{
    var sum = heights.sum()
    var avg = heights.average()

    return Pair(sum, avg)
}

data class Person(var name:String,var age:Int,var weight:Double,var height:Double)
 fun sorted(person:MutableList<Person>){
     var sortedPerson=person.sortedByDescending { person->person.age }
     println(sortedPerson)
     }
data class People(var name:String, var age:Int, var weight:Double, var height:Double)
fun person1 (){
    var person= mutableListOf(
        People("Dorothy", 21,49.5,1.2),
        People("Kay", 20,57.9,1.8),
        People("Cythia",24,52.0,1.8)
    )
    person.addAll(mutableListOf(
        People("Shadya",20,60.0,1.5,),
        People("Beldine",21,58.9,2.1)
    )
    )
    println(person)
}
data class Car(var registration:String,var mileage:Int)
fun carList(cars:List<Car>):Int{

    var total=0
    for (car in cars){
       total+=car.mileage
    }
    val avg=total/cars.size
    return avg
}

