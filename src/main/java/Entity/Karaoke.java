package Entity;

public class Karaoke extends DichVu{
  private double tgThue;
  private static int count = 0;
  {
    ++count;
    maDV = String.format("SY%04d",count);
    tenDV = "Thuê Karaoke";
  }

  public Karaoke(double tgThue,double giaDv) {
    super(giaDv);
    this.tgThue = tgThue;
    this.giaDV = this.giaDV * this.tgThue;
  }

  @Override
  public void show() {
    System.out.println(this.tenDV);
    System.out.println("Thời gian thuê:" + this.tgThue);
    System.out.println("Giá trên giờ: " + this.giaDV);
    System.out.println("Price: " + this.tgThue * this.giaDV);
  }
  public double getTgThue() {
    return tgThue;
  }

  public void setTgThue(double tgThue) {
    this.tgThue = tgThue;
  }
}
