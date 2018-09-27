package com.hazelcast;

import java.util.Map;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class Member2 {
    public static void main(String[] args) {
        // Starting a Hazelcast node
        HazelcastInstance node = Hazelcast.newHazelcastInstance();

        // Create a Hazelcast backed map
        Map<Integer, String> map = node.getMap("kevin");

        // Get key 42 from the map and store the value
        int key = 55;
        String result = map.get(key);
        // Print the result to the console
        System.out.println(result);
    }
}
