public class PalindromicNumberFinder {
    private int num;

    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    // this method should find the next palindromic number
    public int searchForPalindromicNum(int num){
      int palo = 0;
      for (int i = num +1; i > num; i++){
        if (testPalindromicNum(i) == true)
        {
          palo = i;
          break;
        }
        else
        {
          palo = 1;
        }
      }
      return palo - num;
  }

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome. 72928
    public boolean testPalindromicNum(int num){
      String test = String.valueOf(num);
      if(reverseNum(num).equals(test)){
        return true;
      }else{
        return false;
      }
    }

    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
      String test = String.valueOf(num);
      String r1 = "";
      for(int i= test.length()-1; i>=0; i--){
          r1 = r1 + test.charAt(i);
      }
      return r1;
    }


    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}