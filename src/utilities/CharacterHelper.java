package utilities;

public class CharacterHelper {



  public static boolean isSpace(char space){
    return space == 32;
   }
   public static boolean isDigit(char digitFromA){
    return digitFromA >= 48 && digitFromA <=57;
  }

  public static boolean isUppercase(char uppercaseLetter){
    return uppercaseLetter >= 65 && uppercaseLetter <= 90;
  }

  public static boolean isLowercase(char lowercaseLetter){
    return lowercaseLetter >= 97 && lowercaseLetter <= 122;
  }

  public static boolean isLetter(char uppercaseLetter, char lowercaseLetter){
    return uppercaseLetter >= 65 && uppercaseLetter <= 90 || lowercaseLetter >= 97 && lowercaseLetter <= 122;
    //return isUppercase (uppercase) || isLowercase(lowercaseLetter)
    //when it static and you are within the same class dont have to invoke using class
  }

 public static boolean isVowel(char vowelLetter){
    return vowelLetter == 61 || vowelLetter == 69 || vowelLetter == 79 || vowelLetter == 85 || vowelLetter == 73
      || vowelLetter == 97 || vowelLetter == 101 || vowelLetter == 111 || vowelLetter == 117 || vowelLetter == 105;

  }
  public static boolean isConsonant(char cLetter){
  return cLetter >= 65 && cLetter <=68 || cLetter >=70 && cLetter <= 72 || cLetter >= 74 && cLetter <= 78 ||
    cLetter >= 80 && cLetter <= 84 || cLetter >=86 && cLetter <= 88 || cLetter == 90 ||cLetter >= 98 &&
    cLetter <= 100 || cLetter >= 102 && cLetter <= 104 || cLetter >= 106 && cLetter <= 110 || cLetter >= 112 &&
    cLetter <= 116 || cLetter >= 118 && cLetter <= 120 || cLetter == 122;

  // isLetter (cLetter) && !isVowel(cLetter)




  }



}
