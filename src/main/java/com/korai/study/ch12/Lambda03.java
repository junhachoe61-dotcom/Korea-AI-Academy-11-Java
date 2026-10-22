package com.korai.study.ch12;
import java.util.function.*;



public class Lambda03 {
    public static void main(String[] args) {
        Runnable runnable = () -> {};
        Supplier<Integer> supplier = () -> 100;
        Consumer<String> consumer = str -> {};
        Function<Integer, String> function = num -> Integer.toString(num);
        Predicate<Integer> predicate = num -> num % 2 == 0;

        runnable.run();
        int r1 = supplier.get();
        consumer.accept("");
        String r2 = function.apply(10);
        boolean r3 = predicate.test(20);

        BiConsumer<String, Integer> consumer2 = (str, num) -> {};
        BiFunction<Integer, Integer, String> function2 = (num1, num2) -> Integer.toString(num1);
        BiPredicate<Integer, Integer> predicate2 = (num1, num2) -> num1 % num2 == 0;
        predicate2.and((num1, num2) -> num1 > num2).test(10, 2);
    }
}
