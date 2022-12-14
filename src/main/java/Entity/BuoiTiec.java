package Entity;

import Manager.QuanLyBuoiTiec;
import Manager.QuanLyDichVu;
import Manager.QuanLySanhCuoi;
import Manager.QuanLyThucPham;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BuoiTiec {
  private String tenBuoiTiec;
  private SanhCuoi sanhCuoi;
  private String thoiDiemThue;
  private ThoiDiem thoiDiem;
  private QuanLySanhCuoi qlsc = new QuanLySanhCuoi();
  private ChonMenu menu = new ChonMenu();
  private Menu mn = new Menu();
  private QuanLyDichVu dv = new QuanLyDichVu();
  private ChonDichVu dichVu = new ChonDichVu();
  Scanner scanner = new Scanner(System.in);
  public BuoiTiec() {
  }

  public BuoiTiec(SanhCuoi sanhCuoi, String ten) {
    this.sanhCuoi = sanhCuoi;
    this.tenBuoiTiec = tenBuoiTiec;
  }

  public BuoiTiec(String ma, String ten, String lten, String viTri, int sucChua, String ngayThue, ThoiDiem thoiDiem) throws ParseException {
    this.tenBuoiTiec = ten;
    this.sanhCuoi.setMaSC(ma);
    this.sanhCuoi.setTenSC(lten);
    this.sanhCuoi.setViTriSC(viTri);
    this.sanhCuoi.setSucChua(sucChua);
    this.sanhCuoi.setNgay(ngayThue);
    this.sanhCuoi.setThoiDiem(thoiDiem);
  }

  public BuoiTiec(String ten, String ma) {
    this.sanhCuoi.setMaSC(ma);
    this.tenBuoiTiec = ten;
  }
  public ThoiDiem stringToThoiDiem(String s) {
    if(s == "Sang") {
      return ThoiDiem.Sang;
    }
    else if (s == "Chieu") {
      return ThoiDiem.Chieu;
    } else if (s == "Toi") {
      return ThoiDiem.Toi;
    }
    return null;
  }
  public void thueSanh() throws ParseException {
    System.out.print("Nhập mã sảnh muốn thuê: ");
    String ma;
    ma = scanner.nextLine();
    System.out.print("Nhập ngày thuê: ");
    String ngayT;
    ngayT= scanner.nextLine();
    System.out.print("Nhập thời điểm thuê: ");
    String tg;
    tg = scanner.nextLine();
    this.sanhCuoi = new SanhCuoi(ma, tenSanh(ma), viTriSanh(ma), sucChuaSanh(ma), ngayT, stringToThoiDiem(tg));
    this.sanhCuoi.setTanSuat(this.sanhCuoi.getTanSuat() + 1);
  }
  public void showThDiem(){
    System.out.println("Thời điểm: "+ this.thoiDiem);
  }
  public void nhapBuoiTiec() throws ParseException, FileNotFoundException {
    System.out.print("Nhập tên buổi tiệc: ");
    String tenBuoiTiec = scanner.nextLine();

    this.tenBuoiTiec = tenBuoiTiec;
    this.thueSanh();
    int chon;
    do{
      System.out.print("Chọn dịch vụ\n1.Thuê ca sĩ\n2.Thuê phòng karaoke\n3.Yêu cầu trang trí bối cảnh\nChọn: ");
      chon = scanner.nextInt();
      this.chonDv(chon);
    }
    while(chon!=0);
    this.mn.nhapMenu();
  }

  public void show() {
    System.out.printf("Mã: %s\nTên : %s\n", this.sanhCuoi.getMaSC(), this.tenBuoiTiec);
    System.out.println("Date: " + this.sanhCuoi.getNgay());
    System.out.println(this.sanhCuoi.getTanSuat());

  }

  public int tongTien() throws ParseException {
    int sum;
    sum = sanhCuoi.tienThue() + dv.tongGia() + mn.tong()*sanhCuoi.getSucChua();
    return sum;
  }

  public void getHoaDon() throws ParseException {
    System.out.println(tongTien());
  }

  public void xuatHoaDon() throws FileNotFoundException, ParseException{
    System.out.println("Tiền thuê sảnh: "+this.sanhCuoi.tienThue());

    System.out.println("Tiền menu: "+this.mn.tong() * sanhCuoi.getSucChua());

    System.out.println("Tiền dịch vụ: "+this.dv.tongGia());

    System.out.println("Tổng tiền: "+this.tongTien());

  }
  public String viTriSanh(String ma) {
    for (SanhCuoi s : qlsc.getDsSanhCuoi()) {
      if (ma.equals(s.getMaSC())) {
        return s.getViTriSC();
      }
    }
    return "";
  }

  public int sucChuaSanh(String ma) {
    for (SanhCuoi s : qlsc.getDsSanhCuoi()) {
      if (ma.equals(s.getMaSC())) {
        return s.getSucChua();
      }
    }
    return 0;
  }

  public String tenSanh(String ma) {
    for (SanhCuoi s : qlsc.getDsSanhCuoi()) {
      if (ma.equals(s.getMaSC())) {
        return s.getTenSC();
      }
    }
    return "";
  }
  public void chonDv(int luaChon) throws FileNotFoundException {
    switch (luaChon) {
      case 1 -> {
        this.themCaSi();
      }
      case 2 -> {
        this.themKaraoke();
      }
      case 3 -> {
        this.themTrangTri();
      }
    }
  }

  public void themCaSi() throws FileNotFoundException {
    System.out.print("Nhập tên ca sĩ: ");
    String tempName = scanner.nextLine();
    tempName = scanner.nextLine();
    System.out.print("Nhập số lượng: ");
    int song = scanner.nextInt();
    this.dv.themDv(new ThueCaSi(tempName, song, this.dv.docFileCaSi(tempName)));
  }

  public void themKaraoke() throws FileNotFoundException {
    System.out.println("-Karaoke-");
    System.out.print("Nhập thời gian thuê: ");
    int t;
    t = scanner.nextInt();
    this.dv.themDv(new Karaoke(t, this.dv.docFileKaraoke()));
  }

  public void themTrangTri() throws FileNotFoundException {
    System.out.println("Nhap yeu cau trang tri boi canh: ");
    String yc = scanner.nextLine();
    yc = scanner.nextLine();
    this.dv.themDv(new TrangTriPhoiCanh(yc, this.dv.docFileTrangTri(yc)));
  }

  public void showTatCaC() {
    System.out.println("----------Buổi Tiệc--------");
    System.out.println("Tên buổi tiệc: " + this.tenBuoiTiec);
    this.sanhCuoi.show();
    this.sanhCuoi.showThue();
    this.showThDiem();
    this.mn.showMenu();
    System.out.println("--Dịch vụ--");
    this.dv.show();
  }
  public String getTenBuoiTiec() {
    return tenBuoiTiec;
  }

  public void setTenBuoiTiec(String tenBuoiTiec) {
    this.tenBuoiTiec = tenBuoiTiec;
  }

  public SanhCuoi getSanhCuoi() {
    return sanhCuoi;
  }

  public void setSanhCuoi(SanhCuoi sanhCuoi) {
    this.sanhCuoi = sanhCuoi;
  }

  public String getThoiDiemThue() {
    return thoiDiemThue;
  }

  public void setThoiDiemThue(String thoiDiemThue) {
    this.thoiDiemThue = thoiDiemThue;
  }

  public QuanLySanhCuoi getQlsc() {
    return qlsc;
  }

  public void setQlsc(QuanLySanhCuoi qlsc) {
    this.qlsc = qlsc;
  }

  public ChonMenu getMenu() {
    return menu;
  }

  public void setMenu(ChonMenu menu) {
    this.menu = menu;
  }

  public ChonDichVu getDichVu() {
    return dichVu;
  }

  public void setDichVu(ChonDichVu dichVu) {
    this.dichVu = dichVu;
  }

  public QuanLyDichVu getDv() {
    return dv;
  }

  public void setDv(QuanLyDichVu dv) {
    this.dv = dv;
  }

  public Menu getMn() {
    return mn;
  }

  public void setMn(Menu mn) {
    this.mn = mn;
  }

  public ThoiDiem getThoiDiem() {
    return thoiDiem;
  }

  public void setThoiDiem(ThoiDiem thoiDiem) {
    this.thoiDiem = thoiDiem;
  }
}
