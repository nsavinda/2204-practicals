object Temp{

def fahrenheit(temp:Double):Double = temp * 1.8 + 32.0

def main(args:Array[String])={
	printf("Fahrenheit: %f\n",fahrenheit(35))
}
}
