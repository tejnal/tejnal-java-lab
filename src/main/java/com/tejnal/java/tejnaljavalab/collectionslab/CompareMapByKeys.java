package com.tejnal.java.tejnaljavalab.collectionslab;


import org.springframework.boot.context.event.ApplicationReadyEvent;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompareMapByKeys {

    public Map<String, String>  clientMap() {

        Map<String, String> bankNames   = new LinkedHashMap<>();

        bankNames.put("0021", "tej");
        bankNames.put("0031", "ABN Amro");
        bankNames.put("0161", "Van Lanschot Bankiers");
        bankNames.put("0511", "Triodos Bank");
        bankNames.put("0721", "ING");
        bankNames.put("0751", "SNS Bank");
        bankNames.put("0761", "ASN Bank");
        bankNames.put("0771", "Regiobank");
        bankNames.put("0801", "knab");
        bankNames.put("0802", "bunq");
        bankNames.put("0804", "Handelsbanken");
        bankNames.put("0805", "Revolut");
        bankNames.put("0806", "Johny");

        Map<String, String> finalBankNames   = new LinkedHashMap<>();

        finalBankNames.put("0021", "Rabobank");
        finalBankNames.put("0721", "ING");
        finalBankNames.put("0031", "ABN Amro");
        finalBankNames.put("0751", "SNS Bank");
        finalBankNames.put("0761", "ASN Bank");
        finalBankNames.put("0771", "Regiobank");
        finalBankNames.put("0511", "Triodos Bank");
        finalBankNames.put("0801", "knab");
        finalBankNames.put("0802", "bunq");
        finalBankNames.put("0161", "Van Lanschot Bankiers");
        finalBankNames.put("0804", "Handelsbanken");
        finalBankNames.put("0805", "Revolut");

        Map<String, String> map3   = new LinkedHashMap<>();

        if (bankNames.size() != finalBankNames.size() ||  areEqual(finalBankNames, bankNames) == Boolean.FALSE) {

            map3.putAll(bankNames);
            map3.putAll(finalBankNames);

            System.out.println("map: " + map3);
          return map3;
        }

        System.out.println("final list : " + map3);

        areEqual(finalBankNames, bankNames);

        return null;

    }


    private boolean areEqual(Map<String, String> first, Map<String, String> second) {

        for (Entry<String, String> e : first.entrySet()) {
            if (!e.getValue().equals(second.get(e.getKey()))) {
                return false;
            }
        }
        return true;
    }
}
