import java.util.Scanner;

  public class Main {
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
     System.out.println("Bem-vindo á calculadora simples!");
     System.out.print("Número 1: ");
     int num1=scanner.nextInt();
     System.out.print("Número 2: ");
     int num2=scanner.nextInt();
     System.out.print("Operacao (+,-,*,/): ");
     char operacao=scanner.next().charAt(0);
     if(operacao=='+'){
        System.out.println("O resultado é: "+ soma(num1,num2));
     }else if(operacao=='-'){
        System.out.println("O resultado é: "+ subtracao(num1,num2));
     }else if(operacao=='/'){
        System.out.println("O resultado é: "+ divisao(num1,num2));
     }else if(operacao=='*'){
        System.out.println("O resultado é: "+ multiplicacao(num1,num2));
     }else{
       if (num2!=0){
       System.out.println("O resultado é: "+ divisao(num1,num2));
       return;
     }else{
      System.out.println("Operacao invalida!");
      return;
    }
  }
    }
  public static int multiplicacao(int a, int b){
    return a * b;
  }
  public static int soma(int a, int b){
    return a + b;
  }
  public static int divisao(int a, int b){
    return a / b;
  }
  public static int subtracao(int a, int b){
    return a - b;
  }
}