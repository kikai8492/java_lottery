import java.util.Scanner;
import java.util.Random;

class lottery {
  public void selectMember() {
    System.out.println("司会者抽選プロブラムへようこそ！");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("メンバーは以下の通りです。");
    
    String[] members = {"Aさん", "Bさん", "Cさん", "Dさん"};
    for(int i = 0; i < members.length; i++) {
      System.out.println(members[i]);
    }
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("本日おやすみの方はいらっしゃいますか？");

    System.out.println("0:いない 1:いる");

    while (true) {
      Scanner scanner = new Scanner(System.in);
      int selectNumber = scanner.nextInt(); 
      if (selectNumber == 0) {
        System.out.println("抽選を開始します。");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("だだだだ・・・");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("だん!");
        Random random = new Random();
        int index = random.nextInt(members.length);
        String lottery = members[index];
        System.out.println( lottery + "さんが今日の司会者です!おめでとうございます！");
        break;
      }
    }

  }
}

class drawingStart {
  public static void main(String[] args) {
    lottery lottery = new lottery();
    lottery.selectMember();
  }
}