import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x,y=0,z;
        boolean isEven=false;
        while(!isEven){
            System.out.print("Bir sayı giriniz: ");
            x = sc.nextInt();
            if(x%2==1){
                isEven = true;
            }
            else if(x%4 == 0){
                y = y  + x;
            }
        }
        System.out.print("Şu ana kadar girilen ve 4 e tam bölünen sayıların toplamı: "+y);
    }
}