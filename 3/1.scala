object RevString{
	
	def reverse(input:String):String = {
		if(input.isEmpty)
			""
		else
			reverse(input.tail) + input.head
}

	def main(args:Array[String])={
		var str:String = args(0)
		println("Reversed String: " + reverse(str))
}
}
