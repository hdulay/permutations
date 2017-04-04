/**
  * Created by hkdulay on 4/4/17.
  */
object Permutations extends App{


  permute("abcd")


  def permute(remaining: String, sofar: String = ""): Unit = {

    if(remaining.isEmpty) {
      println(sofar)
    }

    for(i <- 0 until remaining.length ) {
      permute(removeChar(remaining, i), sofar + remaining.charAt(i))
    }
  }

  def removeChar(string: String, pos: Int): String = {
    string.substring(0, pos) + string.substring(pos + 1, string.length)
  }

}
