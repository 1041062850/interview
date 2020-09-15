package com.company.interview.exception;

import java.io.FileNotFoundException;

/**
 * @Description TODO
 * @Author 计算机171 戴启东
 * @Date 2020/9/6 23:37
 */
public class ErrorAndException {
    private void throwError(){
        throw new StackOverflowError();
    }

    private void throwRuntimeException(){
        throw new RuntimeException();
    }

    private void throwCheckedException() throws FileNotFoundException {
        throw  new FileNotFoundException();
    }

    public static void main(String[] args) throws FileNotFoundException {
        ErrorAndException errorAndException = new ErrorAndException();
        //errorAndException.throwError();
        //errorAndException.throwRuntimeException();
        errorAndException.throwCheckedException();
    }
}
