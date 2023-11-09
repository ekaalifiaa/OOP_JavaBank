/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasjavabank;

/**
 *
 * @author Dell 7300
 */
public class Account implements InterfaceBankAccount {
    private String accountName;
    private int accountNum;
    private int balance;

    public Account() {
        accountName = "EMPTY";
        accountNum = 0;
        balance = 0;
    }

    public Account(String name, int num, int amt) {
        accountName = name;
        accountNum = num;
        balance = amt;
    }

    public void deposit(int amt) {
        balance = balance + amt;
    }

    public void withdraw(int amt) {
        balance = balance - amt;
    }

    public void setAccountName(String name) {
        accountName = name;
    }

    public void setAccountNum(int num) {
        accountNum = num;
    }

    public void setBalance(int amt) {
        balance = amt;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public int getBalance() {
        return balance;
    }

    public void print() {
        System.out.println("Bank Name : " + getBankName());
        System.out.println("Account Holder : " + accountName);
        System.out.println("Account Number : " + accountNum);
        System.out.println("Account Balance : " + balance);
    }

    public String getBankName() {
        return InterfaceBankAccount.BANK;
    }
}