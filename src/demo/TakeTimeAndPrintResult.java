package demo;

public class TakeTimeAndPrintResult {
    public static void main(String[] args) {

        System.out.println("Solve the problem :");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int a = 5;
        int b = 7;
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        System.out.println("Add these two numbers : " + add);


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Please subtract these two numbers :" + sub);


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Please multiplication these two numbers :" + mul);


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Please multiplication these two numbers :" + div);

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thank You...!! ");

    }
}
