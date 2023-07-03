object Names{
	def toUpper(s:String):String = s.toUpperCase()
	def toLower(s:String):String = s.toLowerCase()

	def formatName(name:String)(formatN: String => String):String = formatN(name);

	def main(args:Array[String])={
		println(formatName("Benny")(toUpper(_)));
		println(formatName("Ni")(toUpper(_)) +"roshan");
		println(formatName("Saman")(toLower(_)));
		println("Kumar" + formatName("a")(toUpper(_)));
	}

}
