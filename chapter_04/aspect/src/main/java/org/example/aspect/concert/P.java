package org.example.aspect.concert;

import org.springframework.stereotype.Service;

@Service
public class P implements Performance {
    @Override
    public void perform() {
        System.out.println("======>");
    }
}
