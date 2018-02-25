class SumSolution {
static String sumof2BigNumber(String str1, String str2) {
    BigInteger n1=new BigInteger(str1);
    BigInteger n2=new BigInteger(str2);
     BigInteger sum=n1.add(n2);
    String result =sum.toString();
    return result;
}
}
