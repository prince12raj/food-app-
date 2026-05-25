package com.example.demo.count;
public class Logic
{
    public static double countTotal(double price, int quantity)
    {
        return price * quantity;
    }

    public static double applyCoupon(double totalAmount, String couponCode, String itemName) {
        if (couponCode == null || couponCode.trim().isEmpty()) {
            return totalAmount;
        }
        String code = couponCode.trim().toUpperCase();
        if (code.equals("WELCOME10")) {
            return totalAmount * 0.9;
        } else if (code.equals("FIESTA50")) {
            if (totalAmount >= 150) {
                return Math.max(0, totalAmount - 50);
            }
        } else if (code.equals("BIRYANI20")) {
            if (itemName != null && itemName.toLowerCase().contains("biryani")) {
                return totalAmount * 0.8;
            }
        }
        return totalAmount;
    }
}