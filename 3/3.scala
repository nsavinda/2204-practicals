object Mean{
	
	def avg(num1:Int,num2:Int):Float = (num1.toFloat + num2.toFloat)/2
	
	def main(args:Array[String]) = {
		printf("Average: %.2f \n", avg(46, 81))
		}
}
