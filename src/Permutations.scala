/**
  * Created by hkdulay on 4/4/17.
  */
object Permutations extends App{


  permute("abcd")


  def permute(remaining: String, sofar: String = ""): Unit = {

    if(remaining.isEmpty) {
      println(sofar)
    }

    for(i <- 0 until remaining.length) {

      val c = remaining.charAt(i);

      permute(removeChar(remaining, c), sofar + c)
    }
  }

  def removeChar(string: String, c: Char): String = {
    val pos = string.indexOf(c)
    string.substring(0, pos) + string.substring(pos + 1, string.length)
  }

}
