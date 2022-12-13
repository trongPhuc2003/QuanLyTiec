package Entity;

public abstract class  ThucPham {
  private static int count = 0;
  protected int maTp;
  protected String tenTp;
  protected double giaTp;
  {
    ++count;
    maTp = count;
  }
  public ThucPham(String tenTp, double giaTp) {
    this.tenTp = tenTp;
    this.giaTp = giaTp;
  }
  public abstract void show();
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
