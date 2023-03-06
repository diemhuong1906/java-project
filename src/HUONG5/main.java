package HUONG5;

import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DSHH dsHangHoa = new DSHH();
		HangThucPham thucPham = new HangThucPham("THP001", "Sữa chua", 10, 15000, LocalDate.of(2023, 12, 31), LocalDate.of(2023, 2, 28), "Vinamilk");
		HangSanhSu sanhSu = new HangSanhSu("SS001", "Ly Sứ", 100, 50000, "ABC", LocalDate.of(2021, 1, 1));
		HangDienMay dienMay = new HangDienMay("DM001", "Tủ lạnh", 5, 15000000, 24, 200);
		
		dsHangHoa.themHangHoa(thucPham);
		dsHangHoa.themHangHoa(sanhSu);
		dsHangHoa.themHangHoa(dienMay);

		double giaBanThucPham = thucPham.tinhTien(); 
		double giaBanSanhSu = sanhSu.tinhTien(); 
		double giaBanDienMay = dienMay.tinhTien(); 

		System.out.printf("Tổng giá trị Thực Phẩm trong kho: %.2f\n", giaBanThucPham);
		System.out.printf("Tổng giá trị Sành Sứ trong kho: %.2f\n", giaBanSanhSu);
		System.out.printf("Tổng giá trị Điện Máy trong kho: %.2f\n", giaBanDienMay);

		String danhGiaThucPham = thucPham.danhGiaTieuThu();
		String danhGiaSanhSu = sanhSu.danhGiaTieuThu();
		String danhGiaDienMay = dienMay.danhGiaTieuThu();

		System.out.println("Đánh giá mức độ tiêu thụ hàng Thực Phẩm: " + danhGiaThucPham);
		System.out.println("Đánh giá mức độ tiêu thụ hàng Sành Sứ: " + danhGiaSanhSu);
		System.out.println("Đánh giá mức độ tiêu thụ hàng Điện Máy: " + danhGiaDienMay);

	}

}