package Entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SanhCuoi{
  private static int count = 0;
  private String maSC;
  private String tenSC;
  private String viTriSC;
  private int sucChua;
  private double donGia;
  private int tanSuat = 0;
  private ThoiDiem thoiDiem;
  private String ngay;
  Scanner scanner = new Scanner(System.in);

  {
    maSC = String.format("S%03d",(++count));

  }
  public SanhCuoi(String maSC) {

    this.maSC = maSC;
  }
  public SanhCuoi(String tenSC, String viTriSC, int sucChua, String ngayThue, ThoiDiem thoiDiem) throws ParseException {
    this.tenSC = tenSC;
    this.viTriSC = viTriSC;
    this.sucChua = sucChua;
    this.ngay = ngayThue;
    this.thoiDiem = thoiDiem;
  }
  public SanhCuoi(String maSC, String tenSC, String viTriSC, int sucChua, String ngayThue, ThoiDiem thoiDiem) throws ParseException {
    this.tenSC = tenSC;
    this.viTriSC = viTriSC;
    this.sucChua = sucChua;
    this.maSC = maSC;
    this.ngay = ngayThue;
    this.thoiDiem = thoiDiem;
  }
  public SanhCuoi(String tenSC, String viTriSC, int sucChua) {
    this.tenSC = tenSC;
    this.viTriSC = viTriSC;
    this.sucChua = sucChua;

  }

  public int tienThue() throws ParseException {
    Date date = new SimpleDateFormat("dd/MM/yyyy").parse(this.ngay);
    int thu = date.getDay();
    return this.thoiDiem.tien(thu);
  }

  public void show() {
    System.out.printf("Mã sảnh: %s\nTên sảnh: %s\nVị trí: %s\nSức chứa: %d\n",
        this.maSC, this.tenSC, this.viTriSC, this.sucChua);

  }
  public void show2() {
    System.out.println("Thời điểm thuê: " + this.thoiDiem);
  }
//  @Override
//  public String toString() {
//    return String.format("Mã sảnh: %s\nTên sảnh: %s\nVị trí: %s\nSức chứa: %d\n",
//        this.maSC, this.tenSC, this.viTriSC, this.sucChua);
//  }
  public void showThue(){
    System.out.println("Ngày: "+ ngay);
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

  public int getTanSuat() {
    return tanSuat;
  }

  public void setTanSuat(int tanSuat) {
    this.tanSuat = tanSuat;
  }

  public ThoiDiem getThoiDiem() {
    return thoiDiem;
  }

  public void setThoiDiem(ThoiDiem thoiDiem) {
    this.thoiDiem = thoiDiem;
  }

  public String getNgay() {
    return ngay;
  }

  public void setNgay(String ngay) {
    ngay = ngay;
  }
}
