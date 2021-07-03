package scissor paper rock;//may be not useful, you may need to delete it

import java.util.Random;
import java.util.Scanner;

public class xuLy {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int manPoints = 0;
    int comPoints = 0;
    int draw = 0;
    int playTimes = 0;

    boolean continueFlag = true;

    do {
      int manPick = printManPick(scan);
      if (manPick < 1 || manPick > 3) {
        if (manPick == 0) {
          System.out.println("Goodbye!");
        } else {
          System.out.println("Wrong, plz pick again!");
          System.out.println("Choose number between 1 and 3!");
          continue;
        }
        continueFlag = false;

      } else {
        int comPick = printComPick(); 

        playTimes++;
        if (manPick == comPick) {
          System.out.println("\t Draw! \t");
          draw++;
        } else {
          if (manPick == 1) {
            if (comPick == 2) {
              System.out.println("\t You Win this round! \t");
              manPoint++;
            } else {
              System.out.println("\t You Lose this round! \t");
              comPoints++;
            }
          } else if (manPick == 2) {
            if (comPick == 3) {
              System.out.println("\t You Win this round! \t");
              manPoint++;
            } else {
              System.out.println("\t You Lose this round! \t");
              comPoints++;
            }
          } else {
            if (comPick == 1) {
              System.out.println("\t You Win this round! \t");
              manPoint++;
            } else {
              System.out.println("\t You Lose this round! \t");
              comPoints++;
            }
          }
        }

        printResult(manPick, comPick, manPoint, comPoints, playTimes, draw);
        System.out.println("Do you want play again?");
        System.out.println("Press 0 to quit!");

      }
    } while (continueFlag);
  }

  // cho người dùng nhập vào lựa chọn
  public static int printManPick(Scanner scan) {
    int manPick;
    System.out.println("Com chosen his move, now your turn!");
    System.out.println("1. Scissors");
    System.out.println("2. Paper");
    System.out.println("3. Rock");
    manPick = Integer.parseInt(scan.nextLine());
    return manPick;
  }

  // cho máy chọn
  public static int printComPick() {
    Random rd = new Random();
    int comPick = rd.nextInt(3) + 1;
    if (comPick == 1) {
      System.out.println("\t Com chosen Scissors! \t");
    } else if (comPick == 2) {
      System.out.println("\t Com chosen Paper! \t");
    } else {
      System.out.println("\t Com chosen Rock! \t");
    }
    return comPick;
  }

  // hàm in kết quả
  public static void printResult(int manPick, int comPick, int manPoint, int comPoints, int playTimes, int draw) {

    if (comPoints > manPoint) {
      System.out.println("\tCom win more rounds than you!\t");
      System.out.println("You played " + playTimes + " rounds.");
      System.out.println("Number of time you win " + manPoint);
      System.out.println("Number of time com win " + comPoints);
      System.out.println("Number of time draw " + draw);

    } else if (comPoints < manPoint) {
      System.out.println("\tYou win more rounds than com!\t");
      System.out.println("You played " + playTimes + " rounds.");
      System.out.println("Number of time you win " + manPoint);
      System.out.println("Number of time com win " + comPoints);
      System.out.println("Number of time draw " + draw);
    } else {
      System.out.println("\tDraw\t");
      System.out.println("You played " + playTimes + " rounds.");
      System.out.println("Number of time you win " + manPoint);
      System.out.println("Number of time com win " + comPoints);
      System.out.println("Number of time draw " + draw);
    }
  }

}