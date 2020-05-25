object LearningScala2 {
  // Flow control
  
  // If / else syntax
  if (1 > 3) println("Impossible!") else println("The world makes sense.")
                                                  //> The world makes sense.
  
  if (1 > 3) {
  	println("Impossible!")
  } else {
  	println("The world makes sense.")
  }                                               //> The world makes sense.
  
  // Matching - like switch in other languages:
  val number = 30                                 //> number  : Int = 30
  number match {
  	case 1 => println("One")
  	case 2 => println("Two")
  	case 3 => println("Three")
  	case _ => println("Something else")
 	}                                         //> Something else
 	
 	// For loops
 	for (x <- 1 to 8) {
 		val squared = x * x
 		println(squared)
 	}                                         //> 1
                                                  //| 4
                                                  //| 9
                                                  //| 16
                                                  //| 25
                                                  //| 36
                                                  //| 49
                                                  //| 64
                                                  
  // While loops
  var x = 10                                      //> x  : Int = 10
  while (x >= 0) {
  	println(x)
  	x -= 1
  }                                               //> 10
                                                  //| 9
                                                  //| 8
                                                  //| 7
                                                  //| 6
                                                  //| 5
                                                  //| 4
                                                  //| 3
                                                  //| 2
                                                  //| 1
                                                  //| 0
                                                  
  var y = 0                                       //> y  : Int = 0
  var j = 0                                       //> j  : Int = 0
  do { println(y+j); j=y; y+=1 } while (y <= 10)  //> 0
                                                  //| 1
                                                  //| 3
                                                  //| 5
                                                  //| 7
                                                  //| 9
                                                  //| 11
                                                  //| 13
                                                  //| 15
                                                  //| 17
                                                  //| 19
                                                  
   // Expressions
   // "Returns" the final value in a block automatically
   
   {val x = 10; x + 20}                           //> res0: Int = 30
                                                
	 println({val x = 10; x + 20})            //> 30

  // EXERCISE
  // Write some code that prints out the first 10 values of the Fibonacci sequence.
  // This is the sequence where every number is the sum of the two numbers before it.
  // So, the result should be 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
  var a = 0                                       //> a  : Int = 0
  var b = 1                                       //> b  : Int = 1
  var i = 0                                       //> i  : Int = 0
  while (i < 10) {
    if (i == 0)
      println(a);
    val c = a + b;
    a = b;
    b = c;
    println(a + ",")
    i += 1;
  }                                               //> 0
                                                  //| 1,
                                                  //| 1,
                                                  //| 2,
                                                  //| 3,
                                                  //| 5,
                                                  //| 8,
                                                  //| 13,
                                                  //| 21,
                                                  //| 34,
                                                  //| 55,
	   
}