package Entity;

import Manager.QuanLyDichVu;

public class ChonDichVu {
  private DichVu dichVu;
  private BuoiTiec buoiTiec;

  public DichVu getDichVu() {
    return dichVu;
  }

  public void setDichVu(DichVu dichVu) {
    this.dichVu = dichVu;
  }

  public BuoiTiec getBuoiTiec() {
    return buoiTiec;
  }

  public void setBuoiTiec(BuoiTiec buoiTiec) {
    this.buoiTiec = buoiTiec;
  }
}
