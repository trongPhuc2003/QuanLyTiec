package Entity;

public class ThucAn extends ThucPham {

  private boolean anChay = true;

  public ThucAn(String tenTp, double giaTp, boolean anChay) {
    super(tenTp, giaTp);
    this.setAnChay(anChay);
  }

  @Override
  public void show() {

    System.out.printf("%s-- ", this.maTp);
    System.out.print(this.tenTp + ", ");
    if (this.anChay)
      System.out.print("Chay");
    else if (!this.anChay)
      System.out.print("Mặn");
    System.out.printf(", %.0f\n", this.giaTp);
  }

  public boolean isAnChay() {
    return anChay;
  }

  public void setAnChay(boolean anChay) {
    this.anChay = anChay;
  }

}

