package com.hexaware.MLP192.util;
import java.util.Scanner;
import com.hexaware.MLP192.factory.MenuFactory;
import com.hexaware.MLP192.model.Menu;
/**
 * CliMain used as Client interface for java coading.
 * @author hexware
 */
class CliMain {
  private Scanner option = new Scanner(System.in, "UTF-8");
/**
 * mainMenu method  used to display the option we had in the application.
 */
  private void mainMenu() {
    System.out.println("Canteen Management System");
    System.out.println("-----------------------");
    System.out.println("1. Show Menu");
    System.out.println("2. Exit");
    mainMenuDetails();
  }
/**
 * mainMenuDetails method  process the option selected from main menu.
 */
  private void mainMenuDetails() {
    try {
      System.out.println("Enter your choice:");
      int menuOption = option.nextInt();
      switch (menuOption) {
        case 1:
          showFullMenu();
          break;
        case 2:
          Runtime.getRuntime().halt(0);
        default:
          System.out.println("Choose either 1 or 2");
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("enter a valid value");
    }
    option.nextLine();
    mainMenu();
  }
/**
 * showFullMenu method  display the menu item stored in database.
 */
  private void showFullMenu() {
    Menu[] menu = MenuFactory.showMenu();
    System.out.println("Menu_Id"+"\t"+"FOOD_NAME");
    for (Menu m : menu) {
      System.out.println(m.getFoodId()+"\t"+ m.getFOOD_ITEMNAME());
    }
  }
/**
 * main method  is the basic entry point for the application.
 * @param args used to get the user input.
 */
  public static void main(final String[] args) {
    final CliMain mainObj = new CliMain();
    mainObj.mainMenu();
  }
}
