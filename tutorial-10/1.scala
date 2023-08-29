object Temperature{

    def calculateAverage(temperatures: List[Double]): Double = {
        val tempF = temperatures.map(celsius => (celsius * 9/5) + 32)
        val sumtempF = tempF.reduce((a, b) => a + b)
        val avgTemp = sumtempF / tempF.length
        avgTemp
    }

    def main(args: Array[String]): Unit = {
        val tempC = List(0.0, 10.0, 20.0, 30.0)
        val avgT = calculateAverage(tempC)
        println(s"Average Fahrenheit temperature: $avgT")
  }
}