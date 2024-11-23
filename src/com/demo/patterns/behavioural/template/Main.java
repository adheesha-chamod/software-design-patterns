package com.demo.patterns.behavioural.template;

public class Main {
    public static void main(String[] args) {
        Task task1 = new TransferMoneyTask();
        task1.execute();

        Task task2 = new GenerateReportTask();
        task2.execute();
    }
}
