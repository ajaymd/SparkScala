object LearningScala2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(141); 
  // Flow control
  
  // If / else syntax
  if (1 > 3) println("Impossible!") else println("The world makes sense.");$skip(96); 
  
  if (1 > 3) {
  	println("Impossible!")
  } else {
  	println("The world makes sense.")
  };$skip(69); 
  
  // Matching - like switch in other languages:
  val number = 30;System.out.println("""number  : Int = """ + $show(number ));$skip(146); 
  number match {
  	case 1 => println("One")
  	case 2 => println("Two")
  	case 3 => println("Three")
  	case _ => println("Something else")
 	};$skip(87); 
 	
 	// For loops
 	for (x <- 1 to 8) {
 		val squared = x * x
 		println(squared)
 	};$skip(81); 
                                                  
  // While loops
  var x = 10;System.out.println("""x  : Int = """ + $show(x ));$skip(47); 
  while (x >= 0) {
  	println(x)
  	x -= 1
  };$skip(63); 
                                                  
  var y = 0;System.out.println("""y  : Int = """ + $show(y ));$skip(12); 
  var j = 0;System.out.println("""j  : Int = """ + $show(j ));$skip(49); 
  do { println(y+j); j=y; y+=1 } while (y <= 10);$skip(154); val res$0 = 
                                                  
   // Expressions
   // "Returns" the final value in a block automatically
   
   {val x = 10; x + 20};System.out.println("""res0: Int = """ + $show(res$0));$skip(82); 
                                                
	 println({val x = 10; x + 20});$skip(260); 

  // EXERCISE
  // Write some code that prints out the first 10 values of the Fibonacci sequence.
  // This is the sequence where every number is the sum of the two numbers before it.
  // So, the result should be 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
  var a = 0;System.out.println("""a  : Int = """ + $show(a ));$skip(12); 
  var b = 1;System.out.println("""b  : Int = """ + $show(b ));$skip(12); 
  var i = 0;System.out.println("""i  : Int = """ + $show(i ));$skip(131); 
  while (i < 10) {
    if (i == 0)
      println(a);
    val c = a + b;
    a = b;
    b = c;
    println(a + ",")
    i += 1;
  }}
	   
}
