package com.kts.apr.lectureTwo.service;

import com.kts.apr.lectureTwo.request.*;

import java.math.BigDecimal;
import java.util.Scanner;

public class bankOperationService {

    private static String name;
    private static String bvn;
    private static String pin;
    private static String address;
    private static String id;
    private static String signature;
    private static String accountNumber;
    private static String accountClass;
    private static BigDecimal accountBalance;
    private static String accountType;
    private static String mobile;

    public static void main(String[] args) {

        System.out.println("Welcome to Leo World Bank");
        System.out.println("*****************************");
        System.out.println();
        bankLogo();
        System.out.println();
        System.out.println("*****************************");
        System.out.println("How many we be of service?...");

        System.out.println("*****************************");
        System.out.println("       Create Account       ");
        System.out.println("Enter Name ...");
        Scanner enterParameters = new Scanner(System.in);
        name = enterParameters.next();
        System.out.println();
        System.out.println("Enter BVN ...");
        bvn = enterParameters.next();
        System.out.println();
        System.out.println("Enter PIN ...");
        pin = enterParameters.next();
        System.out.println();
        System.out.println("Enter Address ...");
        address = enterParameters.next();
        System.out.println();
        System.out.println("Enter id ...");
        id = enterParameters.next();
        System.out.println();
        System.out.println("Enter Signature ...");
        signature = enterParameters.next();
        System.out.println();
        System.out.println("Generate Address ...");
        accountNumber = enterParameters.next();
        System.out.println();
        System.out.println("Enter Address ...");
        accountClass = enterParameters.next();
        System.out.println();
        System.out.println("Show Account Balance ...");
        accountBalance = enterParameters.next();
        System.out.println();
        System.out.println("Enter Account Type ...");
        accountType = enterParameters.next();
        System.out.println();
        System.out.println("Enter Mobile ...");
        mobile = enterParameters.next();


    }

    public static void bankLogo() {

        System.out.println("$$        ");
        System.out.println("$$        ");
        System.out.println("$$        ");
        System.out.println("$$        ");
        System.out.println("$$$$$$$$$$");
    }

    public static void availableServices() {

        System.out.println("A. CREATE ACCOUNT");
        System.out.println("B. CHECK BALANCE");
        System.out.println("C. WITHDRAW");
        System.out.println("D. DEPOSIT");
        System.out.println("E. NAME ENQUIRY");
        System.out.println("F. MOBILE TOP UP");
        System.out.println("G. BILLS PAYMENT");
        System.out.println("H. HISTORY");
    }

    public static CreateAccount toCreateAccount(

            String name,
            String bvn,
            String pin,
            String address,
            String id,
            String signature,
            String accountNumber,
            String accountClass,
            BigDecimal accountBalance,
            String accountType,
            String mobile) {
        CreateAccount createAccount = new CreateAccount(); // Created an instance of CreateAccount
        createAccount.setName(name);
        createAccount.setBvn(bvn);
        createAccount.setPin(pin);
        createAccount.setAddress(address);
        createAccount.setId(id);
        createAccount.setSignature(signature);
        createAccount.setAccountNumber(accountNumber);
        createAccount.setAccountClass(accountClass);
        createAccount.setAccountBalance(accountBalance);
        createAccount.setAccountType(accountType);
        createAccount.setMobile(mobile);
        System.out.println("******************************");
        System.out.println("       Account Details       ");

        System.out.println("Customer Name : " + createAccount.getName());
        System.out.println("Customer BVN : " + createAccount.getBvn());
        System.out.println("Customer PIN : " + createAccount.getPin());
        System.out.println("Customer Address : " + createAccount.getAddress());
        System.out.println("Customer ID : " + createAccount.getId());
        System.out.println("Customer Signature : " + createAccount.getSignature());
        System.out.println("Customer Account Number : " + createAccount.getAccountNumber());
        System.out.println("Customer Account Class : " + createAccount.getAccountClass());
        System.out.println("Customer Account Balance : " + createAccount.getAccountBalance());
        System.out.println("Customer Account Type : " + createAccount.getAccountType());
        System.out.println("Customer Mobile : " + createAccount.getMobile());
        System.out.println("*****************************");
        return createAccount;
    }

    public static BillPaymentRequest toRequestBillPayment(

            String biller,
            String type,
            BigDecimal amount,
            String product,
            String pin) {
        BillPaymentRequest billPaymentRequest = new BillPaymentRequest(); // Created an instance of CreateAccount
        billPaymentRequest.setBiller(biller);
        billPaymentRequest.setType(type);
        billPaymentRequest.setPin(pin);
        billPaymentRequest.setAmount(amount);
        billPaymentRequest.setProduct(product);
        System.out.println("*****************************");
        System.out.println("       Bill Payment Details       ");

        System.out.println("Biller : " + billPaymentRequest.getBiller());
        System.out.println("Biller Type : " + billPaymentRequest.getType());
        System.out.println("Payment Amount : " + billPaymentRequest.getAmount());
        System.out.println("Product : " + billPaymentRequest.getProduct());
        System.out.println("PIN : " + billPaymentRequest.getPin());
        System.out.println("*****************************");
        return billPaymentRequest;
    }

    public static HistoryRequest toRequestHistory(

            String accountNumber) {
        HistoryRequest historyRequest = new HistoryRequest(); // Created an instance of CreateAccount
        historyRequest.setAccountNumber(accountNumber);
        System.out.println("*****************************");
        System.out.println("       Payment History      ");

        System.out.println("Account Number : " + historyRequest.getAccountNumber());
        System.out.println("*****************************");
        return historyRequest;
    }


    public static MobileTopUpRequest topRequestMobileTopU(

            String biller,
            String type,
            BigDecimal amount,
            String mobile,
            String pin) {
        MobileTopUpRequest mobileTopUpRequest = new MobileTopUpRequest(); // Created an instance of CreateAccount
        mobileTopUpRequest.setBiller(biller);
        mobileTopUpRequest.setType(type);
        mobileTopUpRequest.setPin(pin);
        mobileTopUpRequest.setAmount(amount);
        mobileTopUpRequest.setMobile(mobile);
        System.out.println("*****************************");
        System.out.println("       Mobile Top Up       ");

        System.out.println("Biller : " + mobileTopUpRequest.getBiller());
        System.out.println("Biller Type : " + mobileTopUpRequest.getType());
        System.out.println("Payment Amount : " + mobileTopUpRequest.getAmount());
        System.out.println("Product : " + mobileTopUpRequest.getMobile());
        System.out.println("PIN : " + mobileTopUpRequest.getPin());
        System.out.println("*****************************");
        return mobileTopUpRequest;
    }

    public static NameEnquiryRequest toRequestNameEnquiry(

            String accountNumber) {
        NameEnquiryRequest nameEnquiryRequest = new NameEnquiryRequest(); // Created an instance of CreateAccount
        nameEnquiryRequest.setAccountNumber(accountNumber);
        System.out.println("*****************************");
        System.out.println("       Name Enquiry      ");

        System.out.println("Account Number : " + nameEnquiryRequest.getAccountNumber());
        System.out.println("*****************************");
        return nameEnquiryRequest;
    }

}
