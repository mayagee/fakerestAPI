package com.projectname.e2e.tests.data.enums;

import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public enum PaymentMethode {
    WIRE_BANK_TRANSFER("Wire Bank Transfer"),
    DEFAULT("Use default (Set pre order)");
    private  final  String  paymentMethode;

    PaymentMethode(String paymentMethode) {
        this.paymentMethode = paymentMethode;
    }

    public static String getRandomPaymentMethode() {
        List<PaymentMethode> paymentMethode = new ArrayList<>();
        paymentMethode.add(PaymentMethode.WIRE_BANK_TRANSFER);
        paymentMethode.add(PaymentMethode.DEFAULT);
        return String.valueOf(paymentMethode.get(RandomUtils.nextInt(0, paymentMethode.size() - 1)));
    }
}
