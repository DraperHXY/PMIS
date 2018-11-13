package com.draper.service;

import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.util.encoders.Hex;
import org.springframework.stereotype.Component;

@Component
public class MD5Service {

    public String cipher(String plainText) {
        MD5Digest md5Digest = new MD5Digest();
        byte[] cipherBytes = new byte[md5Digest.getDigestSize()];
        md5Digest.doFinal(cipherBytes, 0);
        md5Digest.update(plainText.getBytes(), 0, plainText.getBytes().length);
        String cipherText = Hex.toHexString(cipherBytes);
        return cipherText;
    }

}
