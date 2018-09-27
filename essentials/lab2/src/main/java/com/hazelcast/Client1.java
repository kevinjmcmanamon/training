package com.hazelcast;

import java.util.Map;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;

public class Client1 {
    public static void main(String[] args) {
        // Create Hazelcast instance which is backed by a client
    	HazelcastInstance client = HazelcastClient.newHazelcastClient();

        // Create a Hazelcast backed map
        Map<Integer, String> map = client.getMap("kevin");

        // Write the 1000 elements to the map
        for (int i = 0; i < 1000; i++) {
            int key = i;
            String value = "value-" + String.valueOf(i);

            // Put the entry into the map
            map.put(key, value);
        }
    }
}
