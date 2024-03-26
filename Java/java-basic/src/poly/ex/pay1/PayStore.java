package poly.ex.pay1;
// 결재 수단을 보관하고 관리하는 클래스
// 생성 될 수 없도록 abstract로 생성
// 변하는 부분
public abstract class PayStore {
  public static Pay findPaymentSystem(String option) {
    if (option.equals("kakao")) {
      return new KakaoPay();
    } else if (option.equals("naver")) {
      return new NaverPay();
    }else if (option.equals("new")) {
      return new NewPay();
    } else {
      return new DefaultPay();
    }
  }
}
