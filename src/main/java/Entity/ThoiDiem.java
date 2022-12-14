package Entity;

public enum ThoiDiem {
  Sang{
    public int tien(int thu) {
      if(thu > 0 && thu < 6) {
        return 200000;
      }
      return 400000;
    }
  },
  Chieu{
    public int tien(int thu) {
      if(thu > 0 && thu < 6) {
        return 100000;
      }
      return 300000;
    }
  },
  Toi{
    public int tien(int thu) {
      if(thu > 0 && thu < 6) {
        return 400000;
      }
      return 500000;
    }
  };
  public int tien(int thu){
    return 0;
  }
}
