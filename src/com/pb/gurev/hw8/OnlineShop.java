package com.pb.gurev.hw8;

public class OnlineShop {
    public static void main(String[] args) throws Exception
    Auth auth = new Auth();
    try {
        auth.signUp();
    catch (WrongLoginException ex1)  {
            ex1.printStackTrace();
        }
        auth.SignIn();{
        catch (WrongPasswordException ex2) }
        ex1.printStackTrace();}


}

