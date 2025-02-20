package Model;

public class Car {
    // 자동차의 이름, 현재의 전진 상태, 전진 횟수 변수
    private String name;
    private String nowStatus;
    private int moveCount;
    // 생성자로 변수 초기화
    public Car(String name, String nowStatus, int moveCount) {
        this.name = name;
        this.nowStatus = name + " : " +nowStatus;
        this.moveCount = moveCount;
    }
    // 각 변수 getter
    public String getName() {
        return name;
    }

    public String getNowStatus() {
        return nowStatus;
    }

    public int getMoveCount() {
        return moveCount;
    }
    // 한번 전진한 결과를 변경 해줌
    public void addCarMoveOnce(){
        this.nowStatus += "-";
        this.moveCount++;
    }
}
