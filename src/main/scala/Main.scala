package net.orcstorm.arkham

object Main extends App {

  import net.orcstorm.arkham.Tokens._

  println("Arkham Horror LCG Chaos Bag Sim")

  println("scenarios available: ")
  scenarios.foreach{ scenario => 
  	println(s"  ${scenario._1}. ${scenario._2._1}") 
  }
  
  print("Enter the number of the scenario you'd like to configure: ")
  val scenarioChoice = scala.io.StdIn.readLine()
  val scenario = scenarios(scenarioChoice.toInt)
  println(s"You have configured scenario: ${scenario._1}")
  val bag = scenario._2
  //demonstrate(scenario._2)
  tokenLoop()

  def tokenLoop() {
    print("Enter '1' to pull a token from the bag, enter '0' to exit: ")
    val pull = scala.io.StdIn.readLine

    pull.toInt match {
  	  case 0 => System.exit(0)
  	  case 1 => { 
  	  	pullToken(bag)
  	  	tokenLoop()
  	  }
    }
  }

  def pullToken(bag: Vector[Int]) {
  	val r = scala.util.Random
  	val token = bag(r.nextInt(bag.size))
  	getResult(token)
  }

  def getResult(token: Int) { 
  	specialTokens.contains(token) match {
  	  case true => println(s"you pulled a ${specialTokens(token)}")	
  	  case false => println(s"you pulled a ${token}")
  	}
  }

}