object Cost{

def itemCost(count:Int, price:Double):Double = price * count
def discount(count:Int, price:Double):Double = price * count * (40.0/100.0) 
def shipCost(count:Int, cost:Double):Double = count * cost

def main(args:Array[String])={
	var count = 60
	var price = 24.95
	if (count > 50){
		printf("Total Cost: %f\n", itemCost(count, price) - discount(count, price) + shipCost(50,3.0) + shipCost(count-50, 0.75))
	}else{
		printf("Total Cost: %f\n", itemCost(count, price) - discount(count, price) + shipCost(50,3.0))
	}
}
}


