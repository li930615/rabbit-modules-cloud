package com.rabbit.ucenter.util;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * @ClassName Md5Util
 * @Description TODO
 * @Author LZQ
 * @Date 2019/1/29 21:27
 **/
public class Md5Util {

    public static String getMD5(String str)
    {
        try
        {
            MessageDigest md = MessageDigest.getInstance("MD5");

            md.update(str.getBytes());

            return new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {
            e.printStackTrace();
        }return null;
    }
}
