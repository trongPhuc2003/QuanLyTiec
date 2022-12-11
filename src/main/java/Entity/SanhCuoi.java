package Entity;

import java.util.Scanner;

public class SanhCuoi {
  private static int count = 0;
  private String maSC;
  private String tenSC;
  private String viTriSC;
  private int sucChua;
  private double donGia;
  private int tanSuat = 0;

  public SanhCuoi(String maSC) {
    this.maSC = maSC;
  }
  public SanhCuoi(String maSC, String tenSC, String viTriSC, int sucChua) {
    this.maSC = maSC;
    this.tenSC = tenSC;
    this.viTriSC = viTriSC;
    this.sucChua = sucChua;
    count++;
  }

  public void hienThi() {
    System.out.printf("Ma sanh cuoi: %s\nTen sanh cuoi: %s\nVi tri sanh cuoi: %s\nSuc chua: %d\n", this.maSC, this.tenSC, this.viTriSC, this.sucChua);
  }
  @Override
  public String toString() {
    return "\nMa sanh cuoi: " + maSC + "\nTen sanh cuoi: " + tenSC + "\nVi tri sanh cuoi: " + viTriSC
        + "\nSuc chua: " + sucChua;
  }
  public String getMaSC() {
    return maSC;
  }

  public void setMaSC(String maSC) {
    this.maSC = maSC;
  }

  public String getTenSC() {
    return tenSC;
  }

  public void setTenSC(String tenSC) {
    this.tenSC = tenSC;
  }

  public String getViTriSC() {
    return viTriSC;
  }

  public void setViTriSC(String viTriSC) {
    this.viTriSC = viTriSC;
  }

  public int getSucChua() {
    return sucChua;
  }

  public void setSucChua(int sucChua) {
    this.sucChua = sucChua;
  }

  public double getDonGia() {
    return donGia;
  }

  public void setDonGia(double donGia) {
    this.donGia = donGia;
  }
}
