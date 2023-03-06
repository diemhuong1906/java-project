package HUONG5;

public class HangDienMay extends HangHoa {
    private int thoiGianBaoHanh;
    private double congSuat;

    public HangDienMay(String maHang, String tenHang, int soLuongTonKho, double donGia, int thoiGianBaoHanh, double congSuat) {
        super(maHang, tenHang, soLuongTonKho, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public double tinhThueVAT() {
        return 0.1 * soLuongTonKho * donGia;
    }
    
    @Override
    public String danhGiaTieuThu() {
        if (soLuongTonKho < 3) {
            return "Bán được";
        } else {
            return "Không đánh giá";
        }
    }
}