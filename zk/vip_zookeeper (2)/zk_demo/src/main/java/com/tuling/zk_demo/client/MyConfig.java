package com.tuling.zk_demo.client;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class MyConfig {
    private String key;
    private String name;
}
