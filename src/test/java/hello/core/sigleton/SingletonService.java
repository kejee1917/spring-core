package hello.core.sigleton;

public class SingletonService {
    
    // static으로 선언 => 스택틱 영역
    // 클래스 레벨에 올라감!
    private static final SingletonService instance = new SingletonService();
    
    public static SingletonService getInstance() {
        return instance;
    }

    
    // 중요 private 생성자!
    private SingletonService() {
    }
    
    public void logic() {
        System.out.println("singleton 객체 호출");
    }

}
