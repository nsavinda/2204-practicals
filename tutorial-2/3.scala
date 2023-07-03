object Salary{

	def normalPay(hours:Int):Double = hours * 250;
	def OTPay(hours:Int):Double = hours * 85;
	def takeHomeSalary(salary:Double):Double = salary * 88/100;
	
	def main(args:Array[String])={
		printf("Take Home Salary: Rs %.2f ",takeHomeSalary(normalPay(40) + OTPay(30)))
		
		}

}
