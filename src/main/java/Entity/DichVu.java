package Entity;

public abstract class DichVu {
  private static int count = 0;
  protected String maDV;
  protected String tenDV;
  protected double giaDV;
  {
    ++count;
    maDV = String.format("SDV%04d",count);
  }
  public DichVu(double giaDV) {

    this.giaDV = giaDV;
  }

  public abstract void show();
  public String getMaDV() {
    return maDV;
  }

  public void setMaDV(String maDV) {
    this.maDV = maDV;
  }

  public String getTenDV() {
    return tenDV;
  }

  public void setTenDV(String tenDV) {
    this.tenDV = tenDV;
  }

  public double getGiaDV() {
    return giaDV;
  }

  public void setGiaDV(double giaDV) {
    this.giaDV = giaDV;
  }
}
