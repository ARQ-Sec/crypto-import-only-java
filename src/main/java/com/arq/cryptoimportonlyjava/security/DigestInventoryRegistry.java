package com.arq.cryptoimportonlyjava.security;
import java.security.MessageDigest;
public class DigestInventoryRegistry { public String supported() throws Exception { return MessageDigest.getInstance("SHA-256").getAlgorithm(); } }
