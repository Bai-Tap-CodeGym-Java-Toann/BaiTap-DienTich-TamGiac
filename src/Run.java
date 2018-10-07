import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (0 < 1) {
            double[] triagle = new double[3];
            for (int i = 1; i <= 3; i++) {
                System.out.print("nhập độ dài cạnh thứ " + i + ": ");
                triagle[i-1] = sc.nextDouble();
            }
            if (Triagle.isValid(triagle[0],triagle[1],triagle[2])){
                System.out.print("diện tích tam giác là: ");
                System.out.println(Triagle.area(triagle[0],triagle[1],triagle[2]));
            }else {
                System.out.println("Đây không phải 3 cạnh của 1 tam giác! \n \n");
            }
        }
    }
}
