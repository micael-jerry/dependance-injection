package com.example.demo.abstractClass;

import com.example.demo.concreteDependance.ConcreteDependance1;
import com.example.demo.concreteDependance.ConcreteDependance2;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractClass1 {
    private ConcreteDependance1 concreteDependance1;
    private ConcreteDependance2 concreteDependance2;

}
