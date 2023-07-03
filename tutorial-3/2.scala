object StrFilter{

	def filterS(list:List[String]):List[String] = {
		list.filter(_.length > 5)
		}
	def main(args:Array[String])={
		val list:List[String] = List("abc","cat","human","rabbit","fish","elephant")
		println("Strings: "+ filterS(list).mkString(" "))
	}
}
	
				
