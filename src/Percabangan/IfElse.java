package Percabangan;

public class IfElse {
    public static void main (String[] args){
        double totalBelanja = 25000;
        double uangDiDompet = 50000;

        if (uangDiDompet<totalBelanja){
            System.out.println("Uang anda kurang, Kurangi belanjaan anda");
        }else {
            System.out.println("Uang anda cukup, selamat menikmati");
        }
    }
}
