package com.Blockhain.Microservice.blockchain;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/hyperledger-web3j/web3j/tree/main/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 1.6.2.
 */
@SuppressWarnings("rawtypes")
public class SimpleStringStorage extends Contract {
    public static final String BINARY = "6080604052348015600e575f5ffd5b506106e68061001c5f395ff3fe608060405234801561000f575f5ffd5b506004361061003f575f3560e01c806302dd56d0146100435780631bb8305d14610061578063dcb21d121461007d575b5f5ffd5b61004b61009b565b6040516100589190610237565b60405180910390f35b61007b60048036038101906100769190610394565b610126565b005b610085610138565b6040516100929190610237565b60405180910390f35b5f80546100a790610408565b80601f01602080910402602001604051908101604052809291908181526020018280546100d390610408565b801561011e5780601f106100f55761010080835404028352916020019161011e565b820191905f5260205f20905b81548152906001019060200180831161010157829003601f168201915b505050505081565b805f908161013491906105e1565b5050565b60605f805461014690610408565b80601f016020809104026020016040519081016040528092919081815260200182805461017290610408565b80156101bd5780601f10610194576101008083540402835291602001916101bd565b820191905f5260205f20905b8154815290600101906020018083116101a057829003601f168201915b5050505050905090565b5f81519050919050565b5f82825260208201905092915050565b8281835e5f83830152505050565b5f601f19601f8301169050919050565b5f610209826101c7565b61021381856101d1565b93506102238185602086016101e1565b61022c816101ef565b840191505092915050565b5f6020820190508181035f83015261024f81846101ff565b905092915050565b5f604051905090565b5f5ffd5b5f5ffd5b5f5ffd5b5f5ffd5b7f4e487b71000000000000000000000000000000000000000000000000000000005f52604160045260245ffd5b6102a6826101ef565b810181811067ffffffffffffffff821117156102c5576102c4610270565b5b80604052505050565b5f6102d7610257565b90506102e3828261029d565b919050565b5f67ffffffffffffffff82111561030257610301610270565b5b61030b826101ef565b9050602081019050919050565b828183375f83830152505050565b5f610338610333846102e8565b6102ce565b9050828152602081018484840111156103545761035361026c565b5b61035f848285610318565b509392505050565b5f82601f83011261037b5761037a610268565b5b813561038b848260208601610326565b91505092915050565b5f602082840312156103a9576103a8610260565b5b5f82013567ffffffffffffffff8111156103c6576103c5610264565b5b6103d284828501610367565b91505092915050565b7f4e487b71000000000000000000000000000000000000000000000000000000005f52602260045260245ffd5b5f600282049050600182168061041f57607f821691505b602082108103610432576104316103db565b5b50919050565b5f819050815f5260205f209050919050565b5f6020601f8301049050919050565b5f82821b905092915050565b5f600883026104947fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff82610459565b61049e8683610459565b95508019841693508086168417925050509392505050565b5f819050919050565b5f819050919050565b5f6104e26104dd6104d8846104b6565b6104bf565b6104b6565b9050919050565b5f819050919050565b6104fb836104c8565b61050f610507826104e9565b848454610465565b825550505050565b5f5f905090565b610526610517565b6105318184846104f2565b505050565b5b81811015610554576105495f8261051e565b600181019050610537565b5050565b601f8211156105995761056a81610438565b6105738461044a565b81016020851015610582578190505b61059661058e8561044a565b830182610536565b50505b505050565b5f82821c905092915050565b5f6105b95f198460080261059e565b1980831691505092915050565b5f6105d183836105aa565b9150826002028217905092915050565b6105ea826101c7565b67ffffffffffffffff81111561060357610602610270565b5b61060d8254610408565b610618828285610558565b5f60209050601f831160018114610649575f8415610637578287015190505b61064185826105c6565b8655506106a8565b601f19841661065786610438565b5f5b8281101561067e57848901518255600182019150602085019450602081019050610659565b8683101561069b5784890151610697601f8916826105aa565b8355505b6001600288020188555050505b50505050505056fea26469706673582212206acccf580d832afde32c2dba88abe772396871bc495bf528cee26e5187df1ec164736f6c634300081c0033";

    private static String librariesLinkedBinary;

    public static final String FUNC_GETSTOREDSTRING = "getStoredString";

    public static final String FUNC_STORESTRING = "storeString";

    public static final String FUNC_STOREDSTRING = "storedString";

    @Deprecated
    protected SimpleStringStorage(String contractAddress, Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected SimpleStringStorage(String contractAddress, Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected SimpleStringStorage(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected SimpleStringStorage(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<String> getStoredString() {
        final Function function = new Function(FUNC_GETSTOREDSTRING, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> storeString(String _newString) {
        final Function function = new Function(
                FUNC_STORESTRING, 
                Arrays.<Type>asList(new Utf8String(_newString)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> storedString() {
        final Function function = new Function(FUNC_STOREDSTRING, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    @Deprecated
    public static SimpleStringStorage load(String contractAddress, Web3j web3j,
            Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new SimpleStringStorage(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static SimpleStringStorage load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new SimpleStringStorage(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static SimpleStringStorage load(String contractAddress, Web3j web3j,
            Credentials credentials, ContractGasProvider contractGasProvider) {
        return new SimpleStringStorage(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static SimpleStringStorage load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new SimpleStringStorage(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<SimpleStringStorage> deploy(Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        return deployRemoteCall(SimpleStringStorage.class, web3j, credentials, contractGasProvider, getDeploymentBinary(), "");
    }

    @Deprecated
    public static RemoteCall<SimpleStringStorage> deploy(Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(SimpleStringStorage.class, web3j, credentials, gasPrice, gasLimit, getDeploymentBinary(), "");
    }

    public static RemoteCall<SimpleStringStorage> deploy(Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(SimpleStringStorage.class, web3j, transactionManager, contractGasProvider, getDeploymentBinary(), "");
    }

    @Deprecated
    public static RemoteCall<SimpleStringStorage> deploy(Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(SimpleStringStorage.class, web3j, transactionManager, gasPrice, gasLimit, getDeploymentBinary(), "");
    }

//    public static void linkLibraries(List<Contract.LinkReference> references) {
//        librariesLinkedBinary = linkBinaryWithReferences(BINARY, references);
//    }

    private static String getDeploymentBinary() {
//        if (librariesLinkedBinary != null) {
//            return librariesLinkedBinary;
//        } else {
            return BINARY;
//        }
    }
}
