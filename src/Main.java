class resuction {
    int funct(int n) {
    int result;
    result = funct(n -1);
    return result;
    }
}


class Output {
 public static void main(String[] args) {
  resuction resuction = new resuction();
  System.out.println(resuction.funct(10));
 }
}