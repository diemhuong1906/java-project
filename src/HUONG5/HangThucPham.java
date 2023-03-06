package HUONG5;

import java.time.LocalDate;

public class HangThucPham extends HangHoa {
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;
    private String nhaCungCap;
    
    public HangThucPham(String maHang, String tenHang, int soLuongTonKho, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan, String nhaCungCap) {
        super(maHang, tenHang, soLuongTonKho, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }
    
    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    @Override
    public double tinhThueVAT() {
        return 0.05 * soLuongTonKho * donGia;
    }
    
    @Override
    public String danhGiaTieuThu() {
    	LocalDate currentDate = LocalDate.now();
        if (soLuongTonKho > 0 && ngayHetHan.isBefore(currentDate)) {
            return "Khó bán";
        } else {
            return "Không đánh giá";
        }
    }
}
