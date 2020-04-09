
import static java.lang.Math.pow;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author son maithanh
 */
public class DaiSoGiaTu {

    String[] danhGia = {"cực kỳ yếu", "rất yếu", "khá yếu", "hơi yếu", "trung bình", "hơi tốt", "khá tốt", "rất tốt", "cực kỳ tốt"};

    String[] T = {"tốt", "yếu"};
    String[] G = {"rất", "khá", "hơi"};
    int H = 3;
    int S = 6;

    public String[] bang(String[] T, String[] G, int H) {// AT = (T, G, H, ≤)
        int n = (int) pow(G.length, H) + T.length;
        String[] bang = new String[n];

        bang[0] = "0";
        bang[n / 2] = "W";
        bang[n - 1] = "1";

        for (int i = 1; i < n / 2; i++) {
            for (int j = 0; j < G.length; j++) {
                String tempG = "";
                for (int k = 0; k < H; k++) {
                    tempG = tempG + G[j];
                }
                bang[i] = tempG + T[1];
            }
        }
        
        for (int i = n - 2; i > n / 2; i--) {
            for (int j = G.length - 1; j > 0; j--) {
                String tempG = "";
                for (int k = 0; k < H; k++) {
                    tempG = tempG + G[j];
                }
                bang[i] = tempG + T[0];
            }
        }
        
        return bang;
    }

    public void DanhGia(int danhgia, String[] str_final, int can_duoi, int ma_sk_danhgia) {

        if ((1 <= danhgia) && (2 >= danhgia)) {
            str_final[0] = danhGia[1];
//            jLabel3.setText("Yếu");
            ma_sk_danhgia = 1;
        }
        if ((2 < danhgia) && (3 >= danhgia)) {
            str_final[0] = danhGia[2];
//            jLabel3.setText("Trung bình");
            ma_sk_danhgia = 2;
        }
        if ((3 < danhgia) && (4 >= danhgia)) {
            str_final[0] = danhGia[3];
//            jLabel3.setText("Trung bình");
            ma_sk_danhgia = 2;
        }
        if ((4 < danhgia) && (5 >= danhgia)) {
            str_final[0] = danhGia[5];
//            jLabel3.setText("Khá");
            can_duoi = 4;
            ma_sk_danhgia = 3;
        }
        if ((5 < danhgia) && (6 >= danhgia)) {
            str_final[0] = danhGia[6];
//            jLabel3.setText("Khá");
            can_duoi = 4;
            ma_sk_danhgia = 3;
        }
        if ((6 < danhgia) && (7 >= danhgia)) {
            str_final[0] = danhGia[7];
//            jLabel3.setText("Tốt");
            can_duoi = 6;
            ma_sk_danhgia = 4;
        }
        if ((7 < danhgia) && (8 >= danhgia)) {
            str_final[0] = danhGia[8];
//            jLabel3.setText("Tốt");
            can_duoi = 6;
            ma_sk_danhgia = 4;
        }
        if ((8 < danhgia) && (9 >= danhgia)) {
            str_final[0] = danhGia[9];
//            jLabel3.setText("Rất tốt");
            can_duoi = 8;
            ma_sk_danhgia = 5;
        }
    }
}
