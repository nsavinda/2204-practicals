object FormatNames {

  val toUpper: String => String = my_string => my_string.map { c =>
    if (c.isLower) c.toUpper else c
  }

  val toLower: String => String = my_string => my_string.map { c =>
    if (c.isUpper) c.toLower else c
  }

  def formatNames(name: String, format_func: String => String): String = {
    format_func(name)
  }

  def main(args: Array[String]): Unit = {
    println(formatNames("Benny", toUpper))
    println(formatNames("Ni", toUpper) + formatNames("roshan", toLower))
    println(formatNames("Saman", toLower))
    println(formatNames("K", toUpper) + formatNames("umar", toLower) + formatNames("a", toUpper))
  }


}