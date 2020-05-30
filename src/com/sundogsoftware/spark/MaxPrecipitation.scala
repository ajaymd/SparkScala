package com.sundogsoftware.spark
import org.apache.spark._
import org.apache.log4j._
import org.apache.spark.SparkContext._
import scala.math.max

/** find max temp */
  
object MaxPrecipitation{
    def parseLine(line: String) = { 
    val fields = line.split(",")
    val day = fields(1)
    val entryType = fields(2)
    val prcp = fields(3)
    (day,entryType, prcp)
  }
  
  /** our main func. where the action happend */
  def main(args : Array[String]) { 
    //set the log level to print error
    Logger.getLogger("org").setLevel(Level.ERROR)
   
   // create a sparkcontext using every code of the local machine
    val sc = new SparkContext("local[*]","MaxPRCP")
    
    //Read each line of input data
    val lines = sc.textFile("./1800.csv")
    
    // Conver to (date, entryType , prcp inch) tuples
    val parsedLines = lines.map(parseLine)
    
    //Filter out all but PRCP entries
    val prcpInch = parsedLines.filter(x=>x._2 == "PRCP")
    
    
val results = lines.map(x => x.split(","))
    .filter(x => x(2) == "PRCP")
      .map(x => (x(1), Integer.parseInt(x(3))))
      .reduce((x,y) => if(x._2 > y._2) x else y)
     println(results)

  }
  
}