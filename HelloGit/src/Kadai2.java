import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Kadai2 {

  public static void main(String[] args) {

    // 1.HelloWorldを表示
    String greeting = "HelloWorld";
    System.out.println(greeting);

    // 2.1-10を足した結果をfor文で4行以内で表示
    int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int sum = 0;
    for (int score : num) {
      System.out.println(sum += score);
    }

    // 3.3年後の今日は何曜日？
    LocalDateTime now = LocalDateTime.now();
    LocalDateTime sample = now.plusYears(3);

    plus(sample);
    System.out.println(sample.getDayOfWeek());

    // 4.引数が0なら偽、1なら真とif文で表示
    int r = new java.util.Random().nextInt(2);

    System.out.println(judge(r));

    // 5.ListかMapを使ってみよう
    List<String> list = new ArrayList<String>();
    list.add("山田");
    list.add("田中");
    list.add("松本");

    for (String i : list) {
      System.out.println(i);
    }

    // 6.例外クラスを作成

  }

  // 3.
  public static DayOfWeek plus(LocalDateTime days) {

    return days.getDayOfWeek();

  }

  // 4.
  public static String judge(int number) {
    if (number == 1) {
      return "真";
    } else {
      return "偽";
    }
  }

}
