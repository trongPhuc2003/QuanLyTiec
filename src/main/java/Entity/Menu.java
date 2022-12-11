package Entity;

import java.util.ArrayList;
import java.util.List;

public class Menu {
  private double donGia;
  private List<ThucPham> dsThucPham = new ArrayList<>();

  public double getDonGia() {
    return donGia;
  }

  public void setDonGia(double donGia) {
    this.donGia = donGia;
  }

  public List<ThucPham> getDsThucPham() {
    return dsThucPham;
  }

  public void setDsThucPham(List<ThucPham> dsThucPham) {
    this.dsThucPham = dsThucPham;
  }
}
