package com.max.gc;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class BenchmarkRunner {
    public static void main(String[] args) throws RunnerException {
        var opt = new OptionsBuilder()
                .include(BenchmarkExample.class.getSimpleName())
                .build();
        new Runner(opt).run();
    }
}
