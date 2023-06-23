package com.tschumin.java_memory.Java_Memory.check_heap;

public class HeapSizeExample {
    public static void main(String[] args) {
        long maxHeapSize = Runtime.getRuntime().maxMemory();
        System.out.println("Максимальный размер памяти heap: " + maxHeapSize + " байт");
        System.out.println("Максимальный размер памяти heap: " + (maxHeapSize / 1024) + " Килобайт");
        System.out.println("Максимальный размер памяти heap: " + (maxHeapSize / 1024 / 1024) + " Мегабайт");
        System.out.println("Максимальный размер памяти heap: " + (maxHeapSize / 1024 / 1024 / 1024) + " Гигабайт");
    }
}
