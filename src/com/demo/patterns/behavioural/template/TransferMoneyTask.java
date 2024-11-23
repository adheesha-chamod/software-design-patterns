package com.demo.patterns.behavioural.template;

public class TransferMoneyTask extends Task {

    @Override
    protected void doExecute() {
        System.out.println("Transfer money");
    }
}
