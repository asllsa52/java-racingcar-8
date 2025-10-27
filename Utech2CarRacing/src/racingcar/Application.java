package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Game {
    public void start() {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();

        Cars cars = inputView.inputCarNames();
        int rounds = inputView.inputAttemptCount();

        resultView.printResultMessage();

        for (int i = 0; i < rounds; i++) {
            cars.moveAll();
            resultView.printRound(cars);
        }

        resultView.printWinners(cars.findWinners());
    }
}

class InputView {
    public Cars inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        List<String> names = Arrays.stream(input.split(","))
                                   .map(String::trim)
                                   .toList();
        return new Cars(names);
    }

    public int inputAttemptCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String input = Console.readLine();
        validateNumeric(input);
        return Integer.parseInt(input);
    }

    private void validateNumeric(String input) {
        if (!input.matches("\\d+")) {
            throw new IllegalArgumentException("숫자를 입력해야 합니다.");
        }
    }
}

class ResultView {
    public void printResultMessage() {
        System.out.println();
        System.out.println("실행 결과");
    }

    public void printRound(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
        }
        System.out.println();
    }

    public void printWinners(List<String> winners) {
        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }
}

class Car {
    private static final int MOVE_THRESHOLD = 4;
    private final String name;
    private int position = 0;

    public Car(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (name == null || name.isEmpty() || name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 1~5자여야 합니다.");
        }
    }

    public void move() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);
        if (randomNumber >= MOVE_THRESHOLD) {
            position++;
        }
    }

    public String getName() { return name; }
    public int getPosition() { return position; }
}

class Cars {
    private final List<Car> cars;

    public Cars(List<String> names) {
        this.cars = names.stream()
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public void moveAll() {
        cars.forEach(Car::move);
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<String> findWinners() {
        int max = cars.stream()
                      .mapToInt(Car::getPosition)
                      .max()
                      .orElse(0);
        return cars.stream()
                   .filter(c -> c.getPosition() == max)
                   .map(Car::getName)
                   .collect(Collectors.toList());
    }
}

public class Application {
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
