 fun main() {
//  1.Given a string “akirachix”. Write a function that prints out a string composed of
//  the first, third and fourth characters of the string

  var word= "akirachix"
  var letters= word[0].toString() + word[2] + word[3]
  println(letters)

// 2.Write a function that takes in 2 parameters, name and age and returns a
//String with this structure “Hi, my name is x, and I am y years old.” Where x and
//y are the provided name and age respectively.
  var name = "Chepkoech"
  var age = 12
  val message = "Hi"
  println("$message my name is $name and I am $age years old")
// 3.Write a function that takes in a String and returns i
// ts length
 var x = "potatochips"
 var z = (x.length)
println("The String has $z characters.")
//  4.Write a function that takes in a name and prints out “That’s me!” when your
//name is passed to it, otherwise it prints out “I don’t know who that is”
  val identity = "Chepkoech"
  if ("Chepkoch" in identity )
  {println("That's me!")}
  else{
   println("I don't know who that is.")}
 }
