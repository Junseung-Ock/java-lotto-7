package lotto;

import net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate;

import java.util.Scanner;

public class Application {

    Scanner scan = new Scanner(System.in);

    void inputTotalMoney(){
        System.out.println("금액을 입력해 주세요.");
        int totalMoney = scan.nextInt();
        countNumber(totalMoney);
    }

    void countNumber(int totalMoney){
        System.out.printf("%d개를 구매했습니다.", totalMoney/1000);
    }

    void run (){
        inputTotalMoney();
    }
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Application app = new Application();
        app.run();
    }
}
