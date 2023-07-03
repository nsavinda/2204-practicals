object Volume{

def volume(radius:Double):Double = (4.0/3.0) * 3.14 * radius * radius * radius

def main(args:Array[String])={
	printf("Volume: %f\n",volume(5))
}
}
