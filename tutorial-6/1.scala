object CaesarCipher {

  def caesarCipherEn(plainText: String, shift: Int): String = {
    val encryptedText = plainText.map { char =>
      if (char.isLetter) {
        val isUpper = char.isUpper
        val shiftedChar = (char.toUpper.toInt + shift - 'A'.toInt) % 26 + 'A'.toInt
        if (isUpper) shiftedChar.toChar else shiftedChar.toChar.toLower
      } else {
        char
      }
    }
    encryptedText.mkString
  }

    def caesarCipherDe(plainText: String, shift: Int): String = {
    val encryptedText = plainText.map { char =>
      if (char.isLetter) {
        val isUpper = char.isUpper
        val shiftedChar = (char.toUpper.toInt - shift - 'A'.toInt + 26) % 26 + 'A'.toInt
        if (isUpper) shiftedChar.toChar else shiftedChar.toChar.toLower
      } else {
        char
      }
    }
    encryptedText.mkString
  }

  def cipher(operation: Int, shift: Int, text: String): String = {
    if (operation == 1)  caesarCipherEn(text, shift) else if (operation == 2)  caesarCipherDe(text,shift) else "Invalid Option";
  }
  
// Command line arguments -> Operation(1=encrypt, 2=decrypt)  Shift  Text 
// (1 4 "THis IS TeXt")
  def main(args: Array[String]): Unit = {
    println(cipher(args(0).toInt,args(1).toInt,args(2)))
  }
}
