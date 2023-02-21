package com.example.customizedexception.servicesimpl;

import com.example.customizedexception.entity.EntityNumber;
import com.example.customizedexception.exception.NotAllowedException;
import com.example.customizedexception.services.NumberService;
import org.springframework.stereotype.Service;

@Service
public class NumberServiceImpl implements NumberService {

    @Override
    public String calculator(EntityNumber num) {
        int d=num.getA();
        int e=num.getB();
        int c=num.getF();
        String s=num.getS();
        String op=num.getOperation();

        int val;
        if(!s.equals("Calculator")){
            throw new NotAllowedException("You are not allowed to this operation");
        }
        if(op.equals("plus")||op.equals("minus")||op.equals("mult")||op.equals("divide")) {
            if (op.equals("plus")) {
                val = d + e;
            } else if (op.equals("minus")) {
                val = d - e;
            } else if (op.equals("mult")) {
                val = d * e;
            } else {
                if (c == 0) {
                    throw new ArithmeticException();
                }
                val = (d + e) / c;
            }
            return "Output is "+ val;
        }
        throw new NotAllowedException("You are not allowed to perform operation");

    }

}
