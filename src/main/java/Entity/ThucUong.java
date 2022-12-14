package Entity;

public class ThucUong extends ThucPham{
  private String hangSX;
  public ThucUong(String tenTp, double giaTp, String hangSX) {
    super(tenTp, giaTp);
    this.hangSX = hangSX;
  }

  @Override
  public void show() {
    System.out.printf("%d --- %s, %.0f, %s\n", maTp, this.tenTp, this.giaTp, this.hangSX);

  }
  public String getHangSX() {
    return hangSX;
  }

  public void setHangSX(String hangSX) {
    this.hangSX = hangSX;
  }
}
