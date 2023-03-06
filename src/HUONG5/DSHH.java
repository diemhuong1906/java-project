package HUONG5;

import java.util.ArrayList;

public class DSHH {
    private ArrayList<HangHoa> dsHangHoa;

    public DSHH() {
        dsHangHoa = new ArrayList<>();
    }

    public boolean themHangHoa(HangHoa hangHoa) {
        for (HangHoa hh : dsHangHoa) {
            if (hh.getMaHang().equals(hangHoa.getMaHang())) {
                return false; // trùng mã hàng hóa
            }
        }
        dsHangHoa.add(hangHoa);
        return true;
    }

    public ArrayList<HangHoa> getDsHangHoa() {
        return dsHangHoa;
    }
}