package Entity;

import Manager.QuanLyThucPham;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu {

  private List<ThucPham> dsThucPham = new ArrayList<>();

  private QuanLyThucPham dsQl = new QuanLyThucPham();
  {
    try {
      getDsQl().docFileTa();
    } catch (FileNotFoundException | ParseException ex) {
      Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
      getDsQl().docFileTu();
    } catch (FileNotFoundException | ParseException ex) {
      Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  Scanner scanner = new Scanner(System.in);
  public void add(ThucPham... tp){
    this.dsThucPham.addAll(Arrays.asList(tp));
  };

  public void del(ThucPham tp){
    this.dsThucPham.remove(tp);
  }

  public void chonThucPham(int n){
    for(ThucPham d: dsQl.getDsTp()){
      if(d.getMaTp() == n){
        dsThucPham.add(d);
        break;
      }
    }
  }

  public void nhapMenu(){
    this.showQuanLy();
    int n;
    do{
      System.out.print("Nhập mã món ăn: ");
      n = scanner.nextInt();
      chonThucPham(n);
    }
    while(n!=0);
  }

  public int tong(){
    int sum=0;
    for(ThucPham d: dsThucPham){
      sum += d.getGiaTp();
    }
    return sum;
  }

  public void showQuanLy(){
    this.dsQl.showDstp();
  }

  public void showMenu(){
    System.out.println("----Menu----");
    for(ThucPham d : dsThucPham){
      System.out.println(d.tenTp);
    }
  }
  public List<ThucPham> getDsThucPham() {
    return dsThucPham;
  }

  public void setDsThucPham(List<ThucPham> dsThucPham) {
    this.dsThucPham = dsThucPham;
  }

  public QuanLyThucPham getDsQl() {
    return dsQl;
  }

  public void setDsQl(QuanLyThucPham dsQl) {
    this.dsQl = dsQl;
  }
}
