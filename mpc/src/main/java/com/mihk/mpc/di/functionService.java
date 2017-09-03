package com.mihk.mpc.di;

import org.springframework.stereotype.Service;

@Service
public class functionService {
 public String sayHello(String name) {
     return "hello," + name;
 }
}
