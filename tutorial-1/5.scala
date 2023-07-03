object TotalRunningTime{

def runningTime(distance:Double, time:Double) = distance*time

def main(Args:Array[String])={
	printf("Total Running Time: %f\n", runningTime(2, 8) + runningTime(3, 7) + runningTime(2,8))
}
}
