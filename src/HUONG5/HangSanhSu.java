package HUONG5;

import java.time.LocalDate;

public class HangSanhSu extends HangHoa {
    private String nhaSanXuat;
    private LocalDate ngayNhapKho;
    
    public HangSanhSu(String maHang, String tenHang, int soLuongTonKho, double donGia, String nhaSanXuat, LocalDate ngayNhapKho) {
        super(maHang, tenHang, soLuongTonKho, donGia);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }
    
    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public LocalDate getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(LocalDate ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }

    @Override
    public double tinhThueVAT() {
        return 0.1 * soLuongTonKho * donGia;
    }
    
    @Override
    public String danhGiaTieuThu() {
        LocalDate currentDate = LocalDate.now();
        if (soLuongTonKho > 50 && currentDate.isAfter(ngayNhapKho.plusDays(10))) {
            return "Bán chậm";
        } else {
            return "Không đánh giá";
        }
    }
}