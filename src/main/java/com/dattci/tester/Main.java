package com.dattci.tester;

import io.jsonwebtoken.Jwts;

public class Main {
    public static void main(String[] args) {

    String secret =
        java.util.Base64.getEncoder()
            .encodeToString(
                Jwts.SIG.HS256
                    .key()
                    .build()
                    .getEncoded()
            );

    System.out.println(secret);
    }
}
