package lotto;

import camp.nextstep.edu.missionutils.Randoms;
import net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Application {

    Scanner scan = new Scanner(System.in);

    void inputTotalMoney(){
        System.out.println("금액을 입력해 주세요.");
        int totalMoney = scan.nextInt();
        System.out.printf("%d개를 구매했습니다.", countNumber(totalMoney));
        System.out.println();
        printRandomNumbers(totalMoney);
    }

    int countNumber(int totalMoney){
        return totalMoney/1000;
    }

    void printRandomNumbers(int totalMoney){
        for(int i=0; i<countNumber(totalMoney); i++) {
           List<Integer> number = Randoms.pickUniqueNumbersInRange(1, 45, 6);
            Collections.sort(number);
            System.out.print("[");
           for(int j =0 ;j<5 ;j++){
                System.out.printf("%d, ", number.get(j));
            }
            System.out.printf("%d", number.get(5));
            System.out.print("]");
           System.out.println();
        }
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
