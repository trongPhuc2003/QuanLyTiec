package Entity;

public class ThueCaSi extends DichVu {
  private String thongTin;
  private int soLuongBaiHat;
  private static int count = 0;
  {
    ++count;
    maDV = String.format("SC%04d",count);
    tenDV = "Thuê ca sĩ";
  }
  public ThueCaSi(String thongTin, int soLuongBaiHat, double giaDv) {
    super(giaDv);
    this.thongTin = thongTin;
    this.soLuongBaiHat = soLuongBaiHat;
  }

  @Override
  public void show(){
    System.out.println(this.maDV);
    System.out.println(this.thongTin);
    System.out.println(this.soLuongBaiHat);
    System.out.println(this.giaDV);
  }
  public String getThongTinCaSi() {
    return thongTin;
  }

  public void setThongTinCaSi(String thongTinCaSi) {
    this.thongTin = thongTinCaSi;
  }

  public int getSoLuongBaiHat() {
    return soLuongBaiHat;
  }

  public void setSoLuongBaiHat(int soLuongBaiHat) {
    this.soLuongBaiHat = soLuongBaiHat;
  }
}
