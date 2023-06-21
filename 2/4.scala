object BestTicketPrice{

	def cost(attendance:Int):Double = attendance * 3 + 500;
	def profit(attendance:Int, price:Double):Double = (attendance * price) - cost(attendance);


	def main(args:Array[String])= {
		if(profit(140,10)<profit(100,20)){
			println("Best price: Rs 20");
		}else{
			println("Best price: Rs 10");
		}


}



}
