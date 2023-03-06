package HUONG5;

public abstract class HangHoa {
    protected String maHang;
    protected String tenHang;
    protected int soLuongTonKho;
    protected double donGia;
    
    public HangHoa(String maHang, String tenHang, int soLuongTonKho, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTonKho = soLuongTonKho;
        this.donGia = donGia;
    }
    
    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSoLuongTonKho() {
        return soLuongTonKho;
    }

    public void setSoLuongTonKho(int soLuongTonKho) {
        this.soLuongTonKho = soLuongTonKho;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    public abstract double tinhThueVAT();
    
    public abstract String danhGiaTieuThu();
    
    public double tinhTien() {
        return soLuongTonKho * donGia + tinhThueVAT();
    }
}