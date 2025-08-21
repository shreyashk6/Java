public class Mainclass4 {
  public static void main(String[] args) {
    Samsung s = new Samsung();
    PhoneManager.details(s);

    Oppo oo = new Oppo();
    PhoneManager.details(oo);

    OnePlus op = new OnePlus();
    PhoneManager.details(op);
  }
}

abstract class Android {
  abstract void ui();

  void service() {
  }
}

class Samsung extends Android {
  @Override
  void ui() {
    System.out.println("Samsunng UI");
  }
}

class OnePlus extends Android {
  @Override
  void ui() {
    System.out.println("Oneplus UI");
  }
}

class Oppo extends Android {
  @Override
  void ui() {
    System.out.println("Vivo UI");
  }
}

class PhoneManager {
  static void details(Android a) {
    if (a != null) {
      a.ui();
      a.service();
    }
  }
}