package org.example;

import java.util.HashMap;
import java.util.Map;

public class KeyValuePairExample {
    public static void main(String[] args) {
        // 创建一个键值对类型的容器，使用HashMap作为实现
        Map<String, Integer> keyValuePairs = new HashMap<>();

        // 添加键值对
        keyValuePairs.put("one", 1);
        keyValuePairs.put("two", 2);
        keyValuePairs.put("three", 3);

        // 获取值
        int value = keyValuePairs.get("two");
        System.out.println("The value associated with 'two' is: " + value);

        // 遍历键值对
        for (Map.Entry<String, Integer> entry : keyValuePairs.entrySet()) {
            String key = entry.getKey();
            int val = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + val);
        }
    }
}
