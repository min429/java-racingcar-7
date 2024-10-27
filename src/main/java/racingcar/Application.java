package racingcar;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

    public static List<String> getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        List<String> carNames = Arrays.asList(Console.readLine().split(","));
        validateCarNames(carNames);

        return carNames;
    }

    public static int getRounds() {
        System.out.println("시도할 횟수는 몇 회인가요?");

        try {
            return Integer.parseInt(Console.readLine());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자를 입력해 주세요.");
        }
    }

    public static void validateCarNames(List<String> carNames) {
        for (String name : carNames) {
            if (name.length() > 5) {
                throw new IllegalArgumentException("이름은 5자 이하여야 합니다.");
            }
        }
    }
    }
}
