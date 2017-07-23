package net.orcstorm.arkham

object Tokens {
  val specialTokens: Map[Int, String] = Map(-100 -> "skull", -200 -> "cultist", -300 -> "tablet", -400 -> "cthulhu", -500 -> "elder sign" )
  
  val zealotEasy = ("Night of the Zealot - Easy" -> Vector(1,1, 0,0,-1, -1, -1, -2, -2, -100, -100, -200, -300, -400, -500)) 
  val zealotStandard = ("Night of the Zealot - Standard" -> Vector(1, 0,0,-1, -1, -1, -2, -2, -3, -4, -100, -100, -200, -300, -400, -500)) 
  val zealotHard = ("Night of the Zealot - Hard" -> Vector(0,0,0,-1,-1,-2, -2, -3, -3, -4, -5, -100, -100, -200, -300, -400, -500)) 
  val zealotExpert = ("Night of the Zealot - Expert" -> Vector(0,-1, -1, -2, -2, -3, -3, -4, -4, -5, -6, -100, -100, -200, -300, -400, -500)) 

  val scenarios = Map(1 -> zealotEasy, 2 -> zealotStandard, 3 -> zealotHard, 4 -> zealotExpert)
}