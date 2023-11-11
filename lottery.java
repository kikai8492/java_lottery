import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Lottery {
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

    while (true) {
      System.out.println("本日おやすみの方はいらっしゃいますか？");

      System.out.println("0:いない 1:いる");

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
        System.exit(0);

      } else if (selectNumber == 1) {

        System.out.println("おやすみの人を選択してください。");

        for(int i = 0; i < members.length; i++) {
          System.out.println(i + ":" + members[i]);
        }
        List<String> list = new ArrayList<String>(Arrays.asList(members)); //配列をリストに変換するらしい

        Scanner scanner2 = new Scanner(System.in);
        int deleteMember = scanner2.nextInt();
        if (members.length <= deleteMember) {  
          System.out.println("そのメンバーは存在しません。");
          continue;
        }
        list.remove(deleteMember);

        String[] newMembers = (String[]) list.toArray(new String[list.size()]);

        while (true) {

          System.out.println("更新後のメンバーは以下の通りです。");

          for(int i = 0; i < newMembers.length; i++) {
            System.out.println(newMembers[i]);
          }

          System.out.println("他におやすみの方はいらっしゃいますか？");

          System.out.println("0:いない 1:いる");

          Scanner scanner3 = new Scanner(System.in);
          int newMembersSelect = scanner3.nextInt();
          if (newMembers.length < newMembersSelect) {
            System.out.println("0か1を入力してください。");
            continue;
          }
        
          if (newMembersSelect == 0 ) {

            Random random = new Random();
            int newIndex = random.nextInt(newMembers.length);
            String newLottery = newMembers[newIndex];

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

            System.out.println( newLottery + "さんが今日の司会者です!おめでとうございます！");

            System.exit(0);
            
          } else if (newMembersSelect == 1) {

            System.out.println("おやすみの人を選択してください。");

            for(int i = 0; i < newMembers.length; i++) {
              System.out.println(i + ":" + newMembers[i]);
            }

            int deleteMember2 = scanner3.nextInt();
            if (newMembers.length <= deleteMember2) {  
              System.out.println("そのメンバーは存在しません。");
              continue;
            }
            List<String> newList = new ArrayList<String>(Arrays.asList(newMembers));
            newList.remove(deleteMember2);

            newMembers = (String[]) newList.toArray(new String[newList.size()]);
            if (newMembers.length == 0) {
              System.out.println("メンバーがいなくなりました。");
              System.out.println("今日の朝礼は無しですね。にちゃー");
              System.exit(0); 
            }
            continue;

          } else {
            System.out.println("0か1を入力してください。");
            continue;
          }
        }
      } else {
        System.out.println("0か1を入力してください。");
        continue;
      }
    }
    
  }
}

class drawingStart {
  public static void main(String[] args) {
    Lottery lottery = new Lottery();
    lottery.selectMember();
  }
}