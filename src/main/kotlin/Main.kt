fun main() {

    val high=getHighestSCore(students)
    println(high)
    sorting(people)
    filtered(people)
    added(people)
    removing(people)







}

data class Student(val name:String,val age:Int,val grade:Double)
val students= listOf(
    Student("RITA",20,60.0),
    Student("leila",10,70.0),
    Student("keza",15,80.0),
    Student("kyla",14,56.0),
    Student("amanda",23,80.0)
)
fun getHighestSCore(list:List<Student>):List<Student>{
    return students.filter { student ->student.grade>=70  }}

//Create a data class Person with properties name and age. Then,
// create a list of Person objects and perform the following operations:
//Add a new Person object to the list.
//Remove the Person object with the highest age from the list.
//Sort the list by name.
//Filter the list to only include Person objects whose age is greater than or equal to 18.
data class Person(val name:String,val age:Int)
var people= mutableListOf(
    Person("kiya",21),
    Person("rIrI",20),
    Person("trish",17)
)
fun added(list:List<Person>){
    people.add(Person("arlette",24))
    println(people)
}
fun sorting(list:List<Person>) {
    var sort = people.sortedBy { person -> person.name }
    println(sort)
}
fun filtered(list:List<Person>) {
    var filtering = people.filter { person -> person.age >= 18 }
    println(filtering)
}
fun removing(list:List<Person>){
    people.removeIf { person-> person.age >=24 }
    println(people)
}