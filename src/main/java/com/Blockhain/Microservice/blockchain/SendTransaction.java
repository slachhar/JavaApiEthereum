package com.Blockhain.Microservice.blockchain;

import com.Blockhain.Microservice.blockchain.contracts.IntegerStorage;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.gas.StaticGasProvider;

import java.math.BigInteger;

// Working code
public class SendTransaction {
    public static void storeValue(long value) throws Exception {
        // Connect to Ethereum node
        Web3j web3j = Web3j.build(new HttpService("http://127.0.0.1:8545"));

        // Get client version
        Web3ClientVersion web3ClientVersion = web3j.web3ClientVersion().send();
        System.out.println("Connected to Ethereum client: " + web3ClientVersion.getWeb3ClientVersion());

        String privateKey = "0x551f18194d7ed0554acebfef71a4b0557ecf6e22479fce7b24ffaf7ab86c148a"; // Replace with your private key

        // Load the wallet securely
       // String privateKey = System.getenv("PRIVATE_KEY"); // Store securely
        Credentials credentials = Credentials.create(privateKey);

        String contractAddress = "0x9208e2025f6b833f4e68ea05FE4C34Ac3db374eA"; // Replace with your contract's deployed address

        // Define gas settings
        StaticGasProvider gasProvider = new StaticGasProvider(BigInteger.valueOf(20000000000L), BigInteger.valueOf(1000000));

        // Load the contract
        IntegerStorage contract = IntegerStorage.load(contractAddress, web3j, credentials, gasProvider);

        // Call storeData(int) function
        BigInteger valueToSend = BigInteger.valueOf(value);
        TransactionReceipt transactionReceipt = contract.storeInteger(valueToSend).send();

        // Print receipt details
        System.out.println("Transaction Hash: " + transactionReceipt.getTransactionHash());
        System.out.println("Block Number: " + transactionReceipt.getBlockNumber());
        System.out.println("From: " + transactionReceipt.getFrom());
        System.out.println("To: " + transactionReceipt.getTo());
        System.out.println("Gas Used: " + transactionReceipt.getGasUsed());
        System.out.println("Status: " + transactionReceipt.getStatus());

        var  data = contract.getAllStoredValues().send();

        System.out.println("Got Data : " + data);

    }
}
