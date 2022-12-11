package Entity;

public class ThucPham {
  private static int count = 0;
  private int maTp;
  private String tenTp;
  private double giaTp;

  public int getMaTp() {
    return maTp;
  }

  public void setMaTp(int maTp) {
    this.maTp = maTp;
  }

  public String getTenTp() {
    return tenTp;
  }

  public void setTenTp(String tenTp) {
    this.tenTp = tenTp;
  }

  public double getGiaTp() {
    return giaTp;
  }

  public void setGiaTp(double giaTp) {
    this.giaTp = giaTp;
  }
}
