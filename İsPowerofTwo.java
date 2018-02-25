static boolean isPowerOfTwo(int number) {
    /*
     *  Write your solution here !
     *  You can use the result variable
     *  below to return your answer
     */
   if(number<0)number=-number;
   if(number==0)return false;
    if(number==1)return true;
    if(number%2==1)return false;
    boolean result =true;
   while(number>0){
        if(number%2==1)return false;
      if(number==1)return false;
        number=number/2;
        if(number==1)return false;
      if (number==2) return true;
   }
    return result;
}
