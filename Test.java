
class Test
  {
    public static void main(String []args)
    {
      boolean isJavaFun = true;
      int age = 20;
      long population = 8000000000L;
      char grade = 'A';
      int a=10, b=5;
      int sum = a+b;
      int product = a*b;
      int[] numbers={1,2,3,4,5};
      System.out.println("is java fun?"+isJavaFun);
      System.out.println("age:"+age);
      System.out.println("world population:"+population);
      System.out.println("Grade:"+grade);
      System.out.println("sum:"+sum);
      System.out.println("product:"+product);
      System.out.println("array elements:");
      for(int num: numbers){
        System.out.print(num+"");
      }
    }
  }
