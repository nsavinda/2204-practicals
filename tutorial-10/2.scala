object Occurrences{

    def countLetterOccurrences(words: List[String]): Int = {
        val counts = words.map(_.length)
        val totalOccur = counts.reduce((a, b) => a + b)
        totalOccur
    }

    def main(args: Array[String]): Unit = {
        val wordList = List("apple", "banana", "cherry", "date")
        val totalOccurrences = countLetterOccurrences(wordList)
        println(s"Total letter occurrences: $totalOccurrences")
  }
}