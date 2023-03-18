// Type

fun main() {
  val testList1 = ArrayList<String>()
  testList1.add("a")
  testList1.add("b")
  testList1.add("c")
  println(testList1)
  println(testList1[0])
  println(testList1[1])
  println(testList1[2])
  println(testList1::class.java.simpleName)


  val testList2 = listOf("a", "b", "c")
  println(testList2)
  println(testList2::class.java.simpleName)

  val testList3 = mutableListOf<String>("a", "b", "c")
  println(testList3)
  println(testList3::class.java.simpleName)


  // Filtering
  val testList4 = listOf("student1", "student2", "student3", "student4", "teacher1", "student5")
  println(testList4)
  println(testList4.filter { it.startsWith("s") })

  val testList5 = listOf("student1", "student2", "student3", "student4", "teacher1", "student5", null)
  println(testList5)
  // println(testList5.filter { it.startsWith("s") }) // null이 있으면 에러가 난다.
  println(testList5.filterNotNull().filter { it.startsWith("s") })


  var test1 : String = "a"
  var test2 : String = "b"
  test1 = test2;
  println(test1) // OK

  var test3 : String = "c"
  var test4 : String? = "d"
  test3 = test4!!




}
