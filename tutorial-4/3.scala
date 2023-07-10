object Names{
	def toUpper(s:String):String = s.toUpperCase()
	def toLower(s:String):String = s.toLowerCase()

	def formatName(name:String)(formatN: String => String):String = formatN(name);

	var n1 = "Benny";
	var n2 = "Niroshan";
	var n3 = "Saman";
	var n4 = "Kumara";

	def main(args:Array[String])={
		println(formatName(n1)(toUpper(_)));
		println(formatName(n2.take(2))(toUpper(_)) + n2.drop(2));
		println(formatName(n3)(toLower(_)));
		println(n4.take(5) + formatName(n4.drop(5))(toUpper(_)));

	}

}
