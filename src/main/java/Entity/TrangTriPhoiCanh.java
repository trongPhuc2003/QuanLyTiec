package Entity;

public class TrangTriPhoiCanh extends DichVu{
  private static int count = 0;
  private String yeuCau;
  {
    ++count;
    maDV = String.format("SY%04d",count);
    tenDV = "Yeu cau trang tri boi canh";
  }
  public TrangTriPhoiCanh(String yeuCau, double giaDv) {
    super(giaDv);
    this.yeuCau = yeuCau;
  }

  @Override
  public void show() {
    System.out.println(this.maDV);
    System.out.println(this.yeuCau);
    System.out.println(this.giaDV);
  }
  public String getYeuCau() {
    return yeuCau;
  }

  public void setYeuCau(String yeuCau) {
    this.yeuCau = yeuCau;
  }
}
