package com.demo.patterns.behavioural.template;

public class GenerateReportTask extends Task {

    @Override
    protected void doExecute() {
        System.out.println("Generate report");
    }
}
