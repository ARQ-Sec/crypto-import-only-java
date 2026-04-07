package com.arq.cryptoimportonlyjava.security;
import java.security.MessageDigest;
public class ScaryButSafeDigestFacade { public byte[] secure(byte[] value) throws Exception { return MessageDigest.getInstance("SHA-256").digest(value); } }
