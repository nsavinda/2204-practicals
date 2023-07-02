object Interest{
	
	def interest(deposit:Double):Double = if(deposit<=20000)  deposit * 0.02 else  if(deposit<=200000) deposit * 0.04 else if(deposit<=2000000) deposit * 0.035 else deposit * 0.065; 
	
	def main(args:Array[String])={
		printf("Interest: %.2f\n" , interest(args(0).toDouble))
	}
}
