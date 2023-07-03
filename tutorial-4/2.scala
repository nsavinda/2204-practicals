object PatternMatching{

	def patternMatch(n:Int):String = if (n<0) "Negative" else if (n==0) "Zero" else if (n%2==0) "Even number" else "Odd number"; 

	def main(args:Array[String])={
		println(patternMatch(args(0).toInt));
	}



}
