package com.arq.cryptoimportonlyjava.security;
import java.security.MessageDigest;
public class LegacyRequestSigner { public byte[] sign(byte[] value) throws Exception { return MessageDigest.getInstance("MD5").digest(value); } }
