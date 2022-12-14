package Entity;

public class ThucAn extends ThucPham{
  private boolean anChay;
  public ThucAn(String tenTp, double giaTp, boolean anChay) {
    super(tenTp, giaTp);
    this.anChay = anChay;
  }

  public ThucAn() {
    super(null, 0);
  }



  @Override
  public void show() {
    System.out.printf("%s-- ",this.maTp);
    System.out.print(this.tenTp + ", ");
    if(this.anChay == true)
      System.out.print("Chay");
    else
      System.out.print("Mặn");
    System.out.printf(", %.0f\n",this.giaTp);
  }
  public boolean isAnChay() {
    return anChay;
  }

  public void setAnChay(boolean anChay) {
    this.anChay = anChay;
  }
}
