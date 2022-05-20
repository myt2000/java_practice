package com.streamapi;

import org.junit.Test;

import java.util.stream.Stream;

public class StreamUnlimited {
    // 方式四：创建无限流
    @Test
    public void test4() {
    // 迭代
    // public static<T> Stream<T> iterate(final T seed, final
    // UnaryOperator<T> f)
        Stream<Integer> stream = Stream.iterate(0, x -> x + 2);
        stream.limit(10).forEach(System.out::println);
    // 生成
    // public static<T> Stream<T> generate(Supplier<T> s)
        Stream<Double> stream1 = Stream.generate(Math::random);
        stream1.limit(10).forEach(System.out::println);

    }
}
