class convertoctaltodecimal {
    public static void main(String[] args) {
      long num = 116;
      int decimalNumber = 0, i = 0;
      long remainder;
      long temp =num;
      while (num != 0) {
        remainder = num % 10;
        num /= 10;
        decimalNumber += remainder * Math.pow(8, i);
        ++i;
      }
      System.out.println("Binary to Decimal");
      System.out.println(temp + " = " +decimalNumber);
    }
  }