
package com.hexaware.MLP192.model;
import java.util.Objects;

/**
 * Menu class used to display menu information.
 * @author hexware
 */
public class Menu {
  /**
   * foodId,foodItemName,foodItemAmt,cusId.
   */
  private int foodId;
  private String foodItemName;
  private Float foodItemAmt;
  private int cusId;
  /**
   * Default Constructor.
   */
  public Menu() {

  }
/**
 * @param argfoodId to initialize food id.
 * @param argfoodItemName to initialize food name.
 * @param argfoodItemAmt to initialize food amount.
 * @param argcusId to initialize customer Id.
 * used to get details through constructor.
 */
  public Menu(final int argfoodId, final String argfoodItemName, final float argfoodItemAmt, final int argcusId) {
    this.foodId = argfoodId;
    this.foodItemName = argfoodItemName;
    this.foodItemAmt = argfoodItemAmt;
    this.cusId = argcusId;
  }

  @Override
  public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Menu menu = (Menu) obj;
    if (Objects.equals(foodId, menu.foodId) || Objects.equals(foodItemName, menu.foodItemName)
        || Objects.equals(foodItemAmt, menu.foodItemAmt) || Objects.equals(cusId, menu.cusId)) {
      return true;
    }
    return false;
  }

  @Override

     public final int hashCode() {
    return Objects.hash(foodId, foodItemName, foodItemAmt, cusId);
  }
/**
* @return this food Id.
*/
  public final int getfoodId() {
    return foodId;
  }
  /**
* @return this food Item name.
*/
  public final String getfoodItemName() {
    return foodItemName;
  }
/**
* @return this food amrt.
*/
  public final Float getfoodItemAmt() {
    return foodItemAmt;
  }
/**
* @return this cus Id.
*/
  public final int getcusId() {
    return cusId;
  }
  /**
   * @param argfoodId gets the food id.
   */
  public final void setfoodId(final int argfoodId) {
    this.foodId = argfoodId;
  }
  /**
   * @param argfoodItemName gets the food name.
   */
  public final void setfoodItemName(final String argfoodItemName) {
    this.foodItemName = argfoodItemName;
  }
  /**
   * @param argfoodItemAmt gets the food amount.
   */
  public final void setfoodAmt(final float argfoodItemAmt) {
    this.foodItemAmt = argfoodItemAmt;
  }
  /**
   * @param argcusId gets the customer Id.
   */
  public final void setcusId(final int argcusId) {
    this.cusId = argcusId;

  }
}
