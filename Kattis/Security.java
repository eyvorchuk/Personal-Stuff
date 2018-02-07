import java.util.*;
import java.io.*;

public class Security {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while(in.hasNext()) {
      String code = in.next();
      String encrypt = "";
      int[] char_lengths = new int[4000];
      int totLength = 0;
      for (int i = 0; i < code.length(); i++) {
        String symbol = getSymbol(code.charAt(i));
        encrypt += symbol;
        char_lengths[i] = symbol.length();
        totLength += symbol.length();
      }
      for (int i = 0; i < code.length() / 2; i++) {
        int temp = char_lengths[i];
        char_lengths[i] = char_lengths[code.length() - i - 1];
        char_lengths[code.length() - i - 1] = temp;
      }
      int char_count = 0;
      String decode = "";
      for (int i = 0; i < code.length(); i++) {
        String symbol = "";
        for (int j = 0; j < char_lengths[i]; j++) {
          symbol += encrypt.charAt(char_count);
          char_count++;
        }
        decode += getChar(symbol);
      }
      System.out.println(decode);
    }
  }

  public static String getSymbol(char letter) {
    switch (letter) {
      case 'A': return(".-");
      case 'B': return("-...");
      case 'C': return("-.-.");
      case 'D': return("-..");
      case 'E': return(".");
      case 'F': return("..-.");
      case 'G': return("--.");
      case 'H': return("....");
      case 'I': return("..");
      case 'J': return(".---");
      case 'K': return("-.-");
      case 'L': return(".-..");
      case 'M': return("--");
      case 'N': return("-.");
      case 'O': return("---");
      case 'P': return(".--.");
      case 'Q': return("--.-");
      case 'R': return(".-.");
      case 'S': return("...");
      case 'T': return("-");
      case 'U': return("..-");
      case 'V': return("...-");
      case 'W': return(".--");
      case 'X': return("-..-");
      case 'Y': return("-.--");
      case 'Z': return("--..");
      case '_': return("..--");
      case '.': return("---.");
      case ',': return(".-.-");
      default: return("----");
    }
  }

  public static char getChar(String symbol) {
    switch (symbol) {
      case ".-": return('A');
      case "-...": return('B');
      case "-.-.": return('C');
      case "-..": return('D');
      case ".": return('E');
      case "..-.": return('F');
      case "--.": return('G');
      case "....": return('H');
      case "..": return('I');
      case ".---": return('J');
      case "-.-": return('K');
      case ".-..": return('L');
      case "--": return('M');
      case "-.": return('N');
      case "---": return('O');
      case ".--.": return('P');
      case "--.-": return('Q');
      case ".-.": return('R');
      case "...": return('S');
      case "-": return('T');
      case "..-": return('U');
      case "...-": return('V');
      case ".--": return('W');
      case "-..-": return('X');
      case "-.--": return('Y');
      case "--..": return('Z');
      case "..--": return('_');
      case "---.": return('.');
      case ".-.-": return(',');
      default: return('?');
    }
  }
}
